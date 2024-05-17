package com.uce.edu.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.repository.modelo.MatriculaTemporal;
import com.uce.edu.repository.modelo.MatricularEstudiante;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;
import com.uce.edu.service.IEstudianteService;
import com.uce.edu.service.IMateriaService;
import com.uce.edu.service.IMatriculaService;

//http://localhost:8080/matriculas/

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private IMatriculaService iMatriculaService;

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IMateriaService iMateriaService;

	@GetMapping("/nueva")
	private String nuevaMatricula(MatricularEstudiante matricula) {
		return "vistaNuevaMatricula";
	}

	@PostMapping("/guardar")
	private String matricular(MatriculaTemporal matriculaTemporal) {
		Estudiante estudiante = this.estudianteService.buscarPorCedula(matriculaTemporal.getCedula());
		Materia materia1 = this.iMateriaService.buscarPorCodigo(matriculaTemporal.getCodigoMateria1());
		Materia materia2 = this.iMateriaService.buscarPorCodigo(matriculaTemporal.getCodigoMateria2());
		Materia materia3 = this.iMateriaService.buscarPorCodigo(matriculaTemporal.getCodigoMateria3());
		Materia materia4 = this.iMateriaService.buscarPorCodigo(matriculaTemporal.getCodigoMateria4());

		List<Materia> materias = new ArrayList<>();
		materias.add(materia1);
		materias.add(materia2);
		materias.add(materia3);
		materias.add(materia4);

		for (Materia m : materias) {
			MatricularEstudiante matricularEstudiante = new MatricularEstudiante();
			matricularEstudiante.setEstudiante(estudiante);
			matricularEstudiante.setMateria(m);
			matricularEstudiante.setFechaMaricula(LocalDateTime.now());
			this.iMatriculaService.matricular(matricularEstudiante);
		}
		return "redirect:matriculas/nueva";
	}

	@GetMapping("/reporte")
	private String listadoMaterias(Model model) {
		List<MatriculaDTO> listado = this.iMatriculaService.reporte();
		model.addAttribute("matriculas", listado);
		return "vistaListadoMatriculas";
	}

}
