inicio = int(input("Número inicial: "))
final = int(input("Número final: "))

for numero in range(inicio, final):
    if (numero % 2 == 1):
        print("El número", numero, "es impar")