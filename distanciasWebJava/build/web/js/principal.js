async function calcularDistancia(tipoDist){
    let x1 = parseFloat(document.getElementById("txtX1").value);
    let x2 = parseFloat(document.getElementById("txtX2").value);
    let y1 = parseFloat(document.getElementById("txtY1").value);
    let y2 = parseFloat(document.getElementById("txtY2").value);
    let dist = 0;
    
    switch (tipoDist) {
        case 1: dist = await calcularDistanciaEuclidiana(x1, y1, x2, y2); break;
        case 2: dist = await calcularDistanciaManhattan(x1, y1, x2, y2); break;
         
    }
    document.getElementById("txtResultado").value = '' + dist;
}

async function calcularDistanciaEuclidiana(x1, y1, x2, y2){
    let url = 'api/distancia/euclidiana?x1=' +x1+ 
                                      '&x2=' +x2+
                                      '&y1=' +y1+ 
                                      '&y2=' +y2;
    let resp = await fetch(url);
    let data = await resp.json();
    return data.result;
    
    
}

async function calcularDistanciaManhattan(x1, y1, x2, y2){
    let url = 'api/distancia/manhattan?x1=' +x1+ 
                                      '&x2=' +x2+
                                      '&y1=' +y1+ 
                                      '&y2=' +y2;
    let resp = await fetch(url);
    let data = await resp.json();
    return data.result;
}