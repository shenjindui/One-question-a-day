package shenjindui_20200628;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
   你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 * @author Book
 *
 */
public class shenjindui_20200628 {
	
	/**
	 * 方法一：使用暴力法破解，利用两重循环遍历每个元素 并查找是否存在一个值与 target−i相等的目标元素
	 * 复杂度分析
             时间复杂度：O(n^2)
             对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n)的时间。
             因此时间复杂度为 O(n^2)。
             空间复杂度：O(1)。
	 */
	static List<int[]> towSumWay01(int[] nums, int target) {
		List<int[]> resultList = new ArrayList<int[]>();
		for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + nums[i]== target) {
                	resultList.add(new int[] { i, j });
                }
            }
        }
		return resultList;
	}

	/**
	 * 主函数测试
	 * @param args
	 */
	public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 1, 8 , -2};
        int target = 9;
        List<int[]> resultList = shenjindui_20200628.towSumWay01(nums,target);
        StringBuffer sb = new StringBuffer("[");
        for(int i=0;i<resultList.size();i++) {
        	for (int j : resultList.get(i)) {
            		sb.append(j).append(",");
    		}
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append("]");
        System.out.println(sb);
	}
}
