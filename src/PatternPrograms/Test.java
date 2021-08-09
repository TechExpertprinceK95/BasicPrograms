package PatternPrograms;

public class Test {
	public static void main(String[] args) {
		Student st1 = new Student(101,"Prince");
		Student st2 = new Student(101,"Prince");
		Student st3 = new Student(104,"Pawan");
		Student st4 = st1;
		System.out.println(st1.equals(st2));
	}
		
	}
	
	
	
	
	
	class Student{
		int sid;
		String sname;
		Long phone;
        Student(int sid, String sname) {
			this.sid = sid;
			this.sname = sname;

		}
		
	}
		
		