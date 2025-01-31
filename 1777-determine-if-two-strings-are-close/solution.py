class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        #if sets sorted by increasing counts equal return true
        if len(word1) != len(word2):
            return False

        word1map = defaultdict(int)
        word2map = defaultdict(int)

        for i in word1:
            word1map[i] += 1
        for j in word2:
            word2map[j] += 1
        
        word1Vals = word1map.values()
        word2Vals = word2map.values()


        if sorted(word1Vals) == sorted(word2Vals) and word1map.keys() == word2map.keys():
            return True
        return False

