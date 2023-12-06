def solution(data, ext, val_ext, sort_by):
    # 코드 번호 code, 제조일 date, 최대 수량 maximum, 현재 수량 remain
    # [code, date, maximum, remain]
    # [1, 203000104, 100, 80]
    
    # 데이터 data, 기준 ext, 기준값 val_ext, 정렬 기준 sort_by
    # data에서 "ext 값 < val_ext 값"인 데이터만 뽑은 후,
    # sort_by 값으로 오름차순 정렬
    
    answer = []
    lst = ["code", "date", "maximum", "remain"]
    ext_idx = lst.index(ext)
    
    for i in data:
        if i[ext_idx] < val_ext:
            answer.append(i)

    sort_idx = lst.index(sort_by)
    answer = sorted(answer, key = lambda x:x[sort_idx])

    return answer