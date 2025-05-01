'''
Ejercicio 2 - Contador de números pares
Escribe un programa que pida al usuario un número entero positivo y cuente cuántos números pares hay desde 0 hasta ese número (incluido). El programa debe imprimir el resultado.
'''
numero = int(input("Introduce un número entero positivo: "))
pares = 0

for i in range(numero + 1):

    if i % 2 == 0:
        pares = pares + 1

''' Equivalente menos costoso
for i in range(numero + 1, 2):
    pares = pares + 1
'''
print(f"Número de pares: {pares}")