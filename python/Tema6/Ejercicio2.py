class Alumno:
    _nombre = ""
    _nota = 0

    def __init__(self, nombre, nota):
        self._nombre = nombre
        self._nota = nota

    def get_alumno(self):
        print(self._nombre, self._nota)
    
    def get_nota(self):
        if(self._nota>6):
            print("La nota es aprobatoria.")
        else:
            print("La nota no es aprobatoria")

alumnito = Alumno("Sam Anzueto", 9)
alumnito.get_alumno()
alumnito.get_nota()

alumnito2 = Alumno("Jhon Doe", 5)
alumnito2.get_alumno()
alumnito2.get_nota()