public class Maths {
    public static void main (String [] args) {
        int x = 30;
        int y = 40;
        int z = 64;

        System.out.println(Math.max(x,y));
        System.out.println(Math.min(y,z));
        System.out.println(Math.sqrt(z));

        //return random number between 0-1000
        int randomNum = (int) (Math.random()* 1000);
        System.out.println(randomNum);

        System.out.println(Math.abs(-4.89));


    }
}
