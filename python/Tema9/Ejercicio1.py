paises = list(str(input('\nLista de paises (separados por coma): ')).split(','))

ordenados = set(sorted(map(str.strip,paises)))

#for pais in ordenados:
#    print(f'{pais.title()},')

print(", ".join(map(str.title, ordenados)))