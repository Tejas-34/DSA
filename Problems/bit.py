
#------- clear the i'th bit -------
num = 13
bit = 2
print(num ^ (bit<<1))







#------- set i'th bit -------
# num=4
# bit =1
# print(num | (bit<<1))



#---- does i'th bit is set --------
# num = 3
# bit = 0

# if(bit == 0):
#     print(num&1)

# if (num & (bit<<1)):
#     print('Yes')
# else:
#     print('No')




#-------- max of two number ----
# a = -8
# b = -6
# diff = a + (~b+1)
# k = diff>>31 & 1
# print(a*(1-k) + b*k)



#------ swap numbers ---- 
# a = a^b
# b = a^b
# a = a^b

# print(a,b) : 2,1: 10, 01 : 10^01: 11, 11^01: 10, 10^11: 01 

