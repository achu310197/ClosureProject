package Client;


import java.util.List;
import java.util.Scanner;

import BusinessLogic.AdminBL;
import BusinessLogic.AdmminBLImpl;
import BusinessLogic.CitizenBL;
import BusinessLogic.CitizenBLImpl;
import Model.Address;
import Model.Citizen;


public class Client {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("1. Admin");
		System.out.println("2. Citizen");
		System.out.println("Enter your choice : ");
		int choice = scanner.nextInt();
		
		switch(choice) {
			
		case 1: System.out.println("Enter Id: ");
		int id = scanner.nextInt();
		System.out.println("Enter Password: ");
		String password = scanner.next();
		AdminBL adminBl = new AdmminBLImpl();
		boolean status = adminBl.adminLoginBL(id, password);
		if(status) {
			System.out.println("Id: "+id);
			System.out.println("Password Type: "+password instanceof String);
			System.out.println("Password: "+password);
			System.out.println("Status: "+status);
			System.out.println("Welcome to Admin Home Page!!!");
			System.out.println("Press Yes to View All Citizens");
			String choiceAdmin = scanner.next();
			if(choiceAdmin.equalsIgnoreCase("yes")||choiceAdmin.equalsIgnoreCase("y")) {
				List<Citizen> citizens = adminBl.viewCitizensBL();
				System.out.println(citizens);
			}
			else {
				System.out.println("Try again!!!");
			}
		}
		else {
			System.out.println("Id: "+id);
			System.out.println("Password Type: "+password instanceof String);
			System.out.println("Password: "+password);
			System.out.println("Status: "+status);
			System.out.println("Wrong Credentials, Try Again!!!");
		}
			break;
		
		case 2: 
			System.out.println("1. Login");
			System.out.println("2. Register");
			System.out.println("Enter your choice: ");
			int choiceCitizen = scanner.nextInt();
			CitizenBL citizenBl = new CitizenBLImpl();
			
			switch (choiceCitizen) {
			case 2: Citizen citizen = new Citizen();
				Address address = new Address();
				System.out.println("Enter id: ");
				citizen.setId(scanner.nextInt());
				System.out.println("Enter name: ");
				citizen.setName(scanner.next());
				System.out.println("Enter fatherName: ");
				citizen.setFatherName(scanner.next());
				System.out.println("Enter motherName: ");
				citizen.setMotherName(scanner.next());
				System.out.println("Enter city: ");
				address.setCity(scanner.next());
				System.out.println("Enter houseNo: ");
				address.setHouseNo(scanner.next());
				System.out.println("Enter street: ");
				address.setStreet(scanner.next());
				System.out.println("Enter zip: ");
				address.setZip(scanner.next());
				System.out.println("Enter dob: ");
				citizen.setDob(scanner.next());
				System.out.println("Enter bloodGroup: ");
				citizen.setBloodGroup(scanner.next());
				System.out.println("Enter password: ");
				citizen.setPassword(scanner.next());
				System.out.println("Enter telNo: ");
				address.setTelNo(scanner.next());
				System.out.println("Enter state: ");
				address.setState(scanner.next());
				citizen.setAddress(address);
				citizenBl.citizenRegisterBL(citizen);
				
				
				break;

			default:
				break;
			}
		default:
			break;
		
		}
		
		
	}
}
