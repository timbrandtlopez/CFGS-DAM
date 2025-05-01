'''
Ejercicio 5
Escribe un programa que pida el nombre de un día de la semana y muestre si es "laborable" o "fin de semana".
'''
dia = input("Dime un día de la semana: ").lower()

if dia == 'lunes' or dia == 'martes' or dia == 'miércoles' or dia == 'jueves' or dia == 'viernes':
    print(f"{dia.capitalize()} es un día laborable")

elif dia == 'sábado' or dia == 'domingo':
    print(f"{dia.capitalize()} es un día de fin de semana")

else:
    print(f"{dia.capitalize()} no es un día de la semana")
