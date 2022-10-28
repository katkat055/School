package parta;

public class FirstArray {
/**
 * @param args
 */
public static void main(String[] args) {
        
    // final int array = (10);

    int[] myArray = {5, 4, 2, 7, 6, 8, 5, 2, -8, 14};

    for(int i = 0; i < myArray.length; i ++){
        System.out.println(myArray[i]);
    }

    // // int count = array;
    // // for(int i = count - 1; i > 0; i--){
    // //     System.out.println(myArray[i]);
    // // }
    
    int i = myArray.length;
    while(i > 0){
        i--;
        System.out.println(myArray[i]);
    }

    System.out.printf("%6s|%6s|%6s\n", "Value", "Square", "Cube");
    i = 0;
    while(i < myArray.length){
        int square = (int) Math.pow(myArray[i], 2);
        int cube = (int) Math.pow(myArray[i], 3);
        System.out.printf("%6d|%6d|%6d\n", myArray[i], square, cube);
        i++;
    }
    // for(int j = 0; j < array; j ++){
    //     int square = (int) (myArray[j] * Math.pow(myArray[j], 1)); 
    //     int cube = (int) (myArray[j] * Math.pow(myArray[j], 2));
    //     System.out.printf("%10d|%10d|%10d\n", myArray[j], square, cube);
    // }

}
}