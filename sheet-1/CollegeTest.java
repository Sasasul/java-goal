import java.util.Scanner;
public class CollegeTest {
public static void main(String[]args) {
	
	Scanner kb=new Scanner(System.in);
	
	College CCIC=new College("CCIS",4);
	
	Department SWE=new Department("SWE",30,10);
	Department CS=new Department("CS",30,10);
	
	CCIC.addDepartment(SWE);
	CCIC.addDepartment(CS);

	Instructor inst1=new Instructor("Sarah","11");
	Instructor inst2=new Instructor("maysam","12");
	Instructor inst3=new Instructor("naela","13");
	
	SWE.addInstructor(inst1);
	SWE.addInstructor(inst2);
	SWE.addInstructor(inst3);
	
	CS.addInstructor(inst1);
	CS.addInstructor(inst2);
	CS.addInstructor(inst3);

	System.out.println(CCIC.toString());

	System.out.println("please enter department name, number of students and\r\n"
			+ "number of instructors. ");
	String name=kb.nextLine();
	int numOfSTD=kb.nextInt();
	int numOfINST=kb.nextInt();
	
	Department dep1=new Department(name,numOfSTD,numOfINST);
	
	if(CCIC.removeDepartment("SWE")) {
		System.out.println("Department removed Successfully ");
	}
	else
		System.out.println("Department didnt go away ");

	System.out.println("numOf Student in swe"+SWE.getNumOfStudents());
	
	int numOfstudennt=(CCIC.searchDepartment("SWE"));
	
	System.out.println("numOf Student in ccic"+CCIC.sumOfStudent());
	
	//(CCIC.arrayOfDept(20)).getName();
	
}
}
