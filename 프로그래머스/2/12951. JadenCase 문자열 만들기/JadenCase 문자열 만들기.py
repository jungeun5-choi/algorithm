def solution(s):
    words = s.split(' ')
    answer = []
    for chars in words:
        if chars != '':
            answer.append(chars[0].upper() + chars[1:].lower())
        else:
            answer.append('')
    return " ".join(answer)