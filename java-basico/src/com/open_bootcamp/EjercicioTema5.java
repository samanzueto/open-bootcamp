package com.open_bootcamp;

/**
 * Crear una interfaz CocheCRUD.

    Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

    Como métodos de CocheCRUD podemos poner:

    save() findAll() delete() que simplemente impriman por consola el nombre del propio método.

    Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

    Ejemplo:

    CocheCRUD cocheCrud = new CocheCRUDImpl()
 */
public class EjercicioTema5 {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}

interface CocheCRUD{
    void save();
    void findAll();
    void delete();
}

class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        // TODO Auto-generated method stub
        System.out.println("Guardamos el coche");
    }

    @Override
    public void findAll() {
        // TODO Auto-generated method stub
        System.out.println("Buscamos coche");
    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub
        System.out.println("Eliminamos coche");
    }
}