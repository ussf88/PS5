package com.health.Ehealth.Controller;
import java.util.HashSet;
import com.health.Ehealth.DAO.*;
import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.EquipeCoach;
import com.health.Ehealth.Entities.EquipeNutritionniste;
import com.health.Ehealth.Entities.Joueur;
import com.health.Ehealth.Entities.Nutritionniste;
import com.health.Ehealth.Service.CoachService;
import com.health.Ehealth.Service.EquipeNutritionnisteService;
import com.health.Ehealth.Service.JoueurService;
import com.health.Ehealth.Service.NutritionnisteService;
import com.health.Ehealth.modal.*;
import com.health.Ehealth.security.*;
import com.health.Ehealth.security.payloads.JwtResponse;
import com.health.Ehealth.security.payloads.LoginRequest;
import com.health.Ehealth.security.payloads.MessageResponse;
import com.health.Ehealth.security.payloads.SignupRequest;
import com.health.Ehealth.security.service.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	JoueurService joueurService;
	
	@Autowired
	CoachService coachService;
	
	@Autowired
	NutritionnisteService nutritionnisteService;
	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;
	private Joueur save;
	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);
		
		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();		
		List<String> roles = userDetails.getAuthorities().stream()
				.map(item -> item.getAuthority())
				.collect(Collectors.toList());
		System.out.println("=====================>"+roles.get(0));
		User user=null;
		switch(roles.get(0)) {
		case "JOUEUR":
			user = joueurService.findById(userDetails.getId());break;
		case "COACH":
			user = coachService.findById(userDetails.getId());break;
		case "NUTRITIONNISTE":
			user = nutritionnisteService.findById(userDetails.getId());break;
		}
		return ResponseEntity.ok(new JwtResponse(jwt, user));
	}
	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody Joueur joueur) {
		Set<Role> roles = new HashSet<>();
		Role JRole = roleRepository.findByName(ERole.JOUEUR);
		roles.add(JRole);
		User user=new User(joueur.getUsername(),joueur.getEmail(),joueur.getPassword(),roles);
		
		if (userRepository.existsByUsername(user.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Username is already taken!"));
		}

		if (userRepository.existsByEmail(user.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Email is already in use!"));
		}
				 user.setPassword(encoder.encode(user.getPassword()));

			
			    user.setRoles(roles);
			    Joueur j=new Joueur(user,joueur.getFirstName(), joueur.getLastName(), joueur.getEquipeCoach(),
						joueur.getEquipeNutritionniste());
			    joueurService.save(j);

				return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
				
				}
	@PostMapping("/signup/coach")
	public ResponseEntity<?> registerUser(@Valid @RequestBody Coach coach) {
		Set<Role> roles = new HashSet<>();
		Role JRole = roleRepository.findByName(ERole.COACH);
		roles.add(JRole);
		User user=new User(coach.getUsername(),coach.getEmail(),coach.getPassword(),roles);
		
		if (userRepository.existsByUsername(user.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Username is already taken!"));
		}

		if (userRepository.existsByEmail(user.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Email is already in use!"));
		}
				 user.setPassword(encoder.encode(user.getPassword()));

			
			    user.setRoles(roles);
			    Coach c=new Coach(user,coach.getFirstName(),coach.getLastName(),coach.getEquipe());
			    coachService.save(c);

				return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
				
				}
	
	@PostMapping("/signup/nutritionniste")
	public ResponseEntity<?> registerUser(@Valid @RequestBody Nutritionniste nutritionniste) {
		Set<Role> roles = new HashSet<>();
		Role JRole = roleRepository.findByName(ERole.NUTRITIONNISTE);
		roles.add(JRole);
		User user=new User(nutritionniste.getUsername(),nutritionniste.getEmail(),nutritionniste.getPassword(),roles);
		
		if (userRepository.existsByUsername(user.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Username is already taken!"));
		}

		if (userRepository.existsByEmail(user.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Email is already in use!"));
		}
				 user.setPassword(encoder.encode(user.getPassword()));

			
			    user.setRoles(roles);
			    Nutritionniste c=new Nutritionniste(user,nutritionniste.getFirstName(),nutritionniste.getLastName(),nutritionniste.getEquipe());
			    nutritionnisteService.save(c);

				return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
				
				}
		
	}
	
	
