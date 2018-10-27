#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-10-27 22:01:00
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not s :
            return 0
        roman_dict={
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000
        }
        res=0
        res += roman_dict[s[-1]]
        for i in range(len(s)-2,-1,-1):
            if roman_dict[s[i]]>=roman_dict[s[i+1]]:
                res+=roman_dict[s[i]]
            else :
                res-=roman_dict[s[i]]
        return res
        