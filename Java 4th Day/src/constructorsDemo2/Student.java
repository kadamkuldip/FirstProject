package constructorsDemo2;

public class Student extends Person {
	
	long rollno;
	String course;	
	Student (int tid, String tname, String tdob, String taddress, long tno, String tcourse){
		super(tid, tname, tdob, taddress); // Parameterized Super()
		
		rollno = tno;
		course = tcourse;
		
	}

}
