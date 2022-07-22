document.getElementById("hipoteca").addEventListener("submit", function(e){
    e.preventDefault()

    capital = this.cantidad.value
    tasa = this.tasa.value
    plazo = this.plazos.value    

    if ( isNaN(capital) || capital == 0 ) { alert("Debe rellenar el campo 'Costo de la casa'"); return; }
    if ( isNaN(plazo) || plazo == 0 ) { alert("Debe rellenar el campo 'Tiempo para pagar'"); return; }
    if ( isNaN(tasa) || tasa == 0.0 ) { alert("Debe rellenar el campo 'Tasa de inter\u00e9s'"); return; }
    if ( tasa > 20.0 ) { alert("La Tasa de inter\u00e9s es superior al 20% y no es aceptable para un pr\u00e9stamo hipotecario."); return; }

    interes = tasa/1200.0
    y  = 1.0 + interes

    pago = capital * interes * Math.pow(y,plazo) / ( Math.pow(y,plazo) - 1.0 )
    this.cuota.value = (Math.round(pago *100.00) / 100.00).toFixed(2)
    document.getElementById("mensual").classList.remove("hidden")
    //alert("Cuota mensual es:"+ capital + " " + plazo + " "+ tasa + " " + cuota_dom);
});