def solution(k, room_number):
    parent = {}

    def find(x):
        path = []
        while x in parent:
            path.append(x)
            x = parent[x]
        for p in path:
            parent[p] = x
        return x

    answer = []
    for room in room_number:
        empty = find(room)
        parent[empty] = empty + 1
        answer.append(empty)

    return answer
