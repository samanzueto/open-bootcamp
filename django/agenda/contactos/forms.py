from django.forms import ModelForm
from .models import Contact

class ContactForm(ModelForm):
    def __init__(self, *args, **kwargs):
        super(ContactForm, self).__init__(*args, **kwargs)
        for key, field in self.fields.items():
            field.widget.attrs = {
                'class': 'form-control mt-3',
                'placeholder': field.label
                }

    class Meta:        
        model = Contact
        # fields = '__all__'
        exclude = ('creation_date', )
        # field_classes = {
        #     'name': 'form-group',
        # }