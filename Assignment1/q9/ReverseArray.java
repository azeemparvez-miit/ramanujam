package q9;

public class ReverseArray {

	public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Array in reverse order: ");  
        //Using for loop and decrement to print in reverse order
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  

	}

}
