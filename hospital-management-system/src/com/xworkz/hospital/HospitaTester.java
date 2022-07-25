package com.xworkz.hospital;

import java.util.Scanner;

import com.xworkz.hospital.crud.Hospital;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;

class HospitaTester
{
	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no Patient is added ");
		int size = sc.nextInt();
		Hospital hos = new HospitalImpl(size);

		for(int i=0; i<size ; i++)
		{
			PatientDTO dto = new PatientDTO();
			System.out.println("Enter the Patient id ");
			int  id = sc.nextInt();

			System.out.println("Enter the Patient name ");
			String name = sc.next();



			System.out.println("Enter the Patient contactNo ");
			long contactNo = sc.nextLong();

			System.out.println("Enter the Patient Address ");
			String address = sc.next();

			dto.setId(id);
			dto.setName(name);

			//dto.setGender(Gender);
			dto.setContactNo(contactNo);
			dto.setAddress(address );
			hos.creatPatient(dto);

		}
		String option = null;
		do{
			System.out.println("Enter 1 to fetch all the Patients");
			System.out.println("Enter 2 to update patient's Address");
			System.out.println("Enter 3 to update patient's contact No");
			System.out.println("Enter 4 to delete Patient Details By Name");
			System.out.println("Enter 5 to get Patient name By Id1");
			System.out.println("Enter the Choise No.");
			int choise= sc.nextInt();

			switch(choise)
			{
			case 1:	hos.getPatientDetails();
			break;
			case 2://invoking updatePatientAddressById method
				System.out.println("enter the existing ID for address has to be updated");
				int existingID =  sc.nextInt();

				System.out.println("enter the adress to be updated");
				String updatedAddress = sc.nextLine();
				hos.updatePatientAddressById(existingID,updatedAddress); 
				break;

			case 3://invoking updatePatientContactNoByName method
				System.out.println("enter the existing Name for contactNo has to be Updeted");
				String existingName = sc.nextLine();

				System.out.println("enter the contactNo to be updated");
				long updatedContactNo =sc.nextLong();   

				hos.updatePatientContactNoByName(existingName,updatedContactNo);
				break;

			case 4:
				System.out.println("enter the  name to be deleted");
				String name1 = sc.next();

				hos.deletePatientDetailsByName(name1);
				break;
			case 5:
				System.out.println("enter the id ");
				int id= sc.nextInt();
				hos.getPatientNameByID(id);

				break; 
			default: System.out.println("Given the choise cannot be delivered");
			break;
			}

			System.out.println("Do you want to continue Y/N");
			option = sc.next();
		}while(option.equals("Y"));
		
		sc.close();

	}

}
