'''
Escribe un programa que pida al usuario un número entero positivo e imprima la suma de los números pares por un lado y la suma de los números impares por otro. El programa debe imprimir ambos resultados.
'''
num = int(input("Introduce un número entero positivo: "))
sum_pos = 0
sum_neg = 0

for i in range(num + 1):

    if i % 2 == 0:
        sum_pos += i
    
    else:
        sum_neg += i

print(f"La suma de números positivos que contiene el número introducido es {sum_pos}, y la suma de negativos es {sum_neg}")