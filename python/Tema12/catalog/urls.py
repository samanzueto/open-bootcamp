#from django.conf.urls import url
#from . import views

from unicodedata import name


urlpatterns = [
    url(r'^$', views.index, name="index")
]