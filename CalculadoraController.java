package pe.edu.tecsup.springweb;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/calculadora")
public class CalculadoraController {

	@GetMapping("/")
	public String index() {
		return "calculadora";
	}
	
	@PostMapping("/calcular")
	public String calcular(Model model,
			@RequestParam("sumando1") Integer sumando1, 
			@RequestParam("sumando2") Integer sumando2) {
		
		Integer resultado = sumando1 + sumando2;
		
		model.addAttribute("resultado", resultado);
		
		return "resultado";
	}
	
	@GetMapping("/configuracion")
	public String config() {
		return "configuracion";
	}
	
}
