class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        visitedRooms = [0] * len(rooms)
        
        def dfs(room: int, roomNumber):
            nonlocal visitedRooms
            if visitedRooms[roomNumber] == 1:
                return
            
            visitedRooms[roomNumber] = 1
            print(rooms[roomNumber])
            for roomNumber in rooms[roomNumber]:
                dfs(rooms[roomNumber], roomNumber)
        
        dfs(rooms[0], 0)

        return all(x == 1 for x in visitedRooms)
