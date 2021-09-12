package fi.viikko2.week2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import fi.viikko2.week2.domain.Student;

@Controller
public class StudentController {
	
	
	@RequestMapping("/students")
	public String showStudens(Model model) {
		
		ArrayList<Student> studentsList = new ArrayList<>();
		
		studentsList.add(new Student("Sini", "Salo"));
		studentsList.add(new Student("Jani", "Keto"));
		studentsList.add(new Student("Tiia", "Loki"));
		
		
		model.addAttribute("students", studentsList);
		return "studentlist";
}
}