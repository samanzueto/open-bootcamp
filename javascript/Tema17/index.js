let marker, map;

function initMap() {
  const pos = [{
    lat: -25.344,
    lng: 131.031
  },
  {
    lat: 41.4669874,
    lng: 12.9033499
  } 
  ]

  map = new google.maps.Map(document.getElementById("map"), {
    zoom: 4,
    center: pos[0],
  });
  
  marker = new google.maps.Marker({
    position: pos[0],
    map,
    title: "Posición"
  });

  pos.forEach( mark => {
    new google.maps.Marker({
      position: mark,
      map
    });
  }

  );
  geoPosiciona();
}

function geoPosiciona(){
  if(navigator.geolocation){
    const geoloc = navigator.geolocation;
    const ops = { timeout: 60000 };
    const watchpos = geoloc.watchPosition(centraMapa, onError, ops);
  }else{
    alert("Tu navegador no admite geolocalización.");
  }
}

function centraMapa(position){
  const nva_pos = {
    lat: position.coords.latitude,
    lng: position.coords.longitude
  }

  marker.setPosition(nva_pos);
  map.setCenter(nva_pos);
}

function onError(error){
  console.error(error);
}

window.initMap = initMap;