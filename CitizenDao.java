package Persistence;

import Model.Citizen;

public interface CitizenDao {
	public void citizenRegister(Citizen citizen);
	public void citizenLogin(int id, String password);
	public Citizen viewProfile(int id);
	public void doBankTransactions(int id);
	public void doElectricityBillPayment(int id);
	public void doRtoPayment(int id);
	public void doGasBillPayment(int id);
	public void citizenLogout();
}
