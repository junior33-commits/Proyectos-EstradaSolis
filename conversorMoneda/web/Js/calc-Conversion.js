/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
function convertiraDolares(){
    let cantidadPesos = parseFloat(document.getElementById("txtCantidadPesos").value);
    let valorDolar = parseFloat(document.getElementById("txtPrecioDolar").value);
    let res = 0;
    if(!isNaN(cantidadPesos) && cantidadPesos > 0 && !isNaN(valorDolar) && valorDolar > 0){
        res = cantidadPesos / valorDolar;
        document.getElementById("txtResultadoDolares").value = "" + res.toFixed(2);
    }
    else{
        alert("Datos Vacios");
    }
}

function convertiraPesos(){
    let cantidadDolares = parseFloat(document.getElementById("txtCantidadDolares").value);
    let valorDolar = parseFloat(document.getElementById("txtPrecioDolar").value);
    let res = 0;
    if(!isNaN(cantidadDolares) && cantidadDolares > 0 && !isNaN(valorDolar) && valorDolar > 0){
        res = cantidadDolares * valorDolar;
        document.getElementById("txtResultadoPesos").value = "" + res.toFixed(2);
    }
    else{
        alert("Datos Vacios");
    }
}

function mostrarAlumno(){
    let a1 = {
        matricula : "24000926",
        nombre: "Christian Noe Estrada Solis",
        carrera: "LDSM",
        cuatrimestreActual: 4
    };
    alert(a1.nombre);
}

async function consultarPrecioDolar(){
    //Definimos la URL
    let url = 'https://v6.exchangerate-api.com/v6/15e71a4d5c13390794278123/latest/USD';
    //Hacemos la petición 
    let resp = await fetch(url);
    //Convertimos la respuesta en un objeto JSON
    let data = await resp.json();
    //Precio del dolar en pesos mexicanos 
    let precioDolar = data.conversion_rates.MXN;
    //Colocamos el precio del dolar en la caja del texto
    document.getElementById("txtPrecioDolar").value = '' + precioDolar;
}

function usarArregloJSON(){
    let prod = {
        id : 987,
        nombre : "Computadora Escritorio",
        modelo : "Lenovo",
        precio : 27999.99
    };
    
    let arreglo = [];
    arreglo[0] = 4;
    arreglo[1] = 'GTL';
    
    let productos = [
        {
            id : 1024,
            nombre : "Mouse ",
            modelo : "Actek",
            precio : 76.50
        },
        {
            id : 987,
            nombre : "Computadora Escritorio",
            modelo : "Lenovo",
            precio : 27999.99
        }
    ];
    let personjes = [
        
    ];
}