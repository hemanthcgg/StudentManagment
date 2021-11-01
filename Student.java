public class Student {
    int id;
    String name,dept;
    Student(int id,String name,String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }
    public void display() {
        System.out.println(id+" "+name+" "+dept);
    }
}
