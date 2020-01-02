package BusinessLogic;

import java.util.List;

import Model.Citizen;

public interface AdminBL {
	public boolean adminLoginBL(int id, String password);
	public List<Citizen> viewCitizensBL();
	public void adminLogoutBL();
}
