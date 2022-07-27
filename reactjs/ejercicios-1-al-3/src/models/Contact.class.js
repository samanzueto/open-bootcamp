export class Contact {
    name = '';
    last_name = '';
    email = '';
    conected = false;

    constructor(name, last_name, email, conected){
        this.name = name;
        this.last_name = last_name;
        this.conected = conected;
        this.email = email;
    }

}