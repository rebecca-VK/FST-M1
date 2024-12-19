package Activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		int[] numbers = { 30,50,10,49, 65,23,17};
		ascendingsort(numbers);
		System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(numbers));
		

	}
	static void ascendingsort(int array[]) {
		int size = array.length, i;
		
		for(i=1; i<size ; i++) {
			int key = array[i];
			int j = i - 1;
			
			while(j >=0 && key < array[j]) {
				array[j+1] = array[j];
				--j;
			}
			array[j+1] = key;
		}
		
	}

}
