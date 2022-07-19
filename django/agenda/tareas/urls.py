from django.urls import path
from . import views

urlpatterns = [
    path('', views.index, name='todo_index'),
    path('create/', views.create, name='todo_create'),
    path('edit/<int:todo_id>', views.edit, name='todo_edit'),
    path('detail/<int:todo_id>', views.detail, name='todo_detail'),
    path('delete/<int:todo_id>', views.delete, name='todo_delete'),
]