package labs.comp3111.ust.hk;

public class Lab1Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		int min = arr[0], max = arr[0];
		for(int i =0; i<arr.length; ++i) {
			sum +=arr[i];			
			if(min > arr[i])
				min = arr[i];
			if(max < arr[i])
				max = arr[i];


		}
		
		System.out.println(String.format("Sum of the numbers is %d", sum));
		System.out.println("Min = "+min+"; Max = "+max);

	}

}
