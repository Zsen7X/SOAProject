package Main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class PersonController {
	
	@GetMapping
	String getPerson(Model model) {
		model.addAttribute("something","this is Controller5555");
		return "people";
	}
	
}
