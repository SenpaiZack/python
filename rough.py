#This Problem was quite hectic


T = int(input())
for _ in range(T):
    N = input()
    result = []
    carry = 1
    N = N[::-1]
    for digit in N:
        new_digit = int(digit) + carry
        print(new_digit)
        if new_digit == 10:
            result.append('0')
            print(result)
            carry = 1
        else:
            result.append(str(new_digit))
            print(result)
            carry = 0
    if carry > 0:
        result.append('1')
        print(result)
    print(''.join(result[::-1]))
