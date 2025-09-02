public class java_polymorphism_oops {


    static int sum(int a , int b){
        return a + b;
    }

    static float sum(float a , float b){
        return a + b;
    }

    static int sum(int a , int b , int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,4));
        System.out.println(sum((float)1.5,(float)3.5));
        System.out.println(sum(2,1,2));

        Deer d = new Deer();
        d.eat();

        

        


    }
}


// METHOD OVERRIDING

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
