inicio = int(input("Número inicial: "))
final = int(input("Número final: "))

while final <= inicio:
    final = int(input("El número final debe ser mayor al inicial. Introduce otro número: "))

for numero in range(inicio, final):
    if (numero % 2 == 1):
        print("El número", numero, "es impar")