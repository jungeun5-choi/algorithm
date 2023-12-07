def solution(bin1, bin2):
    answer = ''
    tmp = int(bin1, 2) + int(bin2, 2)
    if tmp == 0:
        answer = '0'
    while tmp != 0:
        answer += str(tmp % 2)
        tmp = tmp // 2
    return answer[::-1]