package org.prac;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Scanner;

import org.prac.dao.StudentDAO;
import org.prac.implementations.StudentDaoImpl;
import org.prac.models.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	private StudentDAO studentDAO;
	private void getAllStudents() {
		System.out.println("The students are:\n");
		int loop=0;
		for(Student student:this.studentDAO.getAllStudents()) {
			System.out.println(++loop+". "+student);
		}
	}
	
	public void getStudent(Scanner scan) {
		System.out.println("\nEnter the id:");
		String id=scan.next();
		System.out.println("\n"+this.studentDAO.getStudent(id));
	}
	
	public void addStudent(Scanner scan) {
		System.out.println("\nEnter the id:");
		String id=scan.next();
		System.out.println("\nEnter the fName:");
		String fName=scan.next();
		System.out.println("\nEnter the lName:");
		String lName=scan.next();
		System.out.println("\nEnter the address:");
		String address=scan.next();
		boolean result=this.studentDAO.addStudent(new Student.StudentBuilder()
				.setId(id)
				.setfName(fName)
				.setlName(lName)
				.setAddress(address)
				.build());
		if(result) {
			System.out.println("\nAdded!");
		}else {
			System.out.println("\nAlready there!");
		}
		
	}
	
	public void updateStudent(Scanner scan) {
		System.out.println("\nEnter the id:");
		String id=scan.next();
		System.out.println("\nEnter the fName:");
		String fName=scan.next();
		System.out.println("\nEnter the lName:");
		String lName=scan.next();
		System.out.println("\nEnter the address:");
		String address=scan.next();
		boolean result=this.studentDAO.updateStudent(new Student.StudentBuilder()
				.setId(id)
				.setfName(fName)
				.setlName(lName)
				.setAddress(address)
				.build());
		if(result) {
			System.out.println("\nUpdated!");
		}else {
			System.out.println("\nNot there!");
		}
	}
	
	public void deleteStudent(Scanner scan) {
		System.out.println("\nEnter the id:");
		String id=scan.next();
		boolean result=this.studentDAO.deleteStudent(id);
		if(result) {
			System.out.println("\nDeleted!");
		}else {
			System.out.println("\nNot there!");
		}
	}
	
	public static void main( String[] args )
	{
		App app=new App();
		app.studentDAO=new StudentDaoImpl();
		
		boolean exit=false;
		while(!exit) {
			System.out.println("\nPlease enter the choice:"
					+ "\n  1. Get all students"
					+ "\n  2. Get a student with a id"
					+ "\n  3. Add a student"
					+ "\n  4. Update a student"
					+ "\n  5. Delete a student"
					+ "\n  6. Exit");
			Scanner scan=new Scanner(System.in);
			int choice=scan.nextInt();
			switch(choice) {
				case 1: app.getAllStudents();break;
				case 2: app.getStudent(scan);break;
				case 3: app.addStudent(scan);break;
				case 4: app.updateStudent(scan);break;
				case 5: app.deleteStudent(scan);break;
				case 6: exit=true;
			}
		}
	}
}
