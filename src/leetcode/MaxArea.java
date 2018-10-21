package leetcode;

/**
 * 给定 n 个非负整数 a1，a2，...，an，
 * 每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int start= 0;
        int end = height.length-1;
        int maxArea = 0;
        while (start<end){
            maxArea = Math.max(maxArea,Math.min(height[start],height[end])*(end-start));
            if(height[start]>height[end]){
                end --;
            }else{
                start ++;
            }
        }
        return maxArea;
    }
}
