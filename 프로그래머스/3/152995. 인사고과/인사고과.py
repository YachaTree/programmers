def solution(scores):
    wanho = scores[0]
    wanho_sum = sum(wanho)

    scores.sort(key=lambda x: (-x[0], x[1]))

    max_b = 0
    valid_scores = []

    for a, b in scores:
        if b < max_b:
            if [a, b] == wanho:
                return -1
        else:
            valid_scores.append((a, b))
            max_b = max(max_b, b)

    valid_scores.sort(key=lambda x: -(x[0] + x[1]))

    rank = 1
    prev_sum = sum(valid_scores[0])
    count = 0

    for i, (a, b) in enumerate(valid_scores):
        cur_sum = a + b

        if cur_sum < prev_sum:
            rank += count
            count = 1
            prev_sum = cur_sum
        else:
            count += 1

        if (a, b) == tuple(wanho):
            return rank

    return -1