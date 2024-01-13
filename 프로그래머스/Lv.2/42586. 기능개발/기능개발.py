import math


def solution(progresses, speeds):
    # 프로세스 배포까지 걸리는 시간
    deploy = [
        math.ceil((100 - progress) / speed)
        for progress, speed in zip(progresses, speeds)
    ]

    answer = []
    front = 0
    for current in range(len(deploy)):
        """
        현재(current) 배포 소요 시간이
        바로 앞(front)의 배포 소요 시간보다 크면,
        (current - front)의 차를 구한다.
        ... 그 전까지의 프로세스들은 동시에 출시하기 때문이다.
        """
        if deploy[current] > deploy[front]:
            answer.append(current - front)
            front = current

    # 이후 남은 프로세스
    answer.append(len(deploy) - front)
    return answer