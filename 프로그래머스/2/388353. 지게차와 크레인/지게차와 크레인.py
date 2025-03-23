def solution(storage, requests):
    from collections import deque

    n, m = len(storage), len(storage[0])
    grid = [list(row) for row in storage]

    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]

    def is_valid(x, y):
        return 0 <= x < n and 0 <= y < m

    def build_outside_reachable():
        outside = [[False] * m for _ in range(n)]
        queue = deque()

        for i in range(n):
            for j in range(m):
                if (i == 0 or i == n - 1 or j == 0 or j == m - 1) and grid[i][j] is None:
                    outside[i][j] = True
                    queue.append((i, j))

        while queue:
            x, y = queue.popleft()
            for dx, dy in directions:
                nx, ny = x + dx, y + dy
                if is_valid(nx, ny) and not outside[nx][ny] and grid[nx][ny] is None:
                    outside[nx][ny] = True
                    queue.append((nx, ny))

        return outside

    def forklift_remove(target):
        outside = build_outside_reachable()
        to_remove = []

        for i in range(n):
            for j in range(m):
                if grid[i][j] == target:
                    accessible = False
                    for dx, dy in directions:
                        nx, ny = i + dx, j + dy
                        if not is_valid(nx, ny):
                            accessible = True
                            break
                        if grid[nx][ny] is None and outside[nx][ny]:
                            accessible = True
                            break

                    if accessible:
                        to_remove.append((i, j))

        for x, y in to_remove:
            grid[x][y] = None

    def crane_remove(target):
        for i in range(n):
            for j in range(m):
                if grid[i][j] == target:
                    grid[i][j] = None

    for req in requests:
        if len(req) == 1:
            forklift_remove(req)
        else:
            crane_remove(req[0])
    return sum(1 for i in range(n) for j in range(m) if grid[i][j] is not None)
