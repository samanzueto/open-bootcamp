
import React, { useState, useEffect } from 'react'
import "../styles/clock.scss";

export const ClockF = () =>{
    
  const [data, setData] = useState(
    {
        fecha: new Date(),
        edad: 0,
        nombre: "Martín",
        apellidos: "San José"
    }
  );

  function tick(){
    setData((prevState) => {
        let edad = prevState.edad +1;
        return {
           ...prevState,
           fecha: new Date(),
           edad
        }
     });
  }

  useEffect(() => {
    const timerID = setInterval (
        () => tick(), 1000
     );
    return () => {
        clearInterval(timerID);
    };
  }, []);

  return (
    <div>
        <h2>
         Hora Actual:
         { data.fecha.toLocaleTimeString() }
         </h2>
         <h3>{ data.nombre } { data.apellidos }</h3>
         <h1>Edad: { data.edad }</h1>
    </div>
  )
}