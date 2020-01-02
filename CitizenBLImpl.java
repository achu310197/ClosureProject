package BusinessLogic;

import Model.Citizen;
import Persistence.CitizenDao;
import Persistence.CitizenDaoImpl;

public class CitizenBLImpl implements CitizenBL {
	
	CitizenDao citizenDao = new CitizenDaoImpl();

	public void citizenRegisterBL(Citizen citizen) {
		citizenDao.citizenRegister(citizen);
	}

	public void citizenLoginBL(int id, String password) {
		// TODO Auto-generated method stub

	}

	public Citizen viewProfileBL(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void doBankTransactionsBL(int id) {
		// TODO Auto-generated method stub

	}

	public void doElectricityBillPaymentBL(int id) {
		// TODO Auto-generated method stub

	}

	public void doRtoPaymentBL(int id) {
		// TODO Auto-generated method stub

	}

	public void doGasBillPaymentBL(int id) {
		// TODO Auto-generated method stub

	}

	public void citizenLogoutBL() {
		// TODO Auto-generated method stub

	}

}
