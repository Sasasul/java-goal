
public class Instructor {

	private String Name;
	private  String id;
	
	public Instructor(String name, String idNum) {
		
	}
	public String toSting() {
		String info="Name: "+Name+"id: "+id;
		return info;
	}
	
	
	//Setters&getters
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
