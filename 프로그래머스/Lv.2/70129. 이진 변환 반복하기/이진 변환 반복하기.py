def solution(s):
    count, zero = 0, 0
    while s != "1":
        count += 1
        # s의 모든 0을 제거
        zero += s.count("0")
        s = s.replace("0", "")
        # 남은 s의 길이 c를 2진법으로 표현
        s = bin(len(s))[2:]
    
    return [count, zero]