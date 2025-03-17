def solution(mats, park):
    mats.sort(reverse=True)
    rows, cols = len(park), len(park[0])

    def can_place_mat(size):
        for r in range(rows - size + 1):
            for c in range(cols - size + 1):
                if all(park[i][j] == "-1" for i in range(r, r + size) for j in range(c, c + size)):
                    return True
        return False

    for size in mats:
        if can_place_mat(size):
            return size

    return -1