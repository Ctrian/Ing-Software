package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Pago;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class PagoRepositoryImpl implements IPagoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Pago pago) {
		// TODO Auto-generated method stub
		this.entityManager.persist(pago);
	}

}
