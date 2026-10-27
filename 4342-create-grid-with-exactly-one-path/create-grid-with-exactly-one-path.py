class Solution:
    def createGrid(self, m: int, n: int) -> list[str]:
        
        path = ""
        for i in range(n):
            path += "."

        ans = list()
        ans.append(path)
        
        for i in range(m-1):
            rest = ""
            for j in range(n):
                if j == n-1:
                    rest += "."
                else:
                    rest += "#"
            ans.append(rest)

        return ans

