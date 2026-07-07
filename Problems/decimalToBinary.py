def binary(num):
    b = ''
    while(num > 1):
        if(num%2 != 0):
            b = b+'1'
        else:
            b = b+'0'
        num /= 2

        if num == 1:
            return '1' + b
        
    return b


print(binary(4))
