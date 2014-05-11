package dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.Departement;
import model.HibernateUtils;

public class DepartementDao {

	public void add(Departement dep) {
		
		// TODO Auto-generated method stub
		Session session = HibernateUtils.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(dep);
            session.getTransaction().commit();
            session.close();
            System.out.print("bien ajouté");
        } catch (Exception e) {
            System.out.print("erreur insertion" + e.getMessage());
        }
		
		
		
		
	}
	@SuppressWarnings("unchecked")
	public List<Departement> getListDepartement()
	{
		Session session=HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		Query query=session.createQuery("from Departement");
		return query.list();
	}
	
	public Departement getDepartement(int id)
	{
		Session session= HibernateUtils.getSessionFactory().openSession();
		
		session.beginTransaction();
		Query query=session.createQuery("from Departement where id="+id);
		Departement dep=(Departement) query.uniqueResult();
		return dep;
	}

	}

