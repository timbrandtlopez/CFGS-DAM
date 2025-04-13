'''
Ejercicio 1
Escribe un programa en Python que pida al usuario su nombre y edad, y luego imprima un mensaje de bienvenida customizado indicando ambos datos.
'''
nombre = input("Introduce tu nombre: ")
edad = input("Introduce tu edad: ")

print("Hola, " + nombre + "! Tienes " + edad + " años.")
print(f"Hola, {nombre}! Tienes {edad} años.")