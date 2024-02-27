
public class staff{
	private String name;
	private int id;

	 public staff(){

		 this(0,"");          

	}

	 

	public staff(int i , String n){

	    name = n;  

	    id = i ;         

	}

	public staff(int i ){

	    name = "";  

	    id = i ;         

	}

	public staff(String n){
		this(0);
//i saw this(0,n);
	}        

	public staff (staff s){
//شفت حل واحد فاهس)(  ففthis(s.id.s.name);
		this(0,"");               

	}
}
