def fibonacci(S):
    if S<=1:
        return S
    else:
        return (fibonacci(S-1) + fibonacci(S-2))
temp= int(input("Enter a number: "))

if temp<=0:
    Print("Please enter a positive number.")
else:
    print("Fibonacci numbers are:")
    for A in range(temp):
        print(fibonacci(A))



