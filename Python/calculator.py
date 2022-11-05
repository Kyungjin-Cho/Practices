

calculator = True

while calculator:
    first_num = int(input("Choose a number: "))
    second_num = int(input("Choose another one: "))

    operation = input(
        "Choose an operation:\n- Options are: +, -, * or /.\n-Write 'exit' to finish.\n")

    if operation == 'exit':
        calculator = False
        print("End!")
    elif operation == '+':
        result = first_num + second_num
        print("Result: ", result)
    elif operation == '-':
        result = first_num - second_num
        print("Result: ", result)
    elif operation == '*':
        result = first_num * second_num
        print("Result: ", result)
    elif operation == '/':
        result = first_num / second_num
        print("Result: ", result)
