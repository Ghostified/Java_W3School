public  class InnerClasses {

    //Inner and outer classes are used toi nest classes within a class
    
     class OuterClass{
        int x = 10;

        private class InnerClass {
            int y = 5;
        }
    }

    public class InnerClass {
        public static void main (String [] Args) {
            OuterClass myOuter = new OuterClass();
            OuterClass.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.y + myOuter.x);
        }
    }}
//}
