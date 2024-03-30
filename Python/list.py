# list
spam = ['cat', 'bat', 'rat', 'elephant']

print(spam)
print(spam[0])
print(spam[1])
print(spam[2])
print(spam[3])

# list of list
spam = [['cat', 'bat'], [10, 20, 30, 40, 50]]
print(spam[0])
print(spam[1])
print(spam[0][1])

# negative index
spam = ['cat', 'bat', 'rat', 'elephant']
print(spam[-1])
print(spam[-2])

# change list item
spam = [10, 20, 30]
spam[1] = 'Hello'
print(spam)

# slice list
print(spam[1:])
print(spam[:2])

# del Statement = "Unassignment" statement
print(len([1, 2, 3]))
print([1, 2, 3] + [4, 5, 6])
print([1, 2, 3] * 3)
print(list('Hello'))
print('howdy' in ['hello', 'hi', 'howdy', 'heyas'])
print(42 in ['hello', 'hi', 'howdy', 'heyas'])
print('howdy' not in ['hello', 'hi', 'howdy', 'heyas'])