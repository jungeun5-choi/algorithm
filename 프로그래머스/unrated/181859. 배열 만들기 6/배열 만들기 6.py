def solution(arr):
    stk = []
    for i in arr:
        if stk and stk[-1] == i:
            stk.pop()
        else:
            stk.append(i)  
    return stk or [-1]