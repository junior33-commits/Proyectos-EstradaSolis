let listaVehiculos = [];

export async function inicializar(){
    setDetalleVisible(false);
    cargarVehiculos();
}

async function cargarVehiculos(){
    let url = "https://swapi.dev/api/vehicles/?format=json";
    let resp = await fetch(url);
    let datos = await resp.json();
    listaVehiculos = datos.results;
    refrescarTablaVehiculos();
}

function refrescarTablaVehiculos(){
    let contenido = "";
    let i;

    for(i = 0; i < listaVehiculos.length; i++){
        contenido += "<tr>" +
                        "<td>" + listaVehiculos[i].name + "</td>" +
                        "<td>" + listaVehiculos[i].model + "</td>" +
                        "<td>" + listaVehiculos[i].manufacturer + "</td>" +
                        "<td>" + listaVehiculos[i].cost_in_credits + "</td>" +
                        "<td>" +
                            '<a href="#" onclick="cm.mostrarDetalleVehiculo('+i+');">Ver Detalle</a>' +
                        "</td>" +
                     "</tr>";
    }

    document.getElementById("tbodyVehiculos").innerHTML = contenido;
}

export function mostrarDetalleVehiculo(pos){
    let p = listaVehiculos[pos];
    let img = imagenVehiculo[p.name];
    document.getElementById("fotoVehiculo").src = img;
    document.getElementById("txtNombreVehiculo").value = p.name;
    document.getElementById("txtModelo").value = p.model;
    document.getElementById("txtFabricante").value = p.manufacturer;
    document.getElementById("txtCosto").value = p.cost_in_credits;
    document.getElementById("txtLongitud").value = p.length;
    document.getElementById("txtVelocidad").value = p.max_atmosphering_speed;

    setDetalleVisible(true);
}

export function setDetalleVisible(valor){
    if(valor){
        document.getElementById("divCatalogoVehiculos").style.display = "none";
        document.getElementById("divDetalleVehiculo").style.display = "";
    } else {
        document.getElementById("divDetalleVehiculo").style.display = "none";
        document.getElementById("divCatalogoVehiculos").style.display = "";
    }
}

let imagenVehiculo = {
    "Sand Crawler": "img/naves/SandCrawler.jpg",
    "T-16 skyhopper": "img/naves/T-16 skyhopper.jpg",
    "X-34 landspeeder": "img/naves/x-34.jpg",
    "TIE/LN starfighter": "img/naves/tieStarfighter.jpg",
    "Snowspeeder": "img/naves/Snowspeeder.jpg",
    "Storm IV Twin-Pod cloud car": "img/naves/storm4.jpg",
    "TIE bomber": "img/naves/tieBomber.jpg",
    "AT-AT": "img/naves/at-at.jpg",
    "AT-ST": "img/naves/at-st.jpg",
    "Sail barge": "img/naves/sailbarge.jpg"
};