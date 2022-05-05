peso = int(input("¿Cuál es tu peso en kg? "))
estatura = float(input("¿Cuál es tu estatura en metros? "))
imc = peso / (estatura**2)

#Bajo peso = menos de 18.5
#Peso normal = 18.5–24.9
#Sobrepeso = 25–29.9
#Obesidad = IMC de 30 ó mayor

print('Tu IMC es %s' % ("{:.2f}".format(imc)) )

if imc < 18.5 :
    print('Cuidado tienes bajo peso')
elif imc >= 18.5 and imc <= 24.9 :
    print('Tienes peso normal')
elif imc >= 25 and imc <= 29.9 :
    print('Tienes sobrepeso')
else:
    print('Cuidado porque tienes obesidad')
