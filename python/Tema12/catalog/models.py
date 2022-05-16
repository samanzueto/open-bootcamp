from django.urls import reverse
from django.db import models

# Create your models here.
class Genre(models.Model):
    name = models.CharField(max_length=64, help_text="Pon el nombre del género")

    def __str__(self):
        return self.name

class Movie(models.Model):
    title = models.CharField(max_length=32)
    director = models.ForeignKey('Director', on_delete=models.SET_NULL, null=True)
    sinopsis = models.TextField(max_length=100, help_text="Sinopsis")
    genre = models.ManyToManyField(Genre)

    def __str__(self):
        return self.title

    def get_absolute_url(self):
        return reverse('movie-detail', args=[str()])


class Director(models.Model):
    pass