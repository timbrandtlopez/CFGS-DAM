'''
Ejercicio 10
Escribe un programa que, dados dos números enteros, imprima su división decimal, su división entera y su resto. El segundo número no puede ser cero.
'''
num1 = int(input("Introduce el primer número: "))
num2 = int(input("Introduce el segundo número: "))

division_decimal = num1 / num2
division_entera = num1 // num2
resto = num1 % num2

print(f"División decimal: {division_decimal}")
print(f"División entera: {division_entera}")
print(f"Resto: {resto}")