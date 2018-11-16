#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-16 15:15:58
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$



class Solution:
    def combinationSum2(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        results = []
        if not candidates:
            return [[]]
        candidates.sort()
        self.combHelper(results, candidates, target, 0, [])
        return results
    
    def combHelper(self, results, candidates, target, index, curList):
        if sum(curList) == target:
            tmpList = list(curList)
            results.append(tmpList)
        elif sum(curList) > target:
            return
        for i in range(index, len(candidates)):
            if i != index and candidates[i] == candidates[i-1]:
                continue
            curList.append(candidates[i])
            self.combHelper(results, candidates, target, i+1, curList)
            curList.pop()