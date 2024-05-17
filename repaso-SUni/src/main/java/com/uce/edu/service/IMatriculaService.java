package com.uce.edu.service;

import java.util.List;

import com.uce.edu.repository.modelo.MatricularEstudiante;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;

public interface IMatriculaService {
	public void matricular(MatricularEstudiante matricularEstudiante);

	public List<MatriculaDTO> reporte();
}
