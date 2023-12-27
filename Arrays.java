public class Arrays {
    

    //Arrays used to store multiple values as a single variable
    //Array declaration:
    
    public static void main(String [] Args) {
        String [] cars = {"Mazda", "Rolls Royce", "Volvo"}; //Array of strings
        int [] myNum = {10,20,30,40};//Array of integers

        System.out.println(cars[0]);
        System.out.println("\n");
        System.out.println(myNum[0]);

        //Change elements in the array
        cars[1] = "Mercedes";
        myNum[2] = 50;
        System.out.println("\n");

        //Print out all the elements in the array
        for ( String g : cars){
            System.out.println(g);
        }
        System.out.println("\n");

        for (int f : myNum){
            System.out.println(f);
        }
     
    //Array length : This property is used to find out the number of elements in an array 
    System.out.println("\n");
    String [] potter = {"Albus ", "Snape" , "Draco" , "Granger"};
    for(String p : potter) {
        System.out.println(p);
    }
    System.out.println("The number of elements are: " + potter.length);

    //looping through  an array using a for-each loop
    System.out.println("\n");
    for (int p = 0; p < potter.length; p++){
        System.out.println(potter[p]);
    }
    //multidimensional arrays
    //declaration and  iterating through a multidimensional Array
    System.out.println("\n");
    int [][][]myArray = {
        {{1,2,3},{4,5,6}},
        {{7,8,9},{10,11,12}},
        {{13,14,15},{16,17,18}}
    };
    //System.out.println(myArray.length);
    for (int j = 0; j <  myArray.length; j++){
        for(int k = 0; k < myArray[j].length; k++){
            for(int l =0; l < myArray[j][k].length; l++){
                System.out.println(myArray[j][k][l] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    }

}
