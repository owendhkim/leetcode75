public class contain_most_water
{
/*
Input: height = [1,8,6,2,5,4,8,3,7]
    Output: 49
    Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
    In this case, the max area of water (blue section) the container can contain is 49
 */
    public int maxArea(int[] height)
    {
        int max = 0;
        for(int left = 0, right = height.length - 1; left < right;) {
            int container = Math.min(height[left], height[right]) * (right - left);
            if (container > max) {
                max = container;
            }
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        contain_most_water s = new contain_most_water();
        System.out.println(s.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
