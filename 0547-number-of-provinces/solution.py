class Solution:
    def findCircleNum(self, isConnected: List[List[int]]) -> int:
        
        parents = defaultdict(int)
        for i in range(len(isConnected[0])):
            parents[i + 1] = i + 1

        def union(parents, x, y):
            parentX = find(parents, x)
            parentY = find(parents, y)
            parents[parentY] = parentX

        def find(parents, child):
            if parents[child] == child:
                return child
            parents[child] = find(parents, parents[child])
            return parents[child]

        for i in range(len(isConnected)):
            for j in range(len(isConnected[i])):
                if isConnected[i][j] == 1:
                    union(parents, i + 1, j + 1)

        for j in range(len(isConnected)):
            find(parents, j + 1)

        return len(set(parents.values()))
