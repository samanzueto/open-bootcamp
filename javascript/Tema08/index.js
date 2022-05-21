function verdadero(){
    return true;
}

function asincrona(){
    setTimeout(5000);
        
    const promesa = new Promise((resolve, reject) => {
        if (true){
            resolve();
        }else{
            reject();
        }
    });

    promesa
        .then( () => console.log("Hola"))
        .catch( () => console.log("Error!") )
        .finally( () => console.log("soy una promesa") );
}


function* generaPares(){
    let id = 0;
    while(true){
        id+=2;
        if(id === 10){
            return id;
        }
        yield id;
    }
}

const gen = generaPares();
console.log(gen.next());