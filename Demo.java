// ---------------------------------------------------[20-01-2026]-------------------------------------------------------------

// given an array count no of elements having atleast one element greater than itself.
//arr=[1, 2, 3, 4, 3, -2, 2, 1, 2, 2, 0, 9 ,3 ]
// Observation : Find max , check if arr[i] != max.

import java.util.Scanner;
public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int count = 0;
        int arr[] = [1, 2, 3, 4, 3, -2, 2, 1, 2, 2, 0, 9 ,3];
        int max = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                max = arr[i];
            count++;
            System.out.println("count =" + count) ;
        }

        

        
        }

    }
}
