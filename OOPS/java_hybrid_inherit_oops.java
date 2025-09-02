public class java_hybrid_inherit_oops {
    public static void main(String[] args) {

        System.out.println("FISH CLASS METHODS");
        System.out.println();
        System.out.println("TUNA");
        System.out.println();

        Tuna tuna = new Tuna();

        
        
        tuna.eat();
        tuna.breath();
        tuna.fings();
        tuna.swims();
        tuna.taste();

        System.out.println();
        System.out.println("SHARK");
        System.out.println();

        Shark shark = new Shark();
        
        shark.eat();
        shark.breath();
        shark.fings();
        shark.swims();
        shark.size();

        System.out.println();


        System.out.println("BIRD CLASS METHODS");
        System.out.println();
        System.out.println("PEACOCK");
        System.out.println();

        Peacock peacock = new Peacock();
        
        peacock.eat();
        peacock.breath();
        peacock.wings();
        peacock.Fly();

        System.out.println("MAMMAL CLASS METHODS");
        System.out.println();
        System.out.println("CAMEL");
        System.out.println();

        Camel camel = new Camel();
        
        camel.eat();
        camel.breath();
        camel.movement();
        camel.walk();

        System.out.println();
        System.out.println("CAT");
        System.out.println();

        Cat cat = new Cat();
        
        cat.eat();
        cat.breath();
        cat.movement();
        cat.meow();


        System.out.println();
        System.out.println("HUMANS");
        System.out.println();

        Humans humans = new Humans();
        
        humans.eat();
        humans.breath();
        humans.movement();
        humans.work();

        System.out.println();
        System.out.println("END OF HYBRID INHERITANCE");

        


        
    }
}

class Animal {

    Animal() {                                   // CONSTRUCTOR
        System.out.println("animal");
    }
    
    void eat(){
        System.out.println("Eats");
    }

    void breath(){
        System.out.println("Breath");
    }
}

class Fish extends Animal {
    Fish(){                                  // CONSTRUCTOR
        System.out.println("fish");
    }

    void fings(){
        System.out.println("THEY HAVE TWO FINGS");
    }

    void swims(){
        System.out.println("it can swim");
    }
} 

class Tuna extends Fish {

    Tuna(){                                   // CONSTRUCTOR
        System.out.println("Tuna");
    }
    void taste(){
        System.out.println("IT HAS AMAZING TASTE");
    }
}

class Shark extends Fish {
    void size(){
        System.out.println("SHARK HAS LARGE SIZE");
    }
}

class Bird extends Animal{                              
    void wings(){
        System.out.println("THEY HAVE TWO WINGS");
    }
}

class Peacock extends Bird{                              
    void Fly(){
        System.out.println("THEY CAN FLY");
    }
}



class Mammals extends Animal {
    void movement(){
        System.out.println("all can move");
    }
}

class Camel extends Mammals{
    void walk(){
        System.out.println("THEY CAN WALK ON DESSERTS");
    }
}

class Cat extends Mammals{
    void meow(){
        System.out.println("THEY SAY MEOW");
    }
}

class Humans extends Mammals {
    void work(){
        System.out.println("THEY CAN WORK ");
    }
}