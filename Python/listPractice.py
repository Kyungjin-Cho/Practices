spam = ['hello', 'hi', 'howdy', 'heyas']
print(spam.index('hello'))

spam = ['Zophie', 'Pooka', 'Fat-tail', 'Fooka']
spam.index('Fooka')

spam = ['cat', 'dog', 'bat']
spam.append('mouse')
spam.insert(1, 'chicken')
spam.remove('bat')
print(spam)

del spam[0]
print(spam)

spam = [2, 5, 3.14, 1, -7]
spam.sort()

print(spam)

spam.sort(reverse=True)
print(spam)