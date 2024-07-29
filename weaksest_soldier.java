public class weaksest_soldier {
    public static int findWeakestRow(int[][] mat,int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }
            q.offer(count);
        }
        int weakestRow = -1;
        while (k > 0 &&!q.isEmpty()) {
            int count = q.poll();
            if (count < k) {
                weakestRow = q.peek();
                k -= count;
            }
            if (q.isEmpty()) {
                break;
            }
            int nextCount = q.poll();
            if (nextCount < k) {
                k -= nextCount;
            }
            q.offer(nextCount);
            
        }
        return weakestRow;
    }
}
