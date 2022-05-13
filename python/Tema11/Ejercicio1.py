import sqlite3

conn = sqlite3.connect('python/Tema11/escuela.db')
cursor = conn.cursor()

listado = [
    ("Sam", "Anzueto"),
    ("Andy", "Mora"),
    ("Kriss", "Suzuki"),
    ("Anto", "Dimitri"),
    ("Isa", "Vela"),
    ("Xade", "Toledo")
]

query = 'INSERT INTO alumnos(nombre, apellido) VALUES (?,?)'

cursor.executemany(query,listado)
conn.commit()

query = 'SELECT * FROM alumnos'
for row in cursor.execute(query):
    print(row)

cursor.close()
conn.close()