from collections import deque
from string import ascii_lowercase

class Solution(object):
    def findLadders(self, beginWord, endWord, wordList):
        """
        :type beginWord: str
        :type endWord: str
        :type wordList: List[str]
        :rtype: List[List[str]]
        """
        if not beginWord or not endWord or not wordList:
            return 
        res=[]
        wordList.append(endWord)
        self.helper(res,[],beginWord,wordList,endWord)
        return res
    
    def helper(self,res,cur_list,cur_word,wordList,endWord):
        
        if not wordList or not endWord:
            return
        
        cur_list.append(cur_word)
        if cur_word == endWord:
            # if cur_word=='tusk':
            #     print(cur_list)
            if len(res)==0:
                res.append(list(cur_list))
            else:
                lens =len(res[0])
                if lens>len(cur_list):
                    del res[:]
                    res.append(list(cur_list))
                elif lens==len(cur_list):
                    res.append(list(cur_list))
                        
                    
            return

        neighbours = self.get_neighbour(cur_word,wordList)
        # print(neighbours)
        if not neighbours:
            return

        for word in neighbours:
            wordList.remove(word)
            
        for word in neighbours:
            self.helper(res,list(cur_list),word,list(wordList),endWord)
            

    def get_neighbour(self,cur_word,wordList):
        res=[]
        
        for i in range(len(cur_word)):
            
            for c in ascii_lowercase:
                
                temp = cur_word[:i]+c+cur_word[i+1:]
                
                if temp in wordList and cur_word!=temp:
                    
                    res.append(temp)
                    
                    
                    
        return res
        