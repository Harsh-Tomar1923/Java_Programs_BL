import java.util.*;
public class min_max_among5{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int[] arr= new int[5];
		System.out.println("Enter five three digits numbers");
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
        	for(int i=0;i< arr.length;i++){
            		if(arr[i]<min){
                		min=arr[i];
            		}
			 if(arr[i]>max){
                                max=arr[i];
                        }

        	}
		System.out.println("Minimum is: "+min);
		System.out.println("Maximum is: "+max);

	}
}
