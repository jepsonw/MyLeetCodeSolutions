
public class RotateArray {
	public void rotate(int[] nums, int k) throws Exception{
        int length=nums.length;
        k=k%length;
        revert(nums,0,length-1);
        revert(nums,0,k-1);
        revert(nums,k,length-1);
        
    }
    
    private void revert(int[]nums, int start, int end) throws Exception{
        if(end-start>nums.length||end<start|| start<0||end>=nums.length)
            throw new Exception("Invalid Boundary");
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            ++start;
            --end;
        }
    }
	public static void main(String[] args) throws Exception {
		int[]nums={1,2,3,4,5};
		new RotateArray().rotate(nums, 3);
		for(int i:nums){
			System.out.println(i+" ");
		}
	}

}
