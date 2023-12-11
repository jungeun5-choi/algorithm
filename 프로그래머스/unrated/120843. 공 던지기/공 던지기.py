def solution(numbers, k):
    answer = 1
    while k != 1:
        answer += 2
        if answer > numbers[-1]:
            answer -= numbers[-1]            
        k -= 1
        
    return answer