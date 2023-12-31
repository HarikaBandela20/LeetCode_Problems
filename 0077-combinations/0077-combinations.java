class Solution {
    List<List<Integer>> f=new ArrayList<>();
    public void finditscombinations(List<Integer> tempList, int start, int n, int k) {
        if (tempList.size() == k) {
            f.add(new ArrayList<>(tempList));
        }
        for (int i = start; i <= n; i++) {
            tempList.add(i);
            finditscombinations(tempList, i + 1, n, k);
            tempList.remove(tempList.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        finditscombinations(new ArrayList<>(), 1, n, k);
        return f;
    }
    }