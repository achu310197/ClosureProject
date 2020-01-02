package BusinessLogic;

import java.util.List;

import Model.Citizen;
import Persistence.AdminDao;
import Persistence.AdminDaoImpl;

public class AdmminBLImpl implements AdminBL {

	AdminDao adminDao = new AdminDaoImpl();
	
	public boolean adminLoginBL(int id, String password) {
		boolean status = adminDao.adminLogin(id, password); 
		System.out.println("Status from BL: "+status);
		return status;
	}

	public List<Citizen> viewCitizensBL() {
		List<Citizen> citizens = adminDao.viewCitizens();
		return citizens;
	}

	public void adminLogoutBL() {
		// TODO Auto-generated method stub

	}

}
