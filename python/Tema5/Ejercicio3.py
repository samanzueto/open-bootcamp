anio = int(input("Año: "))

esBisiesto = lambda anio : anio % 4 == 0 and (anio % 100 != 0 or anio % 400)

print ("El año es bisiesto.") if esBisiesto(anio) else print ("El año no es bisiesto.")