class Student {
    private String name;
    private String course;
    private int sid;

    public Student(String name, String course, int sid) {
        super();
        this.name = name;
        this.course = course;
        this.sid = sid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int){
        
    }
}

public class StudentMain {
    public static void main(String[] args) {
       Student s1 = new Student("Student","MCA",1);
       s1.setsid(2);
       System.out.println("Sid = " + s1.getSid());
       System.out.println("Name = " + s1.getName());
       System.out.println("Course = " + s1.getCourse()); 
    }
}
