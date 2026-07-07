from collections import deque

maze = [[0, 0, 0, 0, 1, 1],
        [1, 1, 1, 1, 0, 1],
        [1, 0, 1, 1, 1, 1],
        [1, 0, 0, 0, 0, 0]
        ]

n = len(maze)
m = len(maze[0])

visited = [[False]*m for _ in range(n)]
q = deque()

visited[3][0] = True
q.append((3,0, [(3,0)]))

directions = [(0,1), (0,-1), (1,0), (-1,0)]

while  q:
    i,j, path = q.popleft()
    for di,dj in directions:
        ni,nj = di+i, dj+j

        if(ni == 0 and nj == m-1):
            print(path+[(ni,nj)])
            break

        if  0 <= ni <n and 0 <= nj < m and  not(visited[ni][nj]) and maze[ni][nj] != 0:
            visited[ni][nj] = True
            q.append((ni,nj, path+[(ni,nj)]))

