package pl.coderslab.tweeter.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.tweeter.enities.User;
import pl.coderslab.tweeter.repositories.UserRepository;

@Controller
public class LoginController {

    private final PasswordEncoder passwordEncoder;

    private final UserRepository userRepository;

    @Autowired
    public LoginController(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }


    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute(new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user){
        String username = user.getUsername();
        String email = user.getEmail();
        User alreadyRegisterUser = userRepository.findFirstByUsernameOrEmailAllIgnoreCase(username,email);
        if(alreadyRegisterUser != null){
            return "redirect:/register?alreadyRegister=true";
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "redirect:/login";
    }
}
