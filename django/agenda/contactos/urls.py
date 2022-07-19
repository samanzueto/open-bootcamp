from django.urls import path
from . import views

urlpatterns = [
    path('', views.index, name='contacto_index'),
    path('<letter>', views.index, name='contacto_index'),
    path('create/', views.create, name='contacto_create'),
    path('edit/<int:contacto_id>', views.edit, name='contacto_edit'),
    path('detail/<int:contacto_id>', views.detail, name='contacto_detail'),
    path('delete/<int:contacto_id>', views.delete, name='contacto_delete'),
]