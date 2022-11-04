	
# Define function to calculate sum
def Sum(i):
  if i:
    # Recursive function call
    return i + Sum(i-1)
  else:
    return 0
 
# Call calculateSum() function
temp = Sum(10)
 
# Print result
print(temp)