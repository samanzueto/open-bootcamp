import time

curr = time.localtime()
print("Current time:", curr.tm_hour)

min = curr.tm_min
hora = curr.tm_hour

if (min != 0):
    hora-= 1
    min = 60 - min

if curr.tm_hour > 19:
    print("¡Ya te estás pasando! Es hora de salir.")
else:
    print("Aguanta, aún te faltan", hora, "horas y ", min, "minutos.")