def solution(my_str, n):
    answer = []
    length = len(my_str) // n
    if len(my_str) % n:
        length += 1
    for i in range(length):
        tmp = i * n
        answer.append(my_str[tmp:tmp + n])
    return answer
