def sumar(*args):
    res = 0
    for num in args:
       res +=num 
    return res

def restar(*args):
    res = args[0]
    for num in range(1, len(args)):
       res -=args[num]
    return res

def multiplicar(num1, num2):
    return num1 * num2

def dividir(num1, num2):
    if(num2 < 1):
        return "El divisor tiene que ser mayor a cero."
    return num1 / num2