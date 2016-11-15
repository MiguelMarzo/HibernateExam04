package org.marzo.hibernate.exam04.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.marzo.hibernate.exam04.HibernateSession;
import org.marzo.hibernate.exam04.models.Passenger;

public class PassengerDAO implements PassengerDAOInterface {

	/* 
	 * selects one passenger by Id
	 * @param id
	 * @return passenger
	 */
	public Passenger selectById(Long id) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Passenger passenger = (Passenger) session.get(Passenger.class, id);
	    
	    session.close();
	    return passenger;
	}

	/*
	 * retrieves all passengers from db
	 * @return List of passengers
	 */
	public List<Passenger> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Passenger> passengers = session.createQuery("from Passenger").list();
	    
	    session.close();
	    return passengers;
	}

	/*
	 * inserts a new passenger in database
	 * retrieves generated id and sets to passenger instance
	 * @param new passenger
	 */
	public void insert(Passenger passenger) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	
	    session.persist(passenger);
	         
	    session.getTransaction().commit();
	    session.close();

	}

	/*
	 * updates passenger
	 * @param passenger to update
	 */
	public void update(Passenger passenger) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(passenger);
		 
		    session.getTransaction().commit();
		    session.close();
	}

	/*
	 * delete given passenger
	 * @param passenger to delete
	 */
	public void delete(Passenger passenger) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(passenger);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
