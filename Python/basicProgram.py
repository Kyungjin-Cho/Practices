# This program says hello and asks for my name
# Functions = mini-programs in your program
# Value passed to functions = Arguments
print('Hello world!')
print('What is your name?') # ask for their name

myName = input() # let user type in a value

print('It is good to meet you, ' + myName)
# str(), int(), float(): convert values' data type
# len(): takes a string value and returns an integer value of the string's length
print('The length of your name is ' + str(len(myName))) 
print('What is your age?') # ask for their age

myAge = input()

print('You will be ' + str(int(myAge) + 1) + ' in a year.')
