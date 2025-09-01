public class java_inherit_oops {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        System.out.println(dolphin.color);
        dolphin.eat();
        dolphin.breath();
        System.out.println(dolphin.fing);
        dolphin.swims();
        dolphin.jump();

        // Hierarchial Inheritance

        Bird eagle = new Bird();

        System.out.println(eagle.color);
        eagle.eat();
        eagle.breath();
        eagle.Fly();


        Camel camel = new Camel();

        System.out.println(camel.color);
        camel.eat();
        camel.breath();
        camel.walk();


    }
}  

class Animal {
    String color = "white";

    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breath");
    }
}


class Fish extends Animal {
    int fing = 2;

    void swims(){
        System.out.println("it can swim");
    }
} 

class Dolphin extends Fish {                        // MULTI LEVEL INHERITANCE

    void jump(){
        System.out.println("THEY CAN JUMP");
    }
}


// HIERARCHIAL INHERITANCE

class Bird extends Animal{                              
    void Fly(){
        System.out.println("THEY CAN FLY");
    }
}

class Camel extends Animal{
    void walk(){
        System.out.println("THEY CAN WALK ON DESSERTS");
    }
}

