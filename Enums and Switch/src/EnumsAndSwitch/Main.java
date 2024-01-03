package EnumsAndSwitch;

public class Main {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
       }

        //looping though an enum using the values () method
        for (Level all : Level.values()) {
            System.out.println(all);
        }


    }

}
//what?
