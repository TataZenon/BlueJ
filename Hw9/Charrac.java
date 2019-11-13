
public class Charrac {

	private int hp;
	String name;
        String pname;
	Boolean gender;
        public Charrac(){

        }
        
	public void setName(String name){
		this.name = name;
	}
        
        public void setPname(String pname){
		this.pname = pname;
	}

	public void setGender(boolean gender){
		this.gender = gender;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}

	public String getName(){
		return this.name;
	}
        public String getpName(){
		return this.pname;
                
        }
	public boolean getGender(){
		return this.gender ;
	}

	public int getHp(){
		return this.hp ;
	}

}
