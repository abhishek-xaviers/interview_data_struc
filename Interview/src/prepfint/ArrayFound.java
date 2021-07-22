package prepfint;

import java.util.Arrays;

public class ArrayFound {
	
	public void foundNemo(String[] arr) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == "nemo") {
				System.out.println("Found Nemo");
			}
			
		}
		long end = System.currentTimeMillis();
		System.out.println("Time took "+((end-start)*0.001)+" seconds");
	}

	public static void main(String[] args) {
		ArrayFound af = new ArrayFound();
		String[] nemo = {"Purvi","Abhishek","Saurabh", "nemo","Abhishek"};
		
		 String ar[] = new String[10000000];
	     Arrays.fill(ar, "nemo");
	        
		af.foundNemo(ar); //Complexity O(n)
	}

}
