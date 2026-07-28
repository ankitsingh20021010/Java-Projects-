
public class Student {
    String Student_id;
    String name;
    int age;
    String course;
    float marks; 
    void info(){
        System.out.println("Student id:"+ Student_id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+ age);
        System.out.println("Course: "+ course);
        System.out.println("Makrs: "+marks);
        System.out.println("--------");
    }
    void update_marks(float a){
        marks=a;
        System.out.println("marks update:"+ marks);
    }
    void result(){
        if(marks>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
