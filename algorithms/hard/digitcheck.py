from doctest import DocFileCase


digs = input('身份证前17位: ')
if len(digs) != 17 or digs.isdigit() == False:
    print('incorect input')
else:
    print('身份证第18位: '+ ['1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'][sum([int(digs[i]) * [7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2][i] for i in range(17)]) % 11])


