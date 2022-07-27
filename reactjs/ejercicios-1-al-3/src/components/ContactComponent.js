import React, { Component } from 'react';
import PropTypes from 'prop-types';
import { Contact } from '../models/Contact.class';

class ContactComponent extends Component{

    render(){
        const { contact } = this.props
        return (
            <div className='rounded-xl p-8 bg-slate-100 shadow-xl md:p-3 dark:bg-slate-800'>
                <h1 className='text-sky-500 dark:text-sky-400'>{ contact.name } { contact.last_name }</h1>
                <p className='text-slate-700 dark:text-slate-500'>{ contact.email }  <span className='px-1.5 ring-1 ring-slate-200 rounded dark:ring-slate-600'>{ contact.conected ? 'En línea' : 'No disponible' }</span></p>
            </div>
        );
    }

    conection = () => {
        this.setState((prevState) => (
            {
                conection: !prevState.conection
            }
        ))
    }
}

ContactComponent.propTypes = {
    contact: PropTypes.instanceOf(Contact),
};

export default ContactComponent;