# Creo las funciones de las operaciones e introduzco en ellas la excepciones necesarias

def suma():
    while True:
        try:
            print("Has elegido Suma\n")
            num1 = int(input("Introduce el primer número: "))
            num2 = int(input("Introduce el segundo número: "))
            resultado = num1 + num2
            print(f"El resultado de sumar {num1} + {num2} es: {resultado}")
            break
        except ValueError:
            print("Error: Debes introducir un número, no vale texto.")

            
def resta():
    while True:
        try:
            print("Has elegido Resta\n")  
            num1 = int(input("Introduce el primer número: "))
            num2 = int(input("Introduce el segundo número: "))
            resultado = num1 - num2
            print(f"El resultado de restar {num1} - {num2} es: {resultado}")
            break
        except ValueError:
            print("Error: Debes introducir un número, no vale texto.")


def multiplicar():
    while True:
        try:
            print("Has elegido Multiplicar\n")
            num1 = int(input("Introduce el primer número: "))
            num2 = int(input("Introduce el segundo número: "))
            resultado = num1 * num2
            print(f"El resultado de multiplicar {num1} * {num2} es: {resultado}")
            break
        except ValueError:
            print("Error: Debes introducir un número, no vale texto.")

    

def division_Entera():
    while True:
        try:
            print("Has elegido la División Entera\n")
            num1 = int(input("Introduce el primer número: "))
            num2 = int(input("Introduce el segundo número: "))
            resultado = num1 // num2
            print(f"El resultado de la División entera entre {num1} / {num2} es: {resultado}")
            break
        except ZeroDivisionError:
            print("Error, no se puede dividir entre 0")
            print("Vuelve a introducir los números desde el principio: ")
        except ValueError:
            print("Error: Debes introducir un número, no vale texto.")



def potencia():
    while True:
        try:
            print("Has elegido Potencias\n")
            num1 = int(input("Introduce el primer número: "))
            num2 = int(input("Introduce el segundo número: "))
            resultado = num1 ** num2
            print(f"El resultado de elevar {num1} a la potencia de {num2} es: {resultado}")
            break
        except ValueError:
            print("Error: Debes introducir un número, no vale texto.")


# Ha servido la clase de Gloria, pues hicimos un algoritmo de factorial y lo tenia en la libreta.
def factorial(num):
    if num == 0:
        return 1
    else:
        return num * factorial(num -1)

# Hago una función para pedir el número de entrada a la calculadora.    
def pedir_Numero(mensaje):
    while True:
        try:
            return int(input(mensaje))
        except ValueError:
            print("Error: Debes introducir un número, no vale texto.")

#Creo una función para pedir el número factorial y le meto la función factorial dentro
def pedir_Numero_Factorial():
    while True:
        try:
            print("Has elegido Factorial\n")
            num = int(input("Por favor, introduce un número: "))
            resultado = factorial(num)
            print(f"El resultado de hacer el factorial de {num} es: {resultado}")
            break
        except ValueError:
            print("Error: Debes introducir un número, no vale texto.")
    
while True:
    print("\u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665")    

    print("   ---------------------------------")
    print("   ---------------------------------")
    print("  -----------------------------------")
    print("-------------CALCULATOR----------------")
    print("  -----------------------------------")
    print("   ---------------------------------")
    print("   ---------------------------------")
    print("\u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665")    

    print("Bienvenido a CALCULATOR, elija una opción:")
    print("1. Suma\n2. Resta\n3. Multiplicación\n4. División Entera\n5. Potencias\n6. Factorial\n0. Salir" )
    
    num = pedir_Numero("Introduce un número del 0 al 6: ")
    
    
    if num == 0:
        print("Saliendo de CALCULATOR")
        break

    elif (num == 1):

        suma()
        
    elif(num == 2):

        resta()

    elif(num == 3):
        
        multiplicar()
        
    elif(num == 4):
        
        division_Entera()
        

    elif(num == 5):
        
        resultado = potencia()
        
        
    elif(num == 6):
            
        pedir_Numero_Factorial()
                
    else:
        print("Entrada no válida, vuelve a intentarlo")
print("\u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665")    
print("Gracias por usar CALCULATOR, hasta la próxima!!!!")
print("\u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665")