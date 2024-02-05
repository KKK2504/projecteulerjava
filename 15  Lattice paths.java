public class Main {

    public static long countLatticePaths(int gridSize) {
        long[][] paths = new long[gridSize + 1][gridSize + 1];
        // Initialize the base cases
        for (int i = 0; i <= gridSize; i++) {
            paths[i][0] = 1;
            paths[0][i] = 1;
        }
        // Fill in the grid using dynamic programming
        for (int i = 1; i <= gridSize; i++) {
            for (int j = 1; j <= gridSize; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }

        return paths[gridSize][gridSize];
    }

    public static void main(String[] args) {
        int gridSize = 20;
        long result = countLatticePaths(gridSize);
        System.out.println("The number of routes in a " + gridSize + "x" + gridSize + " grid is: " + result);
    }
}
