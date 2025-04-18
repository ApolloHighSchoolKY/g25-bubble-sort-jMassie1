
import java.util.Arrays;

public class BubbleSort
{

	

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes = myNums.length-1;
		int comparisons = myNums.length-1;
		int tempNum = 0;

		//Loop once for each pass, where passes is one less than the number of items.
		for(int i = 0; i < passes; i++ ){
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(int j = 0; j < comparisons; j++){
				//If they are out of order, swap the values
				if(myNums[j] < myNums[j+1]){
				tempNum = myNums[j+1];
				myNums[j+1] = myNums[j];
				myNums[j] = tempNum; 
				}
			//End Loop for comparisons
			}
			//The next pass will use one less comparison
            comparisons--;
		//End Loop for passes
		}
		System.out.println(Arrays.toString(myNums));



  }
}
