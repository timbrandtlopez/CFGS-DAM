'''
Ejercicio 2 - Portero de discoteca¶
Escribe un programa que simule el trabajo de un portero de discoteca. El programa debe pedir al usuario su edad y determinar en qué discoteca puede entrar. Si la edad es mayor que 18 años y menor o igual que 60, el programa debe imprimir "Puedes entrar en la discoteca normal". Si la edad es mayor que 60, el programa debe imprimir "Puedes entrar en la discoteca para viejos". Si la edad es mayor o igual que 16 y menor que 18, el programa debe imprimir "Puedes entrar en la discoteca para adolescente". Si la edad es menor que 16, el programa debe imprimir "No puedes entrar en ninguna discoteca".
'''
edad = int(input("Cuantos años tienes? "))

if edad >= 0:    

    if edad >= 18 and edad <= 60:
        print("Puedes entrar en la discoteca normal")

    elif edad > 60:
        print("Puedes entrar en la discoteca para viejos")

    # Línea 12. No hace falta poner elif edad < 18 and edad >= 16 porque si es >= 18 ya habrá entrado en el if y no ejecutará el elif.     
    elif edad >= 16:

        print("Puedes entrar en la discoteca para adolescentes")    

    else:
        print("No puedes entrar en ninguna discoteca")
        
else:
    print("No existe una edad negativa")            