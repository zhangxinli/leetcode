class Solution:
    def subsetsWithDup(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res=[]
        nums.sort()
        self.sub_helper(nums,0,res,[])
        return res
    
    def sub_helper(self,nums,index,res,cur_list):
        res.append(list(cur_list))
        i =index
        while i <len(nums):
            cur_list.append(nums[i])
            self.sub_helper(nums,i+1,res,cur_list)
           
            while i+1<len(nums) and nums[i+1] == nums[i]:
                i+=1
            i+=1
            cur_list.pop()
            if i == len(nums):
                break
          