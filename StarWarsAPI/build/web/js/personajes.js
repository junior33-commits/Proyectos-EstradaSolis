let listaPersonajes = [];
export async function inicializar(){
    setDetalleVisible(false);
    await cargarListaPersonajes();
}

async function cargarListaPersonajes(){
    let url = 'https://swapi.dev/api/people/?format=json';
    let resp = await fetch(url);
    let datos = await resp.json();
    listaPersonajes = datos.results;
    refrescarTabla();
}

function refrescarTabla(){
    let contenido = '';
    let i;
    for (i = 0; i < listaPersonajes.length; i++){
        contenido += '<tr>' +
                        '<td>' + listaPersonajes[i].name + '</td>'+
                        '<td>' + listaPersonajes[i].gender + '</td>'+
                        '<td>' + listaPersonajes[i].hair_color + '</td>'+
                        '<td>' + listaPersonajes[i].birth_year + '</td>'+
                        '<td>' + '<a href="#" onclick="cm.mostrarDetallePersonaje('+i+');">Ver Detalle</a>' + '</td>'+
                     '</tr>';
    }
    document.getElementById("tbodyPersonajes").innerHTML = contenido;
}

export function mostrarDetallePersonaje(posicion){
    let p = listaPersonajes[posicion];
    let img = imagenPersonaje[p.name];
    document.getElementById("fotoPersonaje").src = img;
    document.getElementById("txtNombre").value = p.name;
    document.getElementById("txtGenero").value = p.gender;
    document.getElementById("txtAltura").value = p.height;
    document.getElementById("txtPeso").value = p.mass;
    document.getElementById("txtCabello").value = p.hair_color;
    document.getElementById("txtColorOjos").value = p.eye_color;
    document.getElementById("txtColorPiel").value = p.skin_color;
    document.getElementById("txtAñoNacimiento").value = p.birth_year;
    setDetalleVisible(true);
}

export function setDetalleVisible(valor){
    if(valor === true){
        document.getElementById("divCatalogo").style.display = 'none';
        document.getElementById("divDetalle").style.display = '';
    }
    else{
        document.getElementById("divDetalle").style.display = 'none';
        document.getElementById("divCatalogo").style.display = '';
    }
}

let imagenPersonaje = {
    "C-3PO": "img/personajes/C-3PO.jpg", 
    "Darth Vader": "img/personajes/DarthVader.jpg",
    "Beru Whitesun lars": "img/personajes/beru.jpg",
    "Biggs Darklighter": "img/personajes/Biggs Darkligther.jpg",
    "Leia Organa": "img/personajes/leiaOrgana.jpg",
    "Luke Skywalker": "img/personajes/luke.jpg",
    "Obi-Wan Kenobi": "img/personajes/Obi-Wan Kenobi.jpg",
    "Owen Lars": "img/personajes/owen.jpg",
    "R2-D2": "img/personajes/R2-D2.png",
    "R5-D4": "img/personajes/R5-D4.jpg"
};