let listaPeliculas = [];

export async function inicializar(){
    setDetalleVisible(false);
    cargarPeliculas();
}

async function cargarPeliculas(){
    let url = "https://swapi.dev/api/films/?format=json";
    let resp = await fetch(url);
    let datos = await resp.json();
    listaPeliculas = datos.results;
    refrescarTablaPeliculas();
}

function refrescarTablaPeliculas(){
    let contenido = "";
    let i;

    for(i = 0; i < listaPeliculas.length; i++){
        contenido += "<tr>" +
                        "<td>" + listaPeliculas[i].title + "</td>" +
                        "<td>" + listaPeliculas[i].episode_id + "</td>" +
                        "<td>" + listaPeliculas[i].director + "</td>" +
                        "<td>" + listaPeliculas[i].release_date + "</td>" +
                        "<td>" +
                            '<a href="#" onclick="cm.mostrarDetallePelicula('+i+');">Ver Detalle</a>' +
                        "</td>" +
                     "</tr>";
    }

    document.getElementById("tbodyPeliculas").innerHTML = contenido;
}

export function mostrarDetallePelicula(pos){
    let p = listaPeliculas[pos];
    let img = imagenPelicula[p.title];
    document.getElementById("fotoPelicula").src = img;
    document.getElementById("txtTituloPelicula").value = p.title;
    document.getElementById("txtDirector").value = p.director;
    document.getElementById("txtProductor").value = p.producer;
    document.getElementById("txtFechaEstreno").value = p.release_date;
    document.getElementById("txtApertura").value = p.opening_crawl;

    setDetalleVisible(true);
}

export function setDetalleVisible(valor){
    if(valor){
        document.getElementById("divCatalogoPeliculas").style.display = "none";
        document.getElementById("divDetallePelicula").style.display = "";
    } else {
        document.getElementById("divDetallePelicula").style.display = "none";
        document.getElementById("divCatalogoPeliculas").style.display = "";
    }
}

let imagenPelicula = {
    "A New Hope": "img/peliculas/unanuevaesperanza.jpg",
    "The Empire Strikes Back": "img/peliculas/elImperioContraataca.jpg",
    "Return of the Jedi": "img/peliculas/elRetornodelJedi.jpg",
    "The Phantom Menace": "img/peliculas/amenazaFantasma.jpg",
    "Attack of the Clones": "img/peliculas/GuerradeLosClones.jpg",
    "Revenge of the Sith": "img/peliculas/VenganzadeLosSith.jpg"
};
