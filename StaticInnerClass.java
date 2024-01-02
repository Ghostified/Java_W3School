//An inner class can also be static 
//Static inner classes can be accessed without creating objects of the outer class

class OuterClass {
    int x = 5;
    
    //creating a static inner class 
    static class InnerClass {
        int y = 10;
    }
}

public class StaticInnerClass {

    public static void main (String [] Args) {
        OuterClass.InnerClass myInnerClass = new OuterClass.InnerClass();
        System.out.println(myInnerClass.y);
    }
    
}
