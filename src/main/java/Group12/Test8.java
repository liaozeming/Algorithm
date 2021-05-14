package Group12;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {
        int[]  nums = {1,2,2};
        Test8 test8=new Test8();
        List<List<Integer>> lists = test8.subsetsWithDup(nums);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).toString());
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        //注意如果有重复元素且又要做排列或者子集的话我们一般先排序，方便后面剪枝
        Arrays.sort(nums);
        backtrack(0,len,nums,res,new ArrayList<Integer>());
        return res;

    }
    public void backtrack(int index,int length,int [] nums,List<List<Integer>> res,List<Integer> temp){
        //注意拷贝
        res.add(new ArrayList(temp));
        for(int i = index;i<length;i++){
            //剪枝 去重
            if(i>index && nums[i] == nums[i-1]){
                continue;
            }
            //选择节点
            temp.add(nums[i]);
            // 继续探索新的节点 i+1
            backtrack(i+1,length,nums,res,temp);
            //撤销选择
            temp.remove(temp.size()-1);
        }
    }
}
