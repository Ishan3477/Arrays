class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;){
            int sum=0;
            for(int j=i+1,k=nums.length-1;j<k;){
                sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[k]);
                    ans.add(al);
                    while(j+1<nums.length && nums[j+1]==nums[j]){
                        j++;
                    }
                    j++;

                    while(k-1>=0 && nums[k-1]==nums[k]){
                        k--;
                    }
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
            while(i+1<nums.length && nums[i+1]==nums[i]){
                i++;
            }
            i++;
        }
        return ans;
    }
}
