package com.uce.edu.repository;

import java.util.List;

import com.uce.edu.repository.modelo.MatricularEstudiante;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;

public interface IMatriculaRepository {
	public void insertar(MatricularEstudiante matricular);

	public List<MatriculaDTO> reporte();
}
