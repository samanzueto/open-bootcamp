numero = int(input("Número: "))

def esPrimo(numero):
    if numero < 2 or numero == 4:
        return False

    for primo in range(3,numero):
        if(numero % primo == 0):
            return False
    
    return True

print("El numero", numero, "es primo") if esPrimo(numero) else print("El numero", numero, "no es primo")