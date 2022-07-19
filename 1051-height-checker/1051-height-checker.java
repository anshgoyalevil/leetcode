class Solution {
    public static int heightChecker(int[] heights) {
        if (heights.length < 1 || heights.length > 100) return 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] < 1 || heights[i] > 100) return 0;
        }

        int operations = 0;

        final int[] sortedHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sortedHeights);

        for (int j = 0; j < heights.length; j++) {
            if (sortedHeights[j] != heights[j]) operations++;
        }

        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(sortedHeights));
        System.out.println("Operations: " + operations);

        return operations;
    }
}