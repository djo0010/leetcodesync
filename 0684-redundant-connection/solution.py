class Solution:
    def findRedundantConnection(self, edges: List[List[int]]) -> List[int]:
        setSize = len(edges)

        parents = {}
        for i in range(setSize + 1):
            parents[i] = i

        def union(parents, x, y):
            parentX = find(parents, x)
            parentY = find(parents, y)
            parents[parentY] = parentX

        def find(parents, child):
            if parents[child] == child:
                return child
            parents[child] = find(parents, parents[child])
            return parents[child]
            
        for i in edges:
            if find(parents, i[0]) == find(parents, i[1]):
                return i
            else:
                union(parents, i[0], i[1])
         



