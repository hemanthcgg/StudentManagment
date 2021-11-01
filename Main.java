import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> stu=new ArrayList<>();
        while(true){
            System.out.println("Menu Options to choose");
            System.out.print("1 - Creat Student Details\n2 - Display Students Details\n3 - Update the Student Details\n4 - Exit");
            System.out.println();
            int opt=sc.nextInt();
            switch(opt){
                case 1:
                    Add(stu,sc);
                    break;
                case 2:
                    List(stu);
                    break;
                case 3:
                    Updating(stu,sc);
                    break;
                default:
                    break;
            }
            System.out.println();
            if(opt==4) break;
        }
    }
    
   //Student adding to the List
    private static void Add(ArrayList<Student> stu, Scanner sc) {
       System.out.println("Student have following details \'studentId\', \'NAME\', \'DEPARTMENT\'");
        System.out.print("Enter Student Id: ");
        int sId=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String sName=sc.nextLine();
        System.out.print("Enter Student Department: ");
        String sDept=sc.nextLine();
        Student newStu=new Student(sId,sName,sDept);
        stu.add(newStu);
        System.out.println("Added new Student Details "+sId+" "+sName+" "+sDept);
    }

    //Listing all the details
    private static void List(ArrayList<Student> stu) {
        for (Student student : stu) {
            student.display();
        }
    }


    //Updating the Values
    private static void Updating(ArrayList<Student> stu, Scanner sc) {
        System.out.println("Choose\n1 - Using Student id\n2 - Using Student Name");
        int uopt=sc.nextInt();
        sc.nextLine();
        if(uopt==1){
            System.out.print("Enter '\student id\' to update details: ");
            int uid=sc.nextInt();
            update(stu,uid,sc);
        }else{
            System.out.print("Enter \'Student Name\' to update details: ");
            String uid=sc.nextLine();
            update(stu,uid,sc);
        }
    }

    //updating using student id
    private static void update(ArrayList<Student> stu, int uid,Scanner sc) {
        int flag=0;
        for (Student s : stu) {
            if(s.id==uid){
                flag=1;
                System.out.println("Current Details of Student");
                s.display();
                System.out.print("Choose 1 to update Name else 2 to update Department: ");
                int o=sc.nextInt();
                if(o==1){
                    String uval=sc.next();
                    s.name=uval;
                }
                else if(o==2){
                    String uval=sc.next();
                    s.dept=uval;
                }
                else{
                    System.out.println("Check Your option");
                }
                s.display();
            }
        }
        if(flag==0) System.out.println("Entered id isn't present");
    }

    //updating using student name
    private static void update(ArrayList<Student> stu, String uid,Scanner sc) {
        int flag=0;
        for (Student s : stu) {
            if(uid.equals(s.name)){
                flag=1;
                System.out.println("Current Details of Student");
                s.display();
                System.out.print("Choose \n1 to update ID \n2 to update Department");
                int o=sc.nextInt();
                if(o==1){
                    int uval=sc.nextInt();
                    s.id=uval;
                }
                else if(o==2){
                    String uval=sc.next();
                    s.dept=uval;
                }
                else{
                    System.out.println("Check Your option");
                }
                s.display();
            }
        }
        if(flag==0) System.out.println("Entered id isn't present");
    }

    //New Method
}
