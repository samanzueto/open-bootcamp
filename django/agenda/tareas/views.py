from django.shortcuts import render, redirect
from django.contrib import messages
from django.urls import reverse
from .forms import ToDoForm
from .models import ToDo

def index(request):
    todo = ToDo.objects.filter(title__contains=request.GET.get('search',''))
    return render(request, 'tareas/index.html', {'todo':todo})

def create(request):
    form = ToDoForm()
    if request.method == 'POST': 
        form = ToDoForm(request.POST)
        if form.is_valid():
            form.save()
            messages.success(request, 'Tarea creada')
            return redirect('todo_index')
    
    context = {
        'form': form,
        'title': 'Crear',
        'todo_url': 'todo_create',
    }    
    return render(request, 'tareas/create.html', context)

def detail(request, todo_id):
    tarea = ToDo.objects.get( id = todo_id )
    return render(request, 'tareas/detail.html', {'todo': tarea})

def edit(request, todo_id):
    tarea = ToDo.objects.get( id = todo_id )
    form = ToDoForm(instance=tarea)
    if request.method == 'POST': 
        form = ToDoForm(request.POST, instance=tarea)
        if form.is_valid():
            form.save()
            messages.success(request, 'Tarea actualizada')
            return redirect('todo_index')
    context = {
        'form': form,
        'title': 'Editar',
        'todo_url': 'todo_edit',
        'todo_id': todo_id
    }
    return render(request, 'tareas/create.html', context) 
    

def delete(request,todo_id):
    tarea = ToDo.objects.get( id = todo_id )
    tarea.delete()
    messages.success(request, 'Tarea eliminada')
    return redirect('todo_index')