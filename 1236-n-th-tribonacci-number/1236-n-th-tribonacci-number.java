class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(0);
        q.add(1);
        q.add(1);
        while(n-2>0){
            Queue<Integer> x=new LinkedList<Integer>(q);
            int sum=0;
            for(int i=0;i<q.size();i++){
                sum=sum+x.poll();
            }
            q.add(sum);
            q.poll();
            n--;
        }
        q.poll();
        q.poll();
        //System.out.println(q);
        return q.poll();
    }
}