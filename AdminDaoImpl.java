package Persistence;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import Helpers.DbHelper;
import Model.Admin;
import Model.Citizen;

public class AdminDaoImpl implements AdminDao {

	Session session;
	org.hibernate.Transaction transaction;
	Query query;

	public boolean adminLogin(int id, String password) {
		session = DbHelper.getSession();
		transaction = session.beginTransaction();
		query = session.createQuery("from Admin  where id = :id and password = :password ");
		query.setParameter("id", id);
		query.setParameter("password", password);
		transaction.commit();
		Admin status;
		try {
			
			status = (Admin)query.getSingleResult();
			System.out.println(status);
			System.out.println("I am try block");
		} catch (Exception e) {
			System.out.println("Exception is : " + e);
			System.out.println("I am catch block");
			return false;
		}
		if (!(status == null))
			return true;
		else {
			return false;
		}
	}

	public List<Citizen> viewCitizens() {
		session = DbHelper.getSession();
		transaction = session.beginTransaction();
		query = session.createQuery("select id, name from Citizen");
		transaction.commit();
		List<Citizen> citizens;
		try {
			citizens = ((List<Citizen>)query.getResultList());
			System.out.println(citizens.toString());
			for (Citizen citizen : citizens) {
				System.out.println(citizen);
			}
			System.out.println(citizens);
			System.out.println("I am try block");
		} catch (Exception e) {
			System.out.println("Exception is : " + e);
			System.out.println("I am catch block");
			return null;
		}
		return citizens;
	}

	public void adminLogout() {
		// TODO Auto-generated method stub

	}

}
