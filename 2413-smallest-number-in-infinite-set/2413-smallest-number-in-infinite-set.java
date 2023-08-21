class SmallestInfiniteSet {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public SmallestInfiniteSet() {
        for(int i=1;i<=1000;i++){
            minHeap.add(i);
        }
    }
    
    public int popSmallest() {
        if(!minHeap.isEmpty()){
            int x = minHeap.poll();
            return x;
        }
        return 0;
    }
    
    public void addBack(int num) {
        if(!minHeap.contains(num)){
            minHeap.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */