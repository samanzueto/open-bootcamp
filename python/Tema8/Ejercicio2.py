import classes
import pickle

def main():
    guardar_objeto()
    bocho_f = obtener_objeto()
    print(bocho_f.__repr__, '\n Haremos un cambio en la propiedad color.')
    bocho_f.color = 'caramelo'
    print(bocho_f)

def guardar_objeto():
    bocho = classes.Coche(color = "azul", ruedas = 4, puertas = 6, velocidad = 100, cilindrada = 6)
    f = open('vehiculo.bin','wb')
    pickle.dump(bocho, f)
    f.close()
    print(f'Hemos creado el {bocho} en el archivo')

def obtener_objeto():
    f = open('vehiculo.bin','rb')
    obj =pickle.load(f)
    f.close()
    return obj

if __name__ == '__main__':
    main()