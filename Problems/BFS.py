from Queue import Queue

n = int(input())
mat = [[0]*n for _ in range(n)]

for i in range(n):
    mat[i] = list(map(int, input().split(' ')))

visited = [0]*n
q = Queue()
res=[]
start = int(input())

q.enqueue(start)
visited[start] = 1

while q.size() > 0:
    ele = q.dequeue()
    res.append(ele)
    for i in range(n):
        if(mat[ele][i] == 1 and visited[i] != 1):
            q.enqueue(i)
            visited[i] = 1

print(res)