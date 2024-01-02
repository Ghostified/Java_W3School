class Outerclass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
}

public class ClassNesting {
    public static void main (String [] Args) {
        Outerclass myOuter = new Outerclass();
        Outerclass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
    
}
