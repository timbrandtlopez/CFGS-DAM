'''
Ejercicio 9
Escribe un programa que pida el precio de un producto y, si supera los 100€, aplique un descuento del 10%. Muestra el precio final.
'''
precio = float(input("Introduce el precio del producto: "))

if precio > 100:
    precio = precio * (1-0.1)
    print("Como supera los 100€ te aplicamos el 10% de descuento")

print(f"Este artículo te vale {precio}€")