class Alumno:
    _nombre = ""
    _nota = 0

    def __init__(self, nombre, nota):
        self._nombre = nombre
        self._nota = nota

    def getAlumno(self):
        print(self._nombre, self._nota)
    
    def getNota(self):
        print("La nota es", self._nota, ".")
        if(self._nota>8):
            print("La nota es aprobatoria.")
        else:
            print("La nota no es aprobatoria")

alumnito = Alumno("Sam Anzueto", 9)
alumnito.getAlumno()
alumnito.getNota()