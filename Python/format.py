# 정수
output_a = "{:d}".format(52)
print(output_a)

# 특정 칸에 출력
output_b = "{:5d}".format(52)
output_c = "{:10d}".format(52)
print(output_b)
print(output_c)

# 빈칸을 0으로 채움
output_d = "{:05d}".format(52)
output_e = "{:05d}".format(-52)
print(output_d)
print(output_e)

# 기호와 함께 출력
output_f = "{:+d}".format(52)
output_g = "{:+d}".format(-52)
output_h = "{: d}".format(52)
print(output_f)
print(output_g)
print(output_h)

# 조합
output_i = "{:+5d}".format(-52)
output_j = "{:=+5d}".format(-52)
output_k = "{:+05d}".format(-52)
print(output_i)
print(output_j)
print(output_k)

# float 자료형
output_l = "{:f}".format(52.273)
output_m = "{:15f}".format(52.273)
output_n = "{:+15f}".format(52.273)
output_o = "{:+015f}".format(52.273)
print(output_l)
print(output_m)
print(output_n)
print(output_o)

# 소수점 아래 자릿수 지정
output_p = "{:15.3f}".format(52.273)
output_q = "{:15.2f}".format(52.273)
output_r = "{:15.1f}".format(52.273)
print(output_p)
print(output_q)
print(output_r)

# 의미 없는 소수점 제거
output_s = 52.0
output_t = "{:g}".format(output_s)
print(output_s)
print(output_t)