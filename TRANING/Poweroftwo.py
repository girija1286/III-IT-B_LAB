class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n==0:
            return 
        return n&~(n-1)==n