from datetime import date
from django.db import models

class ToDo(models.Model):
    title = models.CharField(max_length=50, blank=False, null=False)
    descripcion = models.TextField(blank=True, null=True)
    date = models.DateField(default=date.today)
    estimated_end = models.DateField(blank=True, null=True)
    priority = models.PositiveSmallIntegerField(default=3)
    
    def __str__(self):
        return self.title

