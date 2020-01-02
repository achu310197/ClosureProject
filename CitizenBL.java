package BusinessLogic;

import Model.Citizen;

public interface CitizenBL {
	public void citizenRegisterBL(Citizen citizen);
	public void citizenLoginBL(int id, String password);
	public Citizen viewProfileBL(int id);
	public void doBankTransactionsBL(int id);
	public void doElectricityBillPaymentBL(int id);
	public void doRtoPaymentBL(int id);
	public void doGasBillPaymentBL(int id);
	public void citizenLogoutBL();
}
