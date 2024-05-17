package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	//@Transactional(value = TxType.MANDATORY)
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante selesccionarPorCedula(String cedula) {
		TypedQuery<Estudiante> mQ = this.entityManager
				.createQuery("SELECT e FROM Estudiante e WHERE e.cedula =: cedula", Estudiante.class);
		mQ.setParameter("cedula", cedula);
		return mQ.getSingleResult();
	}

}
