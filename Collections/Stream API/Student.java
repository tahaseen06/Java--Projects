package streamapi;

public class Student {
	 int rollNo;
	    String name;
	    int mark;

	    Student(int rollNo, String name, int mark) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.mark = mark;
	    }

	    public String toString() {
	        return rollNo + " " + name + " " + mark;
	    }
}
