//super key word is similar to the this keyword 
//super is used to diffrenciate members of superclass from members of the sub class if they have the same names 
//super is used to invoke superclass constructor from sub class

//if a classs inheriting the properties of another class , and if the members of the superclass have the name same as the sub class, 
//diffrenciate these variables we use the super keyword as 

// super.variable
//super.method

class superClass {
    int num = 20;

    //display the method of superclass
    public void display () {
        System.out.println("This is the display method of a superclass");
    }
}
public class SubClass  extends superClass{
    int num = 10;

    //display method of the sub classes
    public void display () {
        System.out.println("This is the display method of the subclass");
    }

    public void myMethod () {
        //instantiating the sub class
        SubClass sub = new SubClass();

        //Invoking the display() method  of the sub class
        sub.display();

        //Invoking the display () method od the super class
        super.display();

        //printing out the value of the variable num of the subClass
        System.out.println("The value of the variable named num in the sub class : " + sub.num);

        //printing the value of the the variable num of super classes 
        System.out.println("The value of the variable num in the super class is : " + super.num);
    }

    public static void main (String[]Args) {
        SubClass obj = new SubClass();
        obj.myMethod();
    }
}
