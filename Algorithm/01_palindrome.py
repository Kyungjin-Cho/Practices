def is_palindrome(word):
    list_word=list(word)
    
    for i in range(len(word)//2):
        if list_word[i] == list_word[-i-1]:
            continue
        else:
            return False
    return True

# 테스트
print(is_palindrome("racecar"))
print(is_palindrome("stars"))
print(is_palindrome("토마토"))
print(is_palindrome("kayak"))
print(is_palindrome("hello"))