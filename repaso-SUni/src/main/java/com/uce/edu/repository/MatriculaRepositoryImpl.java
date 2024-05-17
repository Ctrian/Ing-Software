package com.uce.edu.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.MatricularEstudiante;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(MatricularEstudiante matricular) {
		this.entityManager.persist(matricular);
	}

	@Override
	public List<MatriculaDTO> reporte() {
		TypedQuery<MatriculaDTO> mQ = this.entityManager.createQuery(
				"SELECT new com.uce.edu.repository.modelo.dto.MatriculaDTO(m.estudiante.cedula, m.materia.codigo, m.fecha, m.nombreHilo) m FROM Matricula m",
				MatriculaDTO.class);
		return mQ.getResultList();
	}

}
