package Projects;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int even = 0;
		
		int[][] nums= {
				
				{26,31},
				{40,65},
				{20,36},
				{61,50},
				{10,20},
		};
		for (int i=0;i<nums.length;i++ ) {
			
			for(int j=0; j<nums[i].length;j++) {
			
	           if(nums[i][j]%2==0) {
	        	   
	        	   even=nums[i][j];
	        	   
	           }   
	        	
	           }
			
			System.out.println(even); 
			
		}

	}

}
