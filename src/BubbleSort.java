import java.util.Scanner;
public class BubbleSort {
	
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements you want to store: "); 
		n=sc.nextInt();
		int[] array = new int[n];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{
		array[i]=sc.nextInt();  
		}   
        
        System.out.println("Array Before Bubble Sort");  
        for(int i=0; i < array.length; i++){  
                System.out.print(array[i] + " ");  
        }  
        System.out.println();  
          
        bubbleSort(array);//sorting array elements using bubble sort  
         
        System.out.println("Array After Bubble Sort");  
        for(int i=0; i < array.length; i++){  
                System.out.print(array[i] + " ");  
        }  

	}

}
