package test;

import java.util.*;

public class MissingNumberss {
    public static void main(String[] args) {
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
        }
    static int findMissingNumber(int start, int end, List<Integer> list) {
    	List<Integer> list0 = new ArrayList<>();
    	for (int i = start; i <= end; i++) {
    		list0.add(i);
    		}
    	for (Integer integer : list0) {
    		if (!list.contains(integer)){
    			return integer;
    			}
    		}
    	return 0;
    	}
}
