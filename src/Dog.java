 //Inheritance Project
public class Dog {
    void run(){
        System.out.println("Can Run");
    }
    void jump(){
        System.out.println("Can Jump");
    }
}
class BabyDog extends Dog{
    void climb(){
        System.out.println("Can't Climb");
    }
}
class TestInheritance{
    public static void main(String[] args) {
        BabyDog bd = new BabyDog();
        bd.run();
        bd.jump();
        bd.climb();

    }
}