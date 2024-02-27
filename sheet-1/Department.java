
public class Department {

	private String deptName;
	private  int numOfStudents;
	private  int numOfInstructors;
	private Instructor[] inst;
	
	//Constructor 1
	public Department(String name, int numS, int size) {
		deptName=name;
		numOfStudents=numS;
		inst=new Instructor[size];
		numOfInstructors=0;
	}
	//Constructor 2
	public Department(Department dept) {
		deptName=dept.getDeptName();
		numOfStudents=dept.getNumOfStudents();
		numOfInstructors=dept.getNumOfInstructors();
	//	for(int i=0;i<numOfInstructors;i++)
			
	}
	
	public boolean addInstructor(Instructor ins) {
		boolean Instructoradded=false;
		if(numOfInstructors<inst.length) {
			inst[numOfInstructors++]=ins;
			Instructoradded=true;
		}
		return Instructoradded;
	}
	
	public String toString() {
		String info="deptName: "+deptName+"numOfStudents: "+numOfStudents;
		for(int i=0;i<numOfInstructors;i++) {
			info+=inst[i].getId()+inst[i].getName();
		}
		return info;
	}

	
	//setters & getters
	public String getDeptName() {
		return deptName;
	}

	public int getNumOfInstructors() {
		return numOfInstructors;
	}


	public void setNumOfInstructors(int numOfInstructors) {
		this.numOfInstructors = numOfInstructors;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public int getNumOfStudents() {
		return numOfStudents;
	}


	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}
	
	
	
}
