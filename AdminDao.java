package Persistence;

import java.util.List;

import Model.Citizen;

public interface AdminDao {
	public boolean adminLogin(int id, String password);
	public List<Citizen> viewCitizens();
	public void adminLogout();
}
