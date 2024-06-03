package Office_code;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound1() {
        System.out.println("Dog barks");
    }

    public void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class casting {

    public static void main(String[] args) {        
    	Dog anl = new Dog();
    	anl.sound();
        
    }
}
