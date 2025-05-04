class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original =image[sr][sc];

        if (original == color){
            return image;
        }

        dfs(image, sr, sc, original, color);
        return image;
    }

    private static void dfs(int[][] image, int sr, int sc, int    originalColor, int newColor) {
    // Boundary check
    if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length) {
        return;
    }

    // If the color is not the original color, return
    if (image[sr][sc] != originalColor) {
        return;
    }

    // Fill the current cell with the new color
    image[sr][sc] = newColor;

    // Explore the neighbors in 4 directions (up, down, left, right)
    dfs(image, sr + 1, sc, originalColor, newColor); // Down
    dfs(image, sr - 1, sc, originalColor, newColor); // Up
    dfs(image, sr, sc + 1, originalColor, newColor); // Right
    dfs(image, sr, sc - 1, originalColor, newColor); // Left

}
}