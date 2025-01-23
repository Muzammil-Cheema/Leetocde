import java.util.Arrays;

public class _2017GridGame {
    public static long gridGame(int[][] grid){
        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < grid[0].length; i++)
            sum1 += grid[0][i];

        for (int i = 0; i < grid[0].length; i++){
            sum1 -= grid[0][i];
            sum2 += grid[1][i];
            if (sum2 > sum1) {
                sum2 -= grid[1][i];
                break;
            }
        }
        return Math.max(sum1, sum2);
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {{10,12,14,19,19,12,19,2,17}, {20,7,17,14,3,1,1,17,12}};
        System.out.println(Arrays.deepToString(grid));
        gridGame(grid);
        System.out.println(Arrays.deepToString(grid));
    }

}


