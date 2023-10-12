class Solution {
    public boolean winnerOfGame(String colors) {
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i) == 'A') {
                if (colors.charAt(i - 1) == 'A' && colors.charAt(i + 1) == 'A') {
                    aliceScore++;
                }
            } else if (colors.charAt(i) == 'B') {
                if (colors.charAt(i - 1) == 'B' && colors.charAt(i + 1) == 'B') {
                    bobScore++;
                }
            }
        }

        return aliceScore > bobScore;
    }
}
