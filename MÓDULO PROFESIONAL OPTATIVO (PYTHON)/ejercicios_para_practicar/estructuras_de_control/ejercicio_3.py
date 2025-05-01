'''
Ejercicio 3
Escribe un programa que pida al usuario un número entero y determine si es divisible por 3 y 5. El programa debe imprimir un mensaje indicando el resultado.
'''
numero = int(input("Introduce un número entero: "))

if numero % 3 == 0 and numero % 5 == 0:
    print(f"El número {numero} es divisible por 3 y 5")

else:
    print(f"El número {numero} no es divisible por 3 y 5")