package com.bismillah.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bismillah.model.Siswa;
import com.bismillah.services.SiswaService;

@Service
public class SiswaDao implements SiswaService{
	
	private EntityManagerFactory emf;
	
	@Autowired
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}



	@Override
	public List<Siswa> DaftarSiswa(){
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Siswa", Siswa.class).getResultList();
	}
	
	@Override
	public Siswa SaveOrUpdate(Siswa siswa) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Siswa saved = em.merge(siswa);
		em.getTransaction().commit();
		return saved;
		
	}
	
	@Override
	public Siswa getIdSiswa(Integer id) {
		EntityManager em = emf.createEntityManager();
		return em.find(Siswa.class, id);
	}
	
	@Override
	public void hapus(Integer id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.remove(em.find(Siswa.class, id));
		em.getTransaction().commit();
	}
	
}
