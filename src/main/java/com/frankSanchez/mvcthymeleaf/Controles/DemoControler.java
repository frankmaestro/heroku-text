package com.frankSanchez.mvcthymeleaf.Controles;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.frankSanchez.mvcthymeleaf.modelo.Usuario;

@Controller
public class DemoControler {

	@GetMapping
	public String index(Model modelo) {
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario(1, "usuario 1", "fran sanchez"));
		usuarios.add(new Usuario(2, "usuario 2", "carlos andres sanchez"));
		usuarios.add(new Usuario(3, "usuario 3", "luiz rodriguez"));
		usuarios.add(new Usuario(4, "usuario 4", "felipe cerlo sanchez"));
		
		modelo.addAttribute("tamano", usuarios.size());
		modelo.addAttribute("usuarios", usuarios);
		
		return "index";
	}
}
