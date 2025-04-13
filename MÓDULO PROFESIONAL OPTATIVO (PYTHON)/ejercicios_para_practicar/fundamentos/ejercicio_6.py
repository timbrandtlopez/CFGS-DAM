'''
Ejercicio 6
Escribe un programa que pida al usuario un número entero e imprima:
· Su doble
· Su triple
· Su mitad
· Su cuadrado
· Su raíz cuadrada
'''
import math

num = int(input("Introduce un número entero: "))

doble = num * 2
triple = num * 3
mitad = num / 2
cuadrado = num ** 2
raiz_cuadrada = math.sqrt(num)

print(f"Doble: {doble}")
print(f"Triple: {triple}")
print(f"Mitad: {mitad}")
print(f"Cuadrado: {cuadrado}")
print(f"Raíz cuadrada: {raiz_cuadrada}")