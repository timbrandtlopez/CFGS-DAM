'''
Ejercicio 10
Escribe un programa que pida día, mes y año. Comprueba si la fecha introducida es válida. Recuerda que, en los años bisiestos, febrero tiene 29 días. Puedes usar el algoritmo del ejercicio 6 para determinar si un año es bisiesto.
Recuerda tener en cuenta los días de cada mes y los años bisiestos. No solo tienes que comprobar si el mes es válido, sino también si el día es válido para ese mes y año. Por ejemplo, febrero tiene 29 días en años bisiestos y 28 en años no bisiestos. Además, abril, junio, septiembre y noviembre tienen 30 días, mientras que enero, marzo, mayo, julio, agosto, octubre y diciembre tienen 31 días.
'''
dia = int(input("Introduce un día: "))
mes = int(input("Introduce un mes (1 - 12): "))
año = int(input("Introduce un año: "))

if mes < 1 or mes > 12:
    print("Mes no válido.")

else:

    if dia < 1:
        print("Fecha no válida.")

    elif mes == 2:

        if (año % 4 == 0 and año % 100 != 0) or (año % 400 == 0):

            if dia > 29:
                print("Fecha no válida.")

            else:
                print(f"La fecha {dia}/{mes}/{año} es válida.")

        else:

            if dia > 28:
                print("Fecha no válida.")

            else:
                print(f"La fecha {dia}/{mes}/{año} es válida.")

    elif mes in [4, 6, 9, 11]:

        if dia > 30:
            print("Fecha no válida.")

        else:
            print(f"La fecha {dia}/{mes}/{año} es válida.")

    else:

        if dia > 31:
            print("Fecha no válida.")
            
        else:
            print(f"La fecha {dia}/{mes}/{año} es válida.")