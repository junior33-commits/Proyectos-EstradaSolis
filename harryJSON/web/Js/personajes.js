let listaPersonajes = [];
export async function inicializar(){
    setDetalleVisible(false);
    cargarListaPersonajes();
}
async function cargarListaPersonajes(){
    let url = 'https://hp-api.onrender.com/api/characters';
    let resp = await fetch(url);
    listaPersonajes = await resp.json();
    refrescarTabla();
    
    //alert(JSON.stringify(listaPersonajes));
}

function refrescarTabla(){
    let contenido = '';
    for(let i = 0; i < listaPersonajes.length; i++){
        contenido += '<tr>' +
                        '<td>' + listaPersonajes[i].name + '</td>'+
                        '<td>' + listaPersonajes[i].species + '</td>'+
                        '<td>' + listaPersonajes[i].house + '</td>'+
                        '<td>' + listaPersonajes[i].wizard + '</td>'+
                        '<td>' + listaPersonajes[i].actor + '</td>'+
                        '<td>' + '<a href="#" onclick="cm.mostrarDetallePersonaje('+i+');">Ver Detalle</a>' + '</td>'+
                     '</tr>';
    }
    document.getElementById("tbodyPersonajes").innerHTML = contenido;
}
export function mostrarDetallePersonaje(posicion){
    let p = listaPersonajes[posicion];
    document.getElementById("txtIdPersonaje").value = p.id;
    document.getElementById("txtNombre").value = p.name;
    document.getElementById("txtEspecie").value = p.species;
    document.getElementById("txtGenero").value = p.gender;
    document.getElementById("txtFechaNacimiento").value = p.dateOfBirth;
    document.getElementById("chbMago").checked = p.wizard;
    document.getElementById("txtAscendencia").value = p.ancestry;
    document.getElementById("txtColorOjos").value = p.eyeColour;
    document.getElementById("txtColorCabello").value = p.hairColour;
    document.getElementById("chbEstudiante").checked = p.hogwartsStudent;
    document.getElementById("chbTrabajador").checked = p.hogwartsStaff;
    document.getElementById("txtTipoMadera").value = p.wand.wood;
    document.getElementById("txtNucleo").value = p.wand.core;
    document.getElementById("txtLongitud").value = p.wand.length;
    document.getElementById("fotoPersonaje").src = p.image;
    setDetalleVisible(true);
}

export function setDetalleVisible(valor){
    if(valor === true){
        document.getElementById("divCatalogo").style.display = 'none';
        document.getElementById("divDetalle").style.display = '';
    }
    else{
        document.getElementById("divDetalle").style.display = "none";
        document.getElementById("divCatalogo").style.display = '';
    }
}