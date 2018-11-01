class Solution:
    def computeArea(self, A, B, C, D, E, F, G, H):
        """
        :type A: int
        :type B: int
        :type C: int
        :type D: int
        :type E: int
        :type F: int
        :type G: int
        :type H: int
        :rtype: int
        """
        leftX = max(A,E)
        leftY= max(B,F)
        rightX=min(C,G)
        rightY=min(D,H)
        
        area =(C-A)*(D-B)+(G-E)*(H-F)
        print(leftX,leftY,rightX,rightY,area)
        print((rightX-leftX)*(rightY-leftY))
        
        if leftX>=rightX or leftY>=rightY:
            return area
        else:
            return area - (rightX-leftX)*(rightY-leftY)