let cm = null;

async function cargarModuloPersonajes(){
    let url = "modulos/personajes.html";
    let resp = await fetch(url);
    let contenido = await resp.text();
    document.getElementById("divPrincipal").innerHTML = contenido;
    cm = await import('./personajes.js');
    cm.inicializar();
}

async function cargarModuloPlanetas(){
    let url = "modulos/planetas.html";
    let resp = await fetch(url);
    let contenido = await resp.text();
    document.getElementById("divPrincipal").innerHTML = contenido;
    cm = await import('./planetas.js');
    cm.inicializar();
}

async function cargarModuloPeliculas(){
    let url = "modulos/peliculas.html";
    let resp = await fetch(url);
    let contenido = await resp.text();
    document.getElementById("divPrincipal").innerHTML = contenido;
    cm = await import('./peliculas.js');
    cm.inicializar();
}

async function cargarModuloVehiculos(){
    let url = "modulos/vehiculos.html";
    let resp = await fetch(url);
    let contenido = await resp.text();
    document.getElementById("divPrincipal").innerHTML = contenido;
    cm = await import('./vehiculos.js');
    cm.inicializar();
}
