'''
Ejercicio 7
Escribe un programa que pida dos números y un operador (+, -, *, /) y muestre el resultado de la operación.
'''
numero1 = float(input("Primer número: "))
numero2 = float(input("Segundo número: "))
operador = input("Introduce un operador (+, -, *, /): ")

if operador == '+':
    suma = numero1 + numero2
    print(f"La suma de {numero1} más {numero2} da el resultado {suma}")

elif operador == '-':
    resta = numero1 - numero2
    print(f"La resta de {numero1} menos {numero2} da el resultado {resta}")

elif operador == '*':
    multiplicacion = numero1 * numero2
    print(f"La multiplicación de {numero1} por {numero2} da el resultado {multiplicacion}")

elif operador == '/':
    division = numero1 / numero2
    print(f"La división de {numero1} entre {numero2} da el resultado {division}")

else:
    print(f"{operador} no es un operador")