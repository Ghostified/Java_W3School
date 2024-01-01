import AbstractMethod.student;

class AbstractSecond {
    public static void main (String[] Args) {
        //create an object of the student class (Which inherits attributes and methods from AbstractMethods)

        Student myObj = new Student();

        System.out.println("Name " + myObj.fname);
        myObj.study(); //calls abstract method
    }
}
