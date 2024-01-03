public class MammalInt implements Animal{

    public void eat() {
        System.out.println("Mammal Eats");
    }

    public void travel () {
        System.out.println("Mammal Travels");
    }

    public int noofLegs() {
        return 0;
    }

    public static void main (String [] Args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}
interface Animal{
    public void eat();
    public void travel ();
}
