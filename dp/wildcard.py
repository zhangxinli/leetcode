class Solution:
    def isMatch(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: bool
        """
        
        
        if len(p) == 0:
            return len(s) == 0
        lengthS = len(s)
        lengthP = len(p)
        dp = [[False for i in range(lengthP + 1)] for j in range(lengthS +1)]
        
        dp[0][0] = True
        
        for i in range(1, lengthP + 1):
            if p[i-1] == "*":
                dp[0][i] = True
            else:
                break
                
        for i in range(1, lengthS + 1):
            for j in range(1, lengthP + 1):
                
                # if p[j-1] == s[i-1]:
                #     dp[i][j] = dp[i-1][j-1]
                
                if p[j-1] != "?" and p[j-1] != "*":
                    if dp[i-1][j-1] and s[i-1] == p[j-1]:
                        dp[i][j] = True
                elif p[j-1] == "?":
                    dp[i][j] = dp[i-1][j-1]
                else: # "*" can't be first char
                    
                    dp[i][j] = dp[i][j-1] or  dp[i-1][j-1] or dp[i-1][j]
                  
        return dp[lengthS][lengthP]