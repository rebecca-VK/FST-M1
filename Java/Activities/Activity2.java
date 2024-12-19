package Activities;

public class Activity2 {
	public static void main(String[] args) {
	//Create object
	Activity2 actObj = new Activity2();
	//Create int array
	int[] nums = { 10, 77, 10, 54, -11, 10 };
	
	
	//set number to  search for
	int searchNum = 10;
	int fixedSum =  30;
	
	//call the result function and print the result
	System.out.println("Result: " +  actObj.result(nums, searchNum, fixedSum));
	
	}	
	public boolean result(int[] nums, int searchNum, int fixedSum) {
		//temp variable
		int tempSum = 0;
		//loop through the arrays
		
		for(int number : nums) {
            //If value is 10
            if (number == searchNum) {
                //Add them
                tempSum += searchNum;
            }

            //Sum should not be more than 30
            if (tempSum > fixedSum) {
                break;
            }
        }
		return fixedSum == tempSum;
		
	}
	

}
