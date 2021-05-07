class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length==1 || nums[0]>nums[1]) return 0;
        if (nums[nums.length-1]>nums[nums.length-2]) return nums.length-1;
        int l=0,r=nums.length-1;
        while (l<r) {
            int mid=(r+l)/2;
            if (nums[mid]>nums[mid+1]) r=mid;
            else l=mid+1;
        }
        return l;
    }
}
