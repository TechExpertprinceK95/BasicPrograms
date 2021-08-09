package Basic2;

import java.util.*;

public class ComparableSortById {
	public static void main(String[] args) {
		System.out.println("Employee Information*********");
		TreeSet set = new TreeSet();
		set.add(new Employee(101,"Prince","ppr@kk.com",787878L));
		set.add(new Employee(108,"Ravindra","ppr@kk.com",787878L));
		set.add(new Employee(105,"paras","ppr@kk.com",787878L));
		set.add(new Employee(103,"ram","ppr@kk.com",787878L));
		set.add(new Employee(107,"kamal","ppr@kk.com",787878L));
		Iterator it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	}	
	class Employee implements Comparable{
		int eid;
		String ename;
		String email;
	    long phone;
	    
	    Employee(int eid,String ename,String email,long phone)
	    {
	    	this.eid = eid;
	    	this.ename = ename;
	    	this.email = email;
	    	this.phone = phone;
	    }
	    
	    public int compareTo(Object obj)
	    {
	    	if(obj instanceof Employee)
	    	{
	    		Employee emp = (Employee)obj;
	            return this.eid - emp.eid;
	    	}
	    	return 0;
	    }
	    public String toString() {
			return eid + "\t" +ename+ "\t" +email+ "\t" +phone;
	    	
	    }
	    
	}
