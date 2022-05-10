import time

curr = time.localtime()

min = 59 - curr.tm_min
hora = 18 - curr.tm_hour

if curr.tm_hour > 19:
    print("¡Ya te estás pasando! Es hora de salir.")
else:
    print("Aguanta, aún te faltan", hora, "horas y ", min, "minutos.")