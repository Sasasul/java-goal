
public class College {
	private String Name;
	private  int numOfDepartment;
	private Department[] depts;// R Composition 
	
	public College(String name,int size) {
		Name=name;
		depts=new Department[size];
		numOfDepartment=0;
	}

	public boolean isEmpty() {
		if (numOfDepartment==0)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if (numOfDepartment==depts.length)
			return true;
		else
			return false;
		
	}
	
	public boolean addDepartment(Department dept) {
		if(numOfDepartment<depts.length) {
				depts[numOfDepartment++]=dept;
	
		
		System.out.println("dep added sucssesfully");
		return true;}//end if
		else {
			System.out.println("dep added no no no");

			return false;}
		
	}
	
	
	public int searchDepartment(String name){
		int index=0;
		for(int i=0;i<numOfDepartment;i++) {
			if(depts[i].getDeptName()==name) {
				index++;
			}//end if
		}//end for
		return index;
	}
	
	public boolean removeDepartment(String name) {
		boolean depRemoved=false;
		for(int i=0;i<numOfDepartment-1;i++) {
			if(depts[i].getDeptName()==name) {
				depts[i]=depts[i+1];
				depts[--numOfDepartment]=null;
				depRemoved=true;
			}//end if
		}//end for
		return depRemoved;
	}
	
	public int sumOfStudent () {
		int sumOfstd=0;
			for(int i=0;i<numOfDepartment;i++) {
				sumOfstd+=depts[i].getNumOfStudents();
			}//end for
		return sumOfstd;
	}
	public Department[] arrayOfDept ( int sNum) {
		int numOfdebt=0;
		Department[] dept = new Department[numOfdebt];
				
		for(int i=0;i<numOfDepartment;i++){
		if(depts[i].getNumOfStudents()>sNum)
			dept[numOfdebt++]=depts[i];
		}
		return dept ;
	}
	public String toString() {
		String info="Name: "+Name+"\nnumOfDepartment: "+numOfDepartment;
		for(int i=0;i<numOfDepartment;i++) {
			info+="\n"+depts[i].getDeptName()+"\n"+depts[i].getNumOfStudents()+"\n"+depts[i].getNumOfInstructors();
		}
		return info;
	}
	
	//Setters&getters
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Department[] getDepts() {
		return depts;
	}

	public void setDepts(Department[] depts) {
		this.depts = depts;
	}
}
