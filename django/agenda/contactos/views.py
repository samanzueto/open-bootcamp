from asyncio.windows_events import NULL
from django.shortcuts import render, redirect
from django.contrib import messages
from django.urls import reverse
from .forms import ContactForm
from .models import Contact

def index(request, letter = NULL):
    if letter is not NULL:
        contactos = Contact.objects.filter(name__istartswith=letter)
    else:
        contactos = Contact.objects.filter(name__contains=request.GET.get('search',''))
    return render(request, 'contactos/index.html', {'contactos':contactos})

def create(request):
    form = ContactForm()
    if request.method == 'POST': 
        form = ContactForm(request.POST)
        if form.is_valid():
            form.save()
            messages.success(request, 'Contacto creado')
            return redirect('contacto_index')
    
    context = {
        'form': form,
        'title': 'Crear',
        'contacto_url': 'contacto_create',
    }    
    return render(request, 'contactos/create.html', context)

def detail(request, contacto_id):
    contacto = Contact.objects.get( id = contacto_id )
    return render(request, 'contactos/detail.html', {'contacto': contacto})

def edit(request, contacto_id):
    contacto = Contact.objects.get( id = contacto_id )
    form = ContactForm(instance=contacto)
    if request.method == 'POST': 
        form = ContactForm(request.POST, instance=contacto)
        if form.is_valid():
            form.save()
            messages.success(request, 'Contacto actualizado')
            return redirect('contacto_index')
    context = {
        'form': form,
        'title': 'Editar',
        'contacto_url': 'contacto_edit',
        'contacto_id': contacto_id
    }
    return render(request, 'contactos/create.html', context) 
    

def delete(request,contacto_id):
    contacto = Contact.objects.get( id = contacto_id )
    contacto.delete()
    messages.success(request, 'Contacto eliminado')
    return redirect('contacto_index')