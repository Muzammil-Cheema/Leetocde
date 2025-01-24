public class _1267CountServersThatCommunicate {
    public static int countServers(int[][] grid){
        int totalCount = 0, streetCount = 0, repeatCount = 0;
        int[] checkedRow = new int[grid.length];

        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[i].length; j++)
                if (grid[i][j] == 1)
                    streetCount++;
            if (streetCount > 1) {
                totalCount += streetCount;
                checkedRow[i] = 1;
            }
            streetCount = 0;
        }

        for (int i = 0; i < grid[0].length; i++){
            for (int j = 0; j < grid.length; j++){
                if (grid[j][i] == 1) {
                    streetCount++;
                    if (checkedRow[j] == 1)
                        repeatCount++;
                }
            }
            if (streetCount > 1)
                totalCount += streetCount - repeatCount;
            streetCount = 0;
            repeatCount = 0;
        }

        return totalCount;
    }

    public static boolean isConnected(int row, int col, int[][] grid){
        for (int i = 0; i < grid.length; i++)
            if (i != row && grid[i][col] == 1)
                return true;
        for (int j = 0; j < grid[row].length; j++)
            if (j != col && grid[row][j] == 1)
                return true;
        return false;
    }
}
