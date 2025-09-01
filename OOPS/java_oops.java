public class java_oops {
    public static void main(String[] args) { 
        
        Pen p1 = new Pen(); 

        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("yellow");
        System.out.println(p1.getColor());

        Student s1 = new Student();
        s1.name = "faizan";
        s1.rollno = 14;
        s1.marks = new int[3];
        s1.marks[0] = 100;
        s1.marks[1] = 20;
        s1.marks[2] = 80;


        Student s2 = new Student(s1);     // COPY CONSTRUCTOR
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.marks[2]);
        



    }
}

class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor( String  newColor){
        this.color = newColor;
    }

    void setTip( int newTip){
        this.tip = newTip;
    }
}


class Student {

    String name;
    int rollno;
    int marks[];

    Student(Student s1){            // DEEP COPY
        this.name = s1.name;
        this.rollno = s1.rollno;
        marks = new int[3];
        for(int i = 0 ; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        System.out.println("non parameterized");
    }
}
