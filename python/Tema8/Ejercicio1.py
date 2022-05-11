# __str__ > Va para el humano en produccion
# __repr__ > Va para cuestiones técina en desarrollo
# python string methods

# ficheros
# f = open ('UBICACION_FICHERO', 'PERMISO')

# r: lecutra
# a: append
# w: escritura
# x: create

# t: texto
# b: binary

# +

def main():
    crear_archivo()
    print("Archivo creado y editado con éxito")

def crear_archivo():
    f = open('archivo.txt','a')
    datos = [
        'Este es un archivo de texto\n',
        'Creado desde Python\n'
    ]

    for dato in datos:
        if not dato.endswith('\n'):
            dato.__add__('\n')
        f.writelines(dato)
    
    f.close()

if __name__ == '__main__':
    main()

# serializar para guardar el estado de un programa
# modulo pickle para serializar

# pygame para juegos