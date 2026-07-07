n,m = map(int, input().split(' '))
switch = []

for _ in range(n):
    switch.append(list(input()))

# for i in range(m):
#     switch[0][i] = int(switch[0][i])


lamp = [0]*m

flag = True
for i in range(n):
    flag = True
    for j in range(m):
        if(switch[i][j] == '1' and lamp[j] == 0):
            flag = False
            lamp[j] = 1
    if flag:
        break
    
# print(lamp)

# flag= True
# for i in range(m):
#     if(int(switch[0][i]) <= 1):
#         flag = False
#         break
    
if flag:
    print('Yes')
else:
    print('No')

# print(switch)

# if i < n-1:
#     print('Yes')
# else:
#     print('No')


        
            