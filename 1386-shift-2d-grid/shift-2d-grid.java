class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int row = grid.length;
        int column = grid[0].length;

        int total = row * column;
        k %= total;

        reverse(grid, 0, total - 1);
        reverse(grid, 0, k - 1);
        reverse(grid, k, total - 1);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < column; j++) {
                list.add(grid[i][j]);
            }
            ans.add(list);
        }

        return ans;
    }

    public void reverse(int[][] grid, int left, int right) {

        int column = grid[0].length;

        while (left < right) {

            int r1 = left / column;
            int c1 = left % column;

            int r2 = right / column;
            int c2 = right % column;

            int temp = grid[r1][c1];
            grid[r1][c1] = grid[r2][c2];
            grid[r2][c2] = temp;

            left++;
            right--;
        }
    }
}