'''
Ejercicio 6 - Triángulo de asteriscos
Escribe un programa que pida al usuario un número entero positivo y dibuje un triángulo de asteriscos con la altura especificada. Por ejemplo, si el usuario ingresa 5, el triángulo debe verse así:
*
**
***
****
*****
'''
numero = int(input("Introduce un número entero positivo: "))

for i in range(1, numero + 1):
    print('*' * i)