public class MainGreet
{   static String name = "Player1" ; //กำหนดชื่อ Player
    static String pname = "Cat"; //กำหนดชื่อสัตว์เลี้ยง
    static Boolean gender; //เพศ
    static double time; //เวลา

    public void setName(String name) { 
        this.name = name ;
    }
    public void setPname(String pname) { 
        this.pname = pname ;
    }
    public void setGender(Boolean gender) {
        this.gender = gender ;
    }
    public void setTime() { 
        this.time = time ;
    }

   public static String getName() {  
       return name ;
    } 
    public static String getPname() {  
       return pname ;
    } 
    public static Boolean getGender() {  
       return gender ;
    } 
    public static Double getTime(){  
       return time ;
    } 
   
}
