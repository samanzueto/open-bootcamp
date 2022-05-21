const logger = require("./logger");

function dividir(a, b){
    if( (typeof a === 'number') && (typeof b === 'number') ){
        if(b>0)
            return a/b;
        throw new Error("El divisor debe ser mayor a cero.");
    }
    throw new TypeError("Los valores deben ser de tipo número.");
}

try{
    dividir(2,0);
}catch(e){
  if (e instanceof TypeError) {
    logger.error(`${e.name}: ${e.message}`);
  } else{
    logger.error(`${e.name}: ${e.message}`);
  }
}