from django.contrib import admin
from django.urls import path, include
from . import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('contactos/', include('contactos.urls')),
    path('tareas/', include('tareas.urls')),
    path('', views.index, name='home'),
    path('about/', views.about, name='about')
]
