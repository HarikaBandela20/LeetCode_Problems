class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i:nums){
            minHeap.add(i);
        }
        int count=0;
        while(count<(nums.length-k)){
            minHeap.poll();
            count++;
        }
        //System.out.println(minHeap);
        return minHeap.peek();
    }
}