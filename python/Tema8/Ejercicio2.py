import classes
import pickle

def main():
    bocho = classes.Coche(color = "azul", ruedas = 4, puertas = 6, velocidad = 100, cilindrada = 6)
    guardar_clase(bocho)
    bocho_f = obtener_clase()
    print(f'Cambiaremos una propiedad de {bocho_f}')
    bocho_f.color = 'caramelo'
    print(f'Ahora {bocho_f}')

def guardar_clase(obj):
    f = open('vehiculo.bin','wb')
    pickle.dump(obj, f)
    f.close()
    print(f'Hemos creado {obj} en el archivo')

def obtener_clase():
    f = open('vehiculo.bin','rb')
    obj =pickle.load(f)
    f.close()
    return obj

if __name__ == '__main__':
    main()