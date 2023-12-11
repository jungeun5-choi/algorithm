def solution(arr):
    stk = []
    for i in arr:
        if len(stk) == 0:
            stk.append(i)
        else:
            if stk[-1] == i:
                stk.pop()
            else:
                stk.append(i)  
    if len(stk) == 0:
        return [-1]
    return stk