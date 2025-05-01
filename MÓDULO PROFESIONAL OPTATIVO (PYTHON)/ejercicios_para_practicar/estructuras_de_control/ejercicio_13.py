'''
Escribe un programa que pida al usuario un número entero positivo e imprima la tabla de multiplicar de ese número (del 1 al 10).
'''
numero = int(input("Introduce un número entero positivo: "))

for i in range (1, 10 + 1):
    print(f"{numero} x {i} = {numero * i}")