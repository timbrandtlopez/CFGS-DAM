'''
Ejercicio 3 - Pacman
Escribe un programa que pida al usuario dos números enteros correspondientes a la casilla que está Pacman (1er número) y a la que está un fantasma (2o número), luego debe introducir "normal" o "caramelo". Si el texto es "normal" y los números son iguales, el programa debe imprimir "Pacman ha sido atrapado". Si el texto es "caramelo" y los números son iguales, el programa debe imprimir "Pacman ha comido el fantasma". En cualquier otro caso, el programa debe imprimir "Pacman ha escapado".
'''
pos_pacman = int(input("¿Cuál es la posición de pacman? "))
pos_fantasma = int(input("¿Cuál es la posición del fantasma? "))

if pos_pacman == pos_fantasma:
    estado_pacman = input("Caramelo o normal? ").lower()
    if estado_pacman == "caramelo":
        print("Pacman ha comido al fantasma")
    elif estado_pacman == "normal":
        print("Pacman ha sido atrapado")    
    else:
        print("Pacman ha escapado")    
else:
    print("Pacman ha escapado")