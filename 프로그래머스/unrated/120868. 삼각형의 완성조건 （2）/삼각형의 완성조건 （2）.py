def solution(sides):
    answer = 0
    maximum = max(sides[0], sides[1])
    sum = sides[0] + sides[1]
    sub = abs(sides[0] - sides[1])
    
    for i in range(maximum + 1, sum):
        answer += 1
    for j in range(sub, maximum):
        answer += 1
    return answer