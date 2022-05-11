from functools import reduce

# Hay un error en la linea 3 al momento de recibir parametros
nums = list(map(int,input("\nIntroduce los números (separados por espacio): ").strip().split()))

odds = filter(lambda x: x % 2, nums)

res = reduce(lambda a, b: a + b, odds)

print(f'La sumatoria es: {res}')