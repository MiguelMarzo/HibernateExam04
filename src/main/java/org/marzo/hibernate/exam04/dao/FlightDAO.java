package org.marzo.hibernate.exam04.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.marzo.hibernate.exam04.HibernateSession;
import org.marzo.hibernate.exam04.models.Flight;

public class FlightDAO implements FlightDAOInterface {

	/* 
	 * selects one flight by Id
	 * @param id
	 * @return flight
	 */
	public Flight selectById(Long id) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    Flight flight = (Flight) session.get(Flight.class, id);
	    
	    session.close();
	    return flight;
	}

	/*
	 * retrieves all flights from db
	 * @return List of flights
	 */
	public List<Flight> selectAll() {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	 
	    List<Flight> flight = session.createQuery("from Flight").list();
	    
	    session.close();
	    return flight;
	}

	/*
	 * inserts a new flight in database
	 * @param new flight
	 */
	public void insert(Flight flight) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.beginTransaction();
	 
	    session.persist(flight);    
	    
	    session.getTransaction().commit();	         
	    session.close();

	}

	/*
	 * updates flight
	 * @param flight to update
	 */
	public void update(Flight flight) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		    Session session = sessionFactory.openSession();	 
		    session.beginTransaction();
		 
		    session.merge(flight); 
		    
		    session.getTransaction().commit();		 
		    session.close();
	}

	/*
	 * delete given person
	 * @param person to delete
	 */
	public void delete(Flight person) {
	    SessionFactory sessionFactory = HibernateSession.getSessionFactory();
	    Session session = sessionFactory.openSession();	    
	    session.beginTransaction();
	    
	    session.delete(person);
	 
	    session.getTransaction().commit();
	    session.close();
	}

}
