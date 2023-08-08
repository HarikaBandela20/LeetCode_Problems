class Solution {
    List<List<Integer>> f = new ArrayList<>();
    public void addpermute(List<Integer> l, int start) {
        if (start == l.size()) {
            f.add(new ArrayList<>(l)); 
            return;
        }
        for (int i = start; i < l.size(); i++) {
            Collections.swap(l, start, i);
            addpermute(new ArrayList<>(l), start + 1); 
            Collections.swap(l, start, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        for (int i : nums) {
            l1.add(i);
        }
        addpermute(l1, 0);
        return f;
    }
}

