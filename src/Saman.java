 // Overriding Project
public class Saman {
    void height(){
        System.out.println("Saman's height is 5 ft");
    }
    void weight(){
        System.out.println("Saman's weight is 50 kg");
    }
     void surname(){
         System.out.println("Saman's surname is Gunasekara");
     }
}
class Amara extends Saman{
    void height(){
       super.height();
    }
    void weight(){
        System.out.println("Amara's weight is 60 kg");
    }
}
class Kamal extends Saman{
    void surname(){
        System.out.println("Kamal's surname is Dissanayake");
    }

    public static void main(String[] args) {
        Amara amara = new Amara();
        Kamal kamal = new Kamal();
        amara.height();
        amara.weight();
        kamal.surname();
    }
}
