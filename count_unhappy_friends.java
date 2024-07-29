public class count_unhappy_friends {
    public int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int[] count = new int[n];
        int[] unhappy = new int[n];
        for (int[] pair : pairs) {
            int a = pair[0];
            int b = pair[1];
            count[a]++;
            count[b]++;
        }
        for (int i = 0; i < n; i++) {
            int[] pref = preferences[i];
            for (int j = 0; j < pref.length; j++) {
                int friendIndex = pref[j];
                if (friendIndex == i) continue;
                if (pairs[i][0] == friendIndex || pairs[i][1] == friendIndex) {
                    unhappy[i]++;
                    unhappy[friendIndex]++;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.min(unhappy[i], count[i] - 1);
        }
        return result;
    }

}
