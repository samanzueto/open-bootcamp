import React, { Component } from 'react';
import { Contact } from '../models/Contact.class';
import ContactComponent from './ContactComponent';

class ContactListComponent extends Component{

    render(){

        return (
            <div className='p-6'>
                <h1 className='text-3xl font-bold dark:text-white'>Contactos</h1>
                <div className='w-full flex items-center justify-between block p-6 space-x-6'>
                    <ContactComponent contact={ new Contact('Sam','Anzueto','sam@o-b.com',false) }></ContactComponent>
                </div>                
            </div>
        );
    }
}

export default ContactListComponent;
