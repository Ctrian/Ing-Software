package com.uce.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.service.IMateriaService;

//	http://localhost:8080/materias/

@Controller
@RequestMapping("/materias")
public class MateriaController {

	@Autowired
	private IMateriaService iMateriaService;

	@GetMapping("/registrarMateria")
	private String paginaNuevoEstudiante(Materia materia) {
		return "vistaNuevaMateria";
	}

	@PostMapping("/insertarMateria")
	private String nuevoEstudiante(Materia materia) {
		this.iMateriaService.guardar(materia);
		return "redirect:/materias/registrarMateria";
	}
}
