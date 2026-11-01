class Solution {
    public int[] productExceptSelf(int[] nums) {
        return productOfArrayExceptSelf(nums);
    }
    public static int [] productOfArrayExceptSelf(int[] arr) {
		int n = arr.length;
		//Left Side Multiplication Calculation
		int [] left = new int[n];
		left[0] = 1;
		for(int i = 1;i<n;i++) {
			left[i] = left[i-1]*arr[i-1];
		}
		//Right Side Multiplication Calculation
		int [] right = new int[n];
		right[n-1] = 1;
		for(int i = n-2;i>=0;i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		
		//Final Product Right*Left and stroing it in left array
		for(int i = 0;i<n;i++) {
			left[i] = left[i]*right[i];
		}
		
		return left;
	}

}