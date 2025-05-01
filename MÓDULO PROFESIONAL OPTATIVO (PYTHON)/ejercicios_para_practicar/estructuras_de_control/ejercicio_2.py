'''
Ejercicio 2
Escribe un programa que pida al usuario un número entero y determine si es positivo, negativo o cero. El programa debe imprimir un mensaje indicando el resultado.
'''
numero = int(input("Introduce un número entero: "))

if numero > 0:
    print(f"El número {numero} es positivo")
    
elif numero < 0:
    print(f"El número {numero} es negativo")

else:
    print(f"El número {numero} es cero")