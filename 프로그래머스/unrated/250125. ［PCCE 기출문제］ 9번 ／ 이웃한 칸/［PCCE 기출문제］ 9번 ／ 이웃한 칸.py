def solution(board, h, w):
    n = board #1
    count = 0 #2
    dh = [0, 1, -1, 0]
    dw = [1, 0, 0, -1] #3
    
    for i in range(4): #4
        h_check = h + dh[i]
        w_check = w + dw[i] #4-1
        if h_check >= 0 and h_check < len(n) and w_check >= 0 and w_check < len(n): #4-2            
            if n[h][w] == n[h_check][w_check]: 
                count += 1 #4-2-a
    return count