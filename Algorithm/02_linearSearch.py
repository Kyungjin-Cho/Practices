def linear_search(element, some_list):
    # 코드를 작성하세요.
    for i in range(len(some_list)):
        if element == some_list[i]:
            return i
            break
        elif element != some_list[i] and i == len(some_list):
            return None
        else:
            continue

print(linear_search(2, [2, 3, 5, 7, 11]))
print(linear_search(0, [2, 3, 5, 7, 11]))
print(linear_search(5, [2, 3, 5, 7, 11]))
print(linear_search(3, [2, 3, 5, 7, 11]))
print(linear_search(11, [2, 3, 5, 7, 11]))
