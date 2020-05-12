def linear_search(element, some_list):
    input_list = list(some_list)
    ele = element

    for i in range(0, len(input_list)):
        if ele == input_list[i]:
            return i
            break

        elif i == len(input_list) and ele != input_list[i]:
            return None
        else:
            continue

print(linear_search(2, [2, 3, 5, 7, 11]))
print(linear_search(0, [2, 3, 5, 7, 11]))
print(linear_search(5, [2, 3, 5, 7, 11]))
print(linear_search(3, [2, 3, 5, 7, 11]))
print(linear_search(11, [2, 3, 5, 7, 11]))