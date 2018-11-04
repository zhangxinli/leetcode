package com.zxl.dp;

import java.util.ArrayList;
import java.util.List;

public class Trangle {
	/**
	 * 这个不难，自己出错在初始条件以及为空条件的判定，当为空的直接置最大值，就不用条件判定了
	 * @param triangle
	 * @return
	 */
	 public static int minimumTotal(List<List<Integer>> triangle) {
		 if(triangle==null||triangle.size()==0) return 0;
	        int len =triangle.get(triangle.size()-1).size();
	        int[] res = new int[len+1];
	        int[] temp = new int[len+1];
	        res[0]=Integer.MAX_VALUE;
	        temp[0]=Integer.MAX_VALUE;
	        for(int i =0 ;i<triangle.size();i++){
	            temp[triangle.get(i).size()] =Integer.MAX_VALUE;
	            for(int j =0 ;j<triangle.get(i).size();j++){
	            	int min_temp=Math.min(temp[j],temp[j+1])==Integer.MAX_VALUE?0:Math.min(temp[j],temp[j+1]);
	                res[j+1]=min_temp+triangle.get(i).get(j);
	            }
	            temp=res.clone();
	        }
	        int min= Integer.MAX_VALUE;
	        for(int i=1 ;i<=len;i++){
	           
	           min= Math.min(min,res[i]);
	        }
	        return min ;
	        
	    }
	 public static void main(String[] args) {
		 List<List<Integer>> triangle =new ArrayList<List<Integer>>();
		 List<Integer> l1= new ArrayList<Integer>();
		 l1.add(2);
		 List<Integer> l2= new ArrayList<Integer>();
		 l2.add(3);
		 l2.add(4);
		 
		 List<Integer> l3= new ArrayList<Integer>();
		 l3.add(5);
		 l3.add(6);
		 l3.add(7);
		 List<Integer> l4= new ArrayList<Integer>();
		 l4.add(4);
		 l4.add(1);
		 l4.add(8);
		 l4.add(3);
		 triangle.add(l1);
		 triangle.add(l2);
		 triangle.add(l3);
		 triangle.add(l4);
		 minimumTotal(triangle);
	}
}
