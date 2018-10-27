#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-10-27 22:26:31
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

class Solution:
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        int_num=[1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        str=["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        res=''
        index=0
        while num:
            
            temp =num//int_num[index]
            for i in range(temp):
                res+=str[index]
            num%=int_num[index]
            index+=1
        return res