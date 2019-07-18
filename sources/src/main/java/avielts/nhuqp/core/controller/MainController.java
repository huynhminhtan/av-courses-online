package avielts.nhuqp.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import avielts.nhuqp.core.model.UserEntity;
import avielts.nhuqp.core.repository.UserRepository;

@Controller
@RequestMapping(path="/config")
public class MainController {
	@Autowired

	private UserRepository userRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody
    String addNewUser (@RequestParam String name
			, @RequestParam String email) {

		System.out.println(name);
		System.out.println(email);
//
//		UserEntity n = new UserEntity();
//		n.setName(name);
//		n.setEmail(email);
//		userRepository.save(n);
		return "Saved";
	}

	@PostMapping(path="/add")
	public @ResponseBody
	String addNewUserPost (@RequestParam String name
			, @RequestParam String email) {

		System.out.println(name);
		System.out.println(email);
//
//		UserEntity n = new UserEntity();
//		n.setName(name);
//		n.setEmail(email);
//		userRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody
    Iterable<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}
}
