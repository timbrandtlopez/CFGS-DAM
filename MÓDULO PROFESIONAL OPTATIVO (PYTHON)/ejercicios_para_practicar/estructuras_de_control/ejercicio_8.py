'''
Ejercicio 8
Escribe un programa que pida el nombre de un mes y muestre cuántos días tiene (puedes simplificar febrero a 28 días siempre).
'''
mes = input("Introduce el nombre de un mes: ").lower()

if mes == 'enero' or mes == 'marzo' or mes == 'mayo' or mes == 'julio' or mes == 'agosto' or mes == 'octubre' or mes == 'diciembre':
    print(f"{mes.capitalize()} tiene 31 días")

elif mes == 'abril' or mes == 'junio' or mes == 'septiembre' or mes == 'noviembre':
    print(f"{mes.capitalize()} tiene 30 días")

elif  mes == 'febrero':
    print(f"{mes.capitalize()} tiene 28 días")