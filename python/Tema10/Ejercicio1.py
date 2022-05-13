import random
import tkinter

window = tkinter.Tk()

opts = { 'ipadx' : 50, 'ipady' : 5, 'fill' : "x", 'anchor' : tkinter.W }

def desactivar_radiobuttons(activado):
    for rb in window.winfo_children():
        if rb.winfo_class() == 'Radiobutton':
            rb['state'] = tkinter.DISABLED if activado else tkinter.NORMAL


def reiniciar(event):
    global var
    var.set(-1)
    desactivar_radiobuttons(False)
    label2.config(text='')

def mostrar_seleccionado():
    op = random.randint(0, 4)
    if op == var.get():
        label2.config(text="¡¡ Ganaste un Viaje !!")
        window.after(3000, quit)
    else:
        label2.config(text="Lo sentimos. Perdiste.")
        desactivar_radiobuttons(True)    

label  = tkinter.Label(window, text="Encuentra el regalo sorpresa.")
label.pack(opts)

var = tkinter.IntVar()

for i in range(5):
    rb = tkinter.Radiobutton(window, text=f"Caja {i+1}", value=i, variable= var, command=mostrar_seleccionado)
    rb.pack(opts)

label2 = tkinter.Label(window, fg="red")
label2.pack(opts)

var.set(-1)

btn = tkinter.Button(window, text="Reiniciar")
btn.pack(opts)
btn.bind('<Button-1>',reiniciar)

window.title("Curso de Python - GUI")
window.mainloop()