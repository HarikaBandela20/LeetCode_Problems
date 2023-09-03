class Solution {
    private HashMap<String, Integer> uniquePathsMap = new HashMap<>();

    public int countpaths(int start, int end, int m1, int n1, String res) {
        if (start > m1 - 1 || end > n1 - 1) {
            return 0;
        }
        if (start == m1 - 1 && end == n1 - 1) {
            return 1;
        }

        String positionKey = start + "_" + end;
        if (uniquePathsMap.containsKey(positionKey)) {
            return uniquePathsMap.get(positionKey);
        }

        int rightPaths = countpaths(start + 1, end, m1, n1, res + "right->");
        int downPaths = countpaths(start, end + 1, m1, n1, res + "down->");

        uniquePathsMap.put(positionKey, rightPaths + downPaths);

        return rightPaths + downPaths;
    }

    public int uniquePaths(int m, int n) {
        return countpaths(0, 0, m, n, "");
    }
}






