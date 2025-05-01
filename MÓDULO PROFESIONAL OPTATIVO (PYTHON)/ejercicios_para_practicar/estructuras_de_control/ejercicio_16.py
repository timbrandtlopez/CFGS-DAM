'''
Escribe un programa que pida al usuario un número entero positivo e imprima la lista de divisores de ese número. Un divisor de un número n es un número entero que divide a n sin dejar residuo. El programa debe imprimir todos los divisores del número introducido.
'''
num = int(input("Introduce un número entero positivo: "))

print(f"Los divisores de {num} son: ", end=" ")

for i in range (1, num + 1):

    if num % i == 0:
        print(i, end=" ") 