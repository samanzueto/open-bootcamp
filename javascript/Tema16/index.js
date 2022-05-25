const parrsDraggable = document.querySelectorAll(".parrafo");

// const secciones = document.querySelectorAll(".seccion");

parrsDraggable.forEach(parr => {
    parr.addEventListener("dragstart", event =>{
        // console.log("Inicia arrestre")
        parr.classList.add("dragging");
        event.dataTransfer.setData("id", parr.id);

        const elemento = document.querySelector(".img-drag");
        event.dataTransfer.setDragImage(elemento, 0, 0);
    });
    parr.addEventListener("dragend", ()=>{
        // console.log("Final arrestre")
        parr.classList.remove("dragging");
    });
});

// secciones.forEach(seccion =>{
//     seccion.addEventListener("dragover", event =>{
//         event.preventDefault();
//         // console.log("Drag");
//         event.dataTransfer.dropEffect = "copy";
//     });

//     seccion.addEventListener("drop", event =>{
//         // console.log("Drop");
//         const id_parr = event.dataTransfer.getData("id");
//         // console.log(id_parr);
//         const parr = document.getElementById(id_parr);
//         seccion.appendChild(parr);
//     });
// });

const basura = document.querySelector("#basura");

basura.addEventListener("dragover", event =>{
    event.preventDefault();
    // console.log("Drag");
    event.dataTransfer.dropEffect = "copy";
});

basura.addEventListener("drop", event =>{
    // console.log("Drop");
    const id_parr = event.dataTransfer.getData("id");
    // console.log(id_parr);
    const parr = document.getElementById(id_parr);
    parr.remove();
});