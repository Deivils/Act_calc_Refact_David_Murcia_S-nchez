// Creo las funciones de las operaciones con sus excepciones

function suma(){
    while (true){
        try {
            let num1 = parseInt(prompt("Introduce el primer número: "))
            if(isNaN(num1)){
                throw new Error("Debes introducir un número, no texto.")
            }

            let num2 = parseInt(prompt("Introduce el segundo número: "))
            if (isNaN(num2)){
                throw new Error("Debes introducir un número, no texto.")
            }
            return num1 + num2
        } catch (error) {
            console.log("ERROR: ", error.message);
            console.log("Vuelve a empezar...");
        }
    }
}

function resta(){
    while (true){
        try {
        let num1 = parseInt(prompt("Introduce el primer número: "))
            if(isNaN(num1)){
                throw new Error("Debes introducir un número, no texto.")
            }

            let num2 = parseInt(prompt("Introduce el segundo número: "))
            if (isNaN(num2)){
                throw new Error("Debes introducir un número, no texto.")
            }
            return num1 - num2
        } catch (error) {
            console.log("ERROR: ", error.message);
            console.log("Vuelve a empezar...");
        }
    }
}

function multiplicar(){
    while (true){
        try {
            let num1 = parseInt(prompt("Introduce el primer número: "))
            if(isNaN(num1)){
                throw new Error("Debes introducir un número, no texto.")
            }

            let num2 = parseInt(prompt("Introduce el segundo número: "))
            if (isNaN(num2)){
                throw new Error("Debes introducir un número, no texto.")
            }
            return num1 * num2
        } catch (error) {
            console.log("ERROR: ", error.message);
            console.log("Vuelve a empezar...");
        }
    }
}

function divisionEntera(){

    while (true){
        try {
            let num1 = parseInt(prompt("Introduce el primer número: "))
            if(isNaN(num1)){
                throw new Error("Debes introducir un número, no texto.")
            }

            let num2 = parseInt(prompt("Introduce el segundo número: "))
            if (isNaN(num2)){
                throw new Error("Debes introducir un número, no texto.")
            }

            if (num2 == 0){
                throw new Error("No se puede dividir entre 0")
            }

            let resultado = Math.trunc(num1/num2)
            return resultado
        } catch (error) {
            console.log("ERROR: ", error.message);
            console.log("Vuelve a empezar...");
        } 

}
}

function potencia(){
    while (true){
        try {
            let num1 = parseInt(prompt("Introduce el primer número: "))
            if(isNaN(num1)){
                throw new Error("Debes introducir un número, no texto.")
            }

            let num2 = parseInt(prompt("Introduce el segundo número: "))
            if (isNaN(num2)){
                throw new Error("Debes introducir un número, no texto.")
            }
            return Math.pow(num1,num2)
        } catch (error) {
            console.log("ERROR: ", error.message);
            console.log("Vuelve a empezar...");
        }
    }
}

function factorial(num){
    if (num == 0){
        return 1
    } else{
        return num * factorial(num - 1)
    }
}


function pedirNumero(mensaje){
    while (true){
        try {
            let num = parseInt(prompt("Introduce un número del 0 al 6: "))
            if(isNaN(num)){
                throw new Error("Debes introducir un número, no texto.")
            }
            return num
        }catch (error){
            console.log("Error:", error.message);
        }
    }
}

function pedirNumeroFactorial(num){
    while (true){
        try {
            let num = parseInt(prompt("Introduce un número: "))
            if(isNaN(num)){
                throw new Error("Debes introducir un número, no texto.")
            }
            return num
        }catch (error){
            console.log("Error:", error.message);
        }
    }
}

let resultado

while (true){
console.log("--------------------------------")
console.log("--------------------------------")
console.log("-----------CALCULATOR-----------")
console.log("--------------------------------")
console.log("--------------------------------")
console.log("\u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665")

console.log("Binvenido a CALCULATOR, elija una opción:")
console.log("1. Sumar\n2. Restar\n3. Multiplicación\n4. División Entera\n5. Potencia\n6. Factorial\n0. Salir")
num = pedirNumero("Introduzca un número del 0 al 6: ")

if (num === 0){
    console.log("Has elegido salir")
    console.log("Saliendo........")
    break;

}else if(num == 1){
    console.log("Has elegido sumar!")
    resultado = suma()
    console.log(`El resultado de la suma es: ${resultado}`)

}else if(num == 2){
    console.log("Has elegido Restar!")
    resultado = resta()
    console.log(`El resultado de la resta es: ${resultado}`)

}else if(num == 3){
    console.log("Has elegido Multiplicación!")
    resultado = multiplicar()
    console.log(`El resultado de la multiplicación es: ${resultado}`)
    
}else if(num == 4){
    console.log("Has elegido Division Entera!")
    resultado = divisionEntera()
    console.log(`El resultado de la division es: ${resultado}`)

}else if(num == 5){
    console.log("Has elegido Potencia!")
    resultado = potencia()
    console.log(`El resultado de la potencia es: ${resultado}`)

}else if(num == 6){
    console.log("Has elegido Factorial")
    num = pedirNumeroFactorial(num)
    resultado = factorial(num)
    console.log(`El resultado de la factorial es: ${resultado}`)

}else{
    console.log("Entrada no válida, intentelo de nuevo")
}
console.log("\u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665")
console.log("Gracias por usar CALCULATOR, hasta la proxima!!")
console.log("\u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665 \u2665")


}