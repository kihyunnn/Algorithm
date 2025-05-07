
n = int(input())
arr = [0]*n
for i in range(n):
    arr[i] = int(input())

# print(arr)

k = len(arr)

#insertion sort 오름차순

for i in range(n-1):
    idx = i
    
    for j in range(i+1, n):
        if arr[j] < arr[idx]:
            idx = j
            
    arr[i], arr[idx] = arr[idx], arr[i]
    
for i in range(n):
    print(arr[i]) 
