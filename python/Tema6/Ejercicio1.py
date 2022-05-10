class Vehiculo:
    color = ""
    ruedas = 0
    puertas = 0

    def __init__(self, color, ruedas, puertas):
        self.color = color
        self.ruedas = ruedas
        self.puertas = puertas

class Coche(Vehiculo):
    velocidad = 0
    cilindrada = 0

    def __init__(self, **kwargs):
        super().__init__(kwargs['color'] , kwargs['ruedas'] , kwargs['puertas'])
        self.velocidad = kwargs['velocidad']
        self.cilindrada = kwargs['cilindrada']

bocho = Coche(color = "azul", ruedas = 4, puertas = 6, velocidad = 100, cilindrada = 6)
print(vars(bocho))