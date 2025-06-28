n = int(input())
major = list(map(int, input().split()))

max = 0
sum = 0

for i in range(n):
    if major[i] > max :
        max = major[i]
        
for i in range(n):
    major[i] = major[i]/max*100
    sum += major[i]
    
print(sum/n)