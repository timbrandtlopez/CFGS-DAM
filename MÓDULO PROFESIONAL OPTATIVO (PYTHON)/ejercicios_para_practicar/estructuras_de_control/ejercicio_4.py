'''
Ejercicio 4
Escribe un programa que pida una nota (0-10) y muestre:
· "Suspenso" si es menor de 5
· "Aprobado" si es entre 5 (excluído) y 7 (excluído)
· "Notable" si es entre 7 y 8 (excluído)
· "Sobresaliente" si es 9 o 10
'''
nota = float(input("Introduce tu nota (0-10): "))

if nota < 5:
    print(f"Tu nota {nota} equivale a suspenso")

elif nota >= 5 and nota <= 10:

    if 5 <= nota < 7:
        print(f"Tu nota {nota} equivale a aprobado")
    
    elif 7 <= nota < 9:
        print(f"Tu nota {nota} equivale a notable")
    
    else:
        print(f"Tu nota {nota} equivale a sobresaliente")
        
else:
    print(f"{nota} no es un valor dentro del rango de notas: 0 - 10")