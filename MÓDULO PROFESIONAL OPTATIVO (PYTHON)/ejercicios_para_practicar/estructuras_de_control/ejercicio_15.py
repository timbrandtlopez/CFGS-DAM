'''
Escribe un programa que pida al usuario un número entero positivo y calcules la suma de la potencia de 3 de cada número desde 1 hasta el número introducido. El programa debe imprimir el resultado.
'''
num = int(input("Introduce un número entero positivo: "))
sum = 0

for i in range (1, num + 1):
    sum += i ** 3

print(f"La suma de la potencia de 3 desde 1 hasta tu número introducido es {sum}")