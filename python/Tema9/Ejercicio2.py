from functools import reduce

def sumatoria_impares(lista):
    odds = filter(lambda x: x % 2, lista)
    res = reduce(lambda a, b: a + b, odds)
    print(f'La sumatoria es: {res}')

nums = list(map(int,input("\nIntroduce los números (separados por espacio): ").strip().split()))
sumatoria_impares(nums)