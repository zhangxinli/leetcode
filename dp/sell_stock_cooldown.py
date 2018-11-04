#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-04 18:33:35
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$

def maxProfit(self, prices):
    """
    :type prices: List[int]
    :rtype: int
    """
    
    if not prices:
        return 0
    lens = len(prices)
    
    if lens <2:
        return 0
    buys =[0 for i in range(lens)]
    sell =[0 for i in range(lens)]
    
    buys[0] =-prices[0]
    buys[1] =max(-prices[0],-prices[1])
    
    sell[0] =0;
    sell[1] =max(0,prices[1]-prices[0])
    
    for i in range(2,lens):
        buys[i] = max(buys[i-1],sell[i-2]-prices[i])
        sell[i] =max(sell[i-1],buys[i-1]+prices[i])
    return sell[-1]
