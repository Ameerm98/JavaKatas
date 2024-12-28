package katas.exercises;

import java.util.*;

public class SlidingWindowMaximum {

    /**
     *
     * Given an array of integers and a sliding window size, your task is to find the maximum value
     * in the window at each position as the window slides from left to right.
     *
     * For example, given the array [1, 3, -1, -3, 5, 3, 6, 7] and window size 3:
     * The output should be [3, 3, 5, 5, 6, 7].
     *
     * @param nums the array of integers
     * @param k the size of the sliding window
     * @return a list of the maximum values in each window
     */
    public static List<Integer> maxSlidingWindow(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer,Integer> count=new HashMap<>();
        for (int i = 0; i < k; i++) {
            maxHeap.add(nums[i]);
            if (count.containsKey(nums[i])){
                count.put(nums[i],count.get(nums[i])+1);
            }else {
                count.put(nums[i],1);
            }
        }

        List<Integer> res = new ArrayList<>();
        res.add(maxHeap.peek());

        for (int i = 1; i+k <= nums.length ; i++) {
            if (count.get(nums[i-1])==1){
                count.remove(nums[i-1]);
                maxHeap.remove(nums[i-1]);
            }else{
                count.replace(nums[i],count.get(nums[i])-1);
            }
            if (count.containsKey(nums[i+k-1])){
                count.replace(nums[i+k-1],count.get(nums[i+k-1])+1);
            }else{
                maxHeap.add(nums[i+k-1]);
                count.put(nums[i+k-1],1);
            }
            res.add(maxHeap.peek());
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        List<Integer> result = maxSlidingWindow(nums, k);
        System.out.println("Sliding window maximums: " + result);
    }
}

