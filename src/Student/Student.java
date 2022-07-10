package Student;

import java.util.Scanner;

public class Student {
    String mssv;
    String firstname;
    String lastname;
    String address;
    String gender;
    String email;
    float mark1,mark2,mark3;
    float aver;
	public Student() {
		super();
	}
public Student(String mssv, String firstname, String lastname, String address, String gender,String email,
			    float mark1, float mark2, float mark3, float aver) {
	super();
	this.mssv = mssv;
	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
	this.gender = gender;
	this.email = email;
	this.mark1 = mark1;
	this.mark2 = mark2;
	this.mark3 = mark3;
	this.aver = aver;
	}
public void InputInfo() {
	Scanner input = new Scanner(System.in);
		System.out.println("Input MSSV: ");
		  while(true&&input.hasNextLine()) {
			  String mssvInput = input.nextLine();
			  boolean check = setMssv(mssvInput);
			  if(check) {
				  break;
			  }
		  }
		
		System.out.println("Input First Name: ");
		 while(true&&input.hasNextLine()) {
			  String firstnameInput = input.nextLine();
			  boolean check = setFirstname(firstnameInput);
			  if(check) {
				  break;
			  }
		  }
		 
		 System.out.println("Input Last Name: ");
		 while(true&&input.hasNextLine()) {
			  String lastnameInput = input.nextLine();
			  boolean check = setLastname(lastnameInput);
			  if(check) {
				  break;
			  }
		  }
		
		System.out.println("Input Address: ");
		 while(true&&input.hasNextLine()) {
			  String addressInput = input.nextLine();
			  boolean check = setAddress(addressInput);
			  if(check) {
				  break;
			  }
		  }
		
		System.out.println("Input Gender: ");
		 while(true&&input.hasNextLine()) {
			  String genderInput = input.nextLine();
			  boolean check = setGender(genderInput);
			  if(check) {
				  break;
			  }
		  }
		
		System.out.println("Input Email: ");
		 while(true&&input.hasNextLine()) {
			  String emailInput = input.nextLine();
			  boolean check = setEmail(emailInput);
			  if(check) {
				  break;
			  }
		  }
		
		System.out.println("Input Mark1: ");
		while(true&&input.hasNextLine()) {
			  float Mark1Input = Float.parseFloat(input.nextLine());
			  boolean check = setMark1(Mark1Input);
			  if(check) {
				  break;
			  }
		}
		System.out.println("Input Mark2: ");
		while(true&&input.hasNextLine()) {
			  float Mark2Input = Integer.parseInt(input.nextLine());
			  boolean check = setMark2(Mark2Input);
			  if(check) {
				  break;
			  }
		}
		System.out.println("Input Mark3: ");
		while(true&&input.hasNextLine()) {
			  float Mark3Input = Integer.parseInt(input.nextLine());
			  boolean check = setMark3(Mark3Input);
			  if(check) {
				  break;
			  }
	}
}
public void ShowInfo() {
       System.out.printf("%-10s %-15s %-10s %-10s %-7s %-20s %10s  %10s %10s %10s  \n",
	                     "MSSV","First Name","Last Name","Address","Gender","Email","Mark1","Mark2","Mark3","Aver");
       
       System.out.printf("%-10s %-15s %-10s %-10s %-7s %-20s %10.2f %10.2f %10.2f %10.2f \n",
		mssv,firstname,lastname,
		address,gender,email,
		mark1,mark2,mark3,getAver());
}
public String getMssv() {
		return mssv;
	}
public boolean setMssv(String mssv) {
	if(mssv != null) {
		this.mssv = mssv;
		return true;
		}
		else {
			System.err.println("Input MSSV :");
			return false;
		}
	}
public String getFirstname() {
		return firstname;
	}
public boolean setFirstname(String firstname) {
	if(firstname != null) {
		this.firstname = firstname;
		return true;
		}
		else {
			System.err.println("Input First Name :");
			return false;
		}
	}
public String getLastname() {
	return lastname;
}
public boolean setLastname(String lastname) {
    if(lastname != null) {
	this.lastname = lastname;
	return true;
	}
	else {
		System.err.println("Input Last Name :");
		return false;
	}
}
public String getAddress() {
		return address;
	}
public boolean setAddress(String address) {
	if(address != null) {
		this.address = address;
		return true;
		}
		else {
			System.err.println("Input Address :");
			return false;
		}
	}
public String getGender() {
		return gender;
	}
public boolean setGender(String gender) {
	if(gender != null) {
		this.gender = gender;
		return true;
		}
		else {
			System.err.println("Input Gender:");
			return false;
		}
	}
public String getEmail() {
		return email;
	}
public boolean setEmail(String email) {
	if(email != null && email.contains("@") && !email.contains(" ")) {
		this.email = email;
		return true;
		}
		else {
			System.err.println("Input Email: ");
			return false;
		}
	}
public float getMark1() {
		return mark1;
	}
public boolean setMark1(float mark1) {
	if(mark1 >= 0 && mark1 <= 10) {
		this.mark1 = mark1;
		return true;
		}
		else {
			System.err.println("Input Mark (>=0 & <=10) : ");
			return false;
		}
	}
public float getMark2() {
		return mark2;
	}
public boolean setMark2(float mark2) {
	if(mark2 >= 0 && mark2 <= 10) {
		this.mark2 = mark2;
		return true;
		}
		else {
			System.err.println("Input Mark (>=0 & <=10) : ");
			return false;
		}
	}
public float getMark3() {
		return mark3;
	}
public boolean setMark3(float mark3) {
	if(mark3 >= 0 && mark3 <= 10) {
		this.mark3 = mark3;
		return true;
		}
		else {
			System.err.println("Input Mark (>=0 & <=10) : ");
			return false;
		}
	}  
public float getAver() {
	return aver = (mark1 + mark2 + mark3)/3;
}
public void setAver(float aver) {
	this.aver = aver;
}
public boolean checkScholarship() {
	if(getAver() >=7 && mark1 >=5 && mark2 >=5 && mark3 >=5) {
		return true;
	}
	else 
		return false;
}
}

