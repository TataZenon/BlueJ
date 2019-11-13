public class Noob {
	public String name;
	public int level;
	public static int countA = 0; //เช็ตชื่อ ถ้าไม่มี
	public static int countB = 0; //เช็คเลเวล ถ้าไม่มี
	
	public Noob() { //Default Constructor
		name = "";
		level = 0;
	}
	public Noob(String a, int b) { //Detail Constructor
		name = a;
		level = b;
	}
	public Noob(Noob n) { //Copy Constructor
		name = n.name;
		level = n.level;
	}
	
	public static void findNoob(Noob n[], String s) {
		for(int i = 0; i < n.length; i++) {
			if(n[i].name == s) {
				System.out.println("Noon Name : " + n[i].name + "\tNoob Level : " + n[i].level);
			} else {
				countA++;
			}
		}
		if(countA == 5) {
			System.out.println("Noob Name : " + s + "\tNoob Level : 0");
		}
		System.out.println("*********************************************");
		System.out.println(n[0].name+ " / " +s);
}
	
	public static void findGroupOfNoob(Noob n[], int x) {
		for(int i = 0; i < n.length; i++) {
			if(n[i].level == x) {
				System.out.println("Noob Level : " + n[i].level + "\tNoob Name : " + n[i].name);
			} else {
				countB++;
			}
		}
		if(countB == 5) {
			System.out.println("Not Have Noob Level : " + x);
		}
		System.out.println("*********************************************");
	}
}