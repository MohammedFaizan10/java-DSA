public class java_abstraction_oops {
    
public static void main(String[] args) {
    Horse h = new Horse();
    h.walk();
    System.out.println(h.color);
    System.out.println(h.color);

    Queen q = new Queen();

    q.moves();

    King k = new King();
    k.moves();

    Bear b = new Bear();
    b.green();
    b.meat();

}

}


abstract class Animal {

    String color;

    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    void walk(){
        System.out.println("Walks on four legs");
    }

    void changeColor(){
        color = "dark brown";
    }

}

class Cat extends Animal{
    void walk(){
        System.out.println("Walks on two legs");
    }

    void changeColor(){
        color = "white";
    }
}


interface ChessPlayer{
    public void moves();                        // Blue print of moves() 
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Left , Right , Top , Bottom , Diagonal");             // IMPLEMENTING THE INTERFACES
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Left , Right , Top , Bottom ");                    // same
    }
}

class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("Left , Right , Top , Bottom - with single step");             // same
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("Left , Right , Top , Bottom , Diagonal - By single step");        // same
    }
}



// MULTIPLE INHERITANCE USING INTERFACES :

interface Herbivore {
    void green();
}

interface Carnivore {
    void meat();
}

class Bear implements Herbivore, Carnivore{

    public void green(){
        System.out.println("BEAR EATS GRASS");
    } 

    public void meat(){
        System.out.println("BEAR EATS MEAT ALSO");
    }
}





