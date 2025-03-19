from collections import deque

def solution(n, roads, sources, destination):
    graph = [[] for _ in range(n + 1)]
    for a, b in roads:
        graph[a].append(b)
        graph[b].append(a)
    
    distance = [-1] * (n + 1)
    distance[destination] = 0
    
    q = deque([destination])
    while q:
        current = q.popleft()
        for neighbor in graph[current]:
            if distance[neighbor] == -1:
                distance[neighbor] = distance[current] + 1
                q.append(neighbor)
    
    answer = [distance[source] for source in sources]
    return answer