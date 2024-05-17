package com.uce.edu.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IEstudianteRepository;
import com.uce.edu.repository.IMateriaRepository;
import com.uce.edu.repository.IMatriculaRepository;
import com.uce.edu.repository.modelo.Estudiante;
import com.uce.edu.repository.modelo.Materia;
import com.uce.edu.repository.modelo.MatricularEstudiante;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	
	@Autowired
	private IEstudianteService estudianteService;

	@Override
	public void matricular(MatricularEstudiante matricula) {
		Thread hilo = Thread.currentThread();
		String nombreHilo = hilo.getName();

		matricula.setFechaMaricula(LocalDateTime.now());
		Estudiante estudiante = this.estudianteService.buscarPorCedula(matricula.getEstudiante().getCedula());
		
		matricula.setEstudiante(estudiante);
		
		this.iMatriculaRepository.insertar(matricula);

	}

	@Override
	public List<MatriculaDTO> reporte() {
		return this.iMatriculaRepository.reporte();
	}

	
	
}
