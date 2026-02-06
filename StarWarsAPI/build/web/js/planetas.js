let listaPlanetas = [];

export async function inicializar(){
    setDetalleVisible(false);
    cargarPlanetas();
}
async function cargarPlanetas(){
    let url = 'https://swapi.dev/api/planets/?format=json';
    let resp = await fetch(url);
    let datos = await resp.json();
    listaPlanetas = datos.results;
    refrescarTablaPlanetas();
}

function refrescarTablaPlanetas(){
    let contenido = '';
    let i;
    for(i = 0; i < listaPlanetas.length; i++){
        contenido += '<tr>' +
                        '<td>' +listaPlanetas[i].name + '</td>'+
                        '<td>' +listaPlanetas[i].climate+ '</td>'+
                        '<td>' +listaPlanetas[i].population+ '</td>'+
                        '<td>' +listaPlanetas[i].terrain+ '</td>'+
                        '<td>' + '<a href="#" onclick="cm.mostrarDetallePlanetas('+i+');">Ver Detalle</a>' + '</td>'+
                      '</tr>';
    }
    document.getElementById("tbodyPlanetas").innerHTML = contenido;
}

export function mostrarDetallePlanetas(posicion){
    let p = listaPlanetas[posicion];
    let img = imagenPlaneta[p.name];
    document.getElementById("fotoPlaneta").src = img;
    document.getElementById("txtNombrePlaneta").value = p.name;
    document.getElementById("txtPeriodoRotacion").value = p.rotation_period;
    document.getElementById("txtPeriodoOrbita").value = p.orbital_period;
    document.getElementById("txtDiametro").value = p.diameter;
    document.getElementById("txtClima").value = p.climate;
    document.getElementById("txtGravedad").value = p.gravity;
    document.getElementById("txtTierra").value = p.terrain;
    document.getElementById("txtAgua").value = p.surface_water;
    document.getElementById("txtPoblacion").value = p.population;
    setDetalleVisible(true);
}

export function setDetalleVisible(valor){
    if(valor === true){
        document.getElementById("divCatalogoPlanetas").style.display = 'none';
        document.getElementById("divDetallePlaneta").style.display = '';
    }
    else{
        document.getElementById("divDetallePlaneta").style.display = "none";
        document.getElementById("divCatalogoPlanetas").style.display = '';
    }
}

let imagenPlaneta = {
    "Tatooine": "img/planetas/tatooine.jpg", 
    "Alderaan": "img/planetas/alderan.jpg",
    "Yavin IV": "img/planetas/yavin.jpg",
    "Hoth": "img/planetas/hoth.jpg",
    "Dagobah": "img/planetas/dagobah.jpg",
    "Bespin": "img/planetas/bespin.jpg",
    "Endor": "img/planetas/endor.jpg",
    "Naboo": "img/planetas/naboo.jpg",
    "Coruscant": "img/planetas/coruscant.jpg",
    "Kamino": "img/planetas/kamino.jpg"
};
