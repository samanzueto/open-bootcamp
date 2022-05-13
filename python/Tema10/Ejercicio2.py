import tkinter

window = tkinter.Tk()

opts = { 'ipadx' : 50, 'ipady' : 5, 'fill' : tkinter.BOTH, 'anchor' : tkinter.W }

paises = ["México", "España", "Colombia"]

info_paises = ["México, oficialmente Estados Unidos Mexicanos, es un país soberano ubicado en la parte meridional de América del Norte con capital en la Ciudad de México. ", "España, también denominado Reino de España,​ es un país soberano transcontinental, miembro de la Unión Europea, constituido en Estado social y democrático de derecho y cuya forma de gobierno es la monarquía parlamentaria.", "Colombia, oficialmente República de Colombia, es un país soberano situado en la región noroccidental de América del Sur, que se constituye en un estado unitario, social y democrático de derecho cuya forma de gobierno es presidencialista."]

listbox = tkinter.Listbox(window, listvariable=tkinter.StringVar(value=paises))
listbox.pack(opts)

txt = tkinter.Text(window, height = 20, width = 70)
txt.pack(opts)

def mostrar_info(evento):
    i = listbox.curselection()[0]
    txt.delete("1.0",tkinter.END)
    txt.insert(tkinter.END,info_paises[i])
#    print(listbox.curselection()[0])

listbox.bind('<ButtonRelease>',mostrar_info)

window.title("Curso de Python - GUI")
window.mainloop()