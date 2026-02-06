let cm = null;

async function cargarModuloPersonajes(){
    let url = "modulos/personajes.html";
    let resp = await fetch(url);
    let contenido = await resp.text();
    document.getElementById("divPrincipal").innerHTML = contenido;
    cm = await import('./personajes.js');
    cm.inicializar();
}