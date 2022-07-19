from django.forms import ModelForm, DateInput, ValidationError
from .models import ToDo
from datetime import date, datetime

class ToDoForm(ModelForm):
    def __init__(self, *args, **kwargs):
        super(ToDoForm, self).__init__(*args, **kwargs)
        for key, field in self.fields.items():
            if key != 'estimated_end':
                field.widget.attrs = {
                    'class': 'form-control mt-3',
                    'placeholder': field.label
                    }

    class Meta:        
        model = ToDo
        # fields = '__all__'
        exclude = ('date', )
        widgets = {
            'estimated_end': DateInput(format=('%Y-%m-%d'), attrs={'min':date.today, 'class': 'form-control', 'type':'date'}),
        }

    def clean_estimated_end(self):        
        end_date = self.cleaned_data['estimated_end']        
        
        if end_date is not None:
            if end_date <= datetime.now().date():
                raise ValidationError("End date must be later than start date")

        # Always return a value to use as the new cleaned data, even if
        # this method didn't change it.
        return end_date