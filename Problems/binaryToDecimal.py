def decimal(num):
    dec = 0
    count = 0

    while(num>0):
        if(num%10 == 1):
            dec += pow(2,count)
        count += 1
        num //= 10
    return dec

print(decimal(11))