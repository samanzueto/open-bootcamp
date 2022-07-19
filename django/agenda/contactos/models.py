from datetime import date
from django.db import models

class Contact(models.Model):
    name = models.CharField(max_length=50, blank=False, null=False)
    last_name = models.CharField(max_length=50, blank=False, null=False)
    mobile = models.CharField(max_length=10, blank=False, null=False)
    phone = models.CharField(max_length=10, blank=True, null=True)
    email = models.EmailField()
    address = models.CharField(max_length=255, blank=True, null=True)
    creation_date = models.DateField(default= date.today)
    
    def __str__(self):
        return self.name