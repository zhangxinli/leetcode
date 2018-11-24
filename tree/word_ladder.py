#!/usr/bin/env python
# -*- coding: utf-8 -*-
# @Date    : 2018-11-24 16:04:56
# @Author  : xinli (xinli.zxl@foxmail.com)
# @Link    : 
# @Version : $Id$


class Solution(object):
    def ladderLength(self, beginWord, endWord, wordList):
        """
        :type beginWord: str
        :type endWord: str
        :type wordList: List[str]
        :rtype: int
        """
        if not beginWord or not endWord or not wordList:
            return 0
        queue = deque()
        level =1
        queue.append((beginWord,level))
        wordList.append(endWord)
        
        while  len(queue)>0:
            
            cur_word,cur_level = queue.popleft()
            if cur_word == endWord:
                return cur_level
            
            cur_word_neighbours = self.get_neighbour(cur_word,wordList)
            for word in cur_word_neighbours:
                queue.append((word,cur_level+1))
                wordList.remove(word)
                
        return 0
        
        
    def get_neighbour(self,cur_word,wordList):
        res=[]
        
        for i in range(len(cur_word)):
            
            for c in ascii_lowercase:
                
                temp = cur_word[:i]+c+cur_word[i+1:]
                
                if temp in wordList and cur_word!=temp:
                    
                    res.append(temp)
                    
                    
                    
        return res
                    
