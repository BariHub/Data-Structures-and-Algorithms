import java.util.Arrays;
import java.util.Random;

public class Bubble {
    public static void main(String[] args){
        int[] arr;
        if(args.length == 1){
            arr = new int[Integer.parseInt(args[0])];
            Random rand = new Random();
            for(int i = 0; i < arr.length; i++){
                arr[i] = rand.nextInt();
            }
            bubbleSort(arr);
        }
        else if(args.length > 1){
            arr = new int[args.length];
            for(int i = 0; i < args.length; i++){
                arr[i] = Integer.parseInt(args[i]);
            }
            bubbleSort(arr);
        }
        else{
            System.out.println("Error, too few args or something else");
        }
    }
    static void bubbleSort(int[] arr){
        int temp = 0;
        int swap = 0;
        int compare = 0;
        System.out.println("Original Array: " + Arrays.toString(arr));
        for(int i = 0; i < (arr.length - 1); i++){
            for(int j = 1; j < (arr.length - i); j++){
                if(arr[j - 1] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swap++;
                }
                compare++;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Compares: " + compare);
        System.out.println("Swaps: " + swap);
    }
}
