def sum(i):
    sum=0
    for number in i:
        sum += number
    return sum
list = [1,14,96,97]
result = sum(list)
print("The sum of all the elements in the list: "+ str(result))
