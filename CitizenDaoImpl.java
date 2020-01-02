package Persistence;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Helpers.DbHelper;
import Model.Citizen;

public class CitizenDaoImpl implements CitizenDao {

	Session session;
	Transaction transaction;
	Query query;
	
	public void citizenRegister(Citizen citizen) {
		session = DbHelper.getSession();
		transaction = session.beginTransaction();		
		Citizen citizenData = citizen;
		session.save(citizenData);
		transaction.commit();
		System.out.println("Registered Successfully");
	}

	public void citizenLogin(int id, String password) {
		// TODO Auto-generated method stub

	}

	public Citizen viewProfile(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void doBankTransactions(int id) {
		// TODO Auto-generated method stub

	}

	public void doElectricityBillPayment(int id) {
		// TODO Auto-generated method stub

	}

	public void doRtoPayment(int id) {
		// TODO Auto-generated method stub

	}

	public void doGasBillPayment(int id) {
		// TODO Auto-generated method stub

	}

	public void citizenLogout() {
		// TODO Auto-generated method stub

	}

}
