class Solution:
    def pivotArray(self, nums, pivot):
        less = []
        equal = []
        greater = []

        for num in nums:
            if num == pivot:
                equal.append(num)
            elif num > pivot:
                greater.append(num)
            else:
                less.append(num)

        return less + equal + greater