def solution(s):
    numbers = list(map(int, s.split(' ')))
    numbers.sort()
    return str(min(numbers)) + ' ' + str(max(numbers))