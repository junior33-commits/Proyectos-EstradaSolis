/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
function validarFecha(inputElement){
    //Obtenemos la fecha 
    const fechaHoy = new Date();
    //Se crea un objeto tipo fecha con el valor ingresado del usuario
    const fechaIngresada = new Date(inputElement.value);
    if(fechaIngresada.setHours(0,0,0,0) > fechaHoy.setHours(0,0,0,0)){
        alert("La fecha no debe ser mayor a hoy");
    //Borra el valor incorrecto si se ingreso mal
    inputElement.value = ""; 
    // Regresa automaticamente a donde se debe agregar la fecha
    inputElement.focus();
    }
}

function limpiarCURP(){
    document.getElementById("txtPrimerNombre").value = "";
    document.getElementById("txtSegundoNombre").value = "";
    document.getElementById("txtPrimerApellido").value = "";
    document.getElementById("txtSegundoApellido").value = "";
    //Se establece la opción en el indice predeterminado
    document.getElementById("txtEntidadNacimiento").selectedIndex = 0;
    document.getElementById("fechaNacimiento").value = "";
    //Deben desmarcarse los botones 
    const radioButtons = document.getElementsByName('sexo');
    radioButtons.forEach(radio => radio.checked = false);
    document.getElementById("txtResultado").value = "";    
}

function calcularCURP(){
    let app = document.getElementById("txtPrimerApellido").value;
    let apm = document.getElementById("txtSegundoApellido").value;
    let primerNombre = document.getElementById("txtPrimerNombre").value;
    let segundoNombre = document.getElementById("txtSegundoNombre").value;
    let fechaNacimiento = document.getElementById("fechaNacimiento").value;
    let entidadFederativa = document.getElementById("txtEntidadNacimiento").value;
    let genero = document.querySelector('input[name="sexo"]:checked')?.value;
    
    //Validacion de datos
    if(!app || !primerNombre || !fechaNacimiento 
            || !entidadFederativa || !genero
            || !fechaNacimiento){
        alert("Datos incompletos");
        return;
    }
    
    
    let curp = '';
    //Extraemos la primer letra del apellido paterno
    curp = app.substring(0, 1);
    
    //Extraemos la vocal interna
    curp = curp + extraerVocalInterna(app);
    
    //Extraemos la primer letra del apellido materno
    if(apm.length === 0){
        curp = curp + 'X';
    }
    else{
        curp = curp + apm.substring(0, 1);
    }
    //Primer letra del nombre
    if((primerNombre === "Jose" 
        || primerNombre === "Maria" && segundoNombre.length > 0)){
        curp = curp + segundoNombre.substring(0, 1);
    }
    else{
        curp = curp + primerNombre.substring(0, 1);
    }
    curp = curp.toUpperCase();
    curp = palabraProhibida(curp);
    
    //Fecha de nacimiento 
    const [anio, mes, dia] = fechaNacimiento.split("-");
    curp = curp + anio.substring(2, 4) + mes + dia;
    
    //Letra del género
    curp = curp + genero;
    
    //Entidad Federativa 
    curp = curp + entidadFederativa;
    
    //Consonante interna apellido paterno 
    curp = curp + extraerConsonanteInterna(app);
    
    //Consonante interna apellido materno 
    if(apm.length === 0){
        curp = curp + 'X';
    }
    else{
        curp = curp + extraerConsonanteInterna(apm);
    }
    
    //Consonante interna del nombre 
    curp = curp + extraerConsonanteInterna(primerNombre);
    
    //Homoclave 
    curp = curp + '00';
    
    //Reemplazar Ñ por X 
    curp = curp.replace('Ñ', 'X');
    
    document.getElementById("txtResultado").value = curp;
}

function extraerVocalInterna(cadena){
    let letra = null;
    cadena = cadena.toUpperCase();
    for(let i = 1; i < cadena.length; i++){
        letra = cadena.substring(i, i+1);
        if(letra === 'A' || letra === 'E' 
                || letra === 'I' || letra === 'O' 
                || letra === 'U'){
            return letra;
        }
    }
    return 'X';
}

function extraerConsonanteInterna(cadena){
    let letra = null;
    cadena = cadena.toUpperCase();
    for(let i = 1; i < cadena.length; i++){
        letra = cadena.substring(i, i+1);
        if(!(letra === 'A' || letra === 'E' 
                || letra === 'I' || letra === 'O' 
                || letra === 'U')){
            return letra;
        }
    }
    return 'X';
}
function palabraProhibida(curp){
    let primerasLetras = curp.substring(0, 4).toUpperCase();
    const palabrasProhibidas = [
        "BUEI","BUEY","CACA","CACO","CAGA","CAGO","CAKA","CAKO",
        "COGE","COGI","COJA","COJE","COJI","COJO","CULO","FETO",
        "GUEY","JOTO","KACA","KACO","KAGA","KAGO","KOGE","KOGI",
        "KOJA","KOJE","KOJI","KOJO","KULO","MAME","MAMO","MEAR",
        "MEAS","MEON","MION","MOCO","MULA","PEDA","PEDO","PENE",
        "PUTA","PUTO","QULO","RATA","RUIN"
    ];
    if(palabrasProhibidas.includes(primerasLetras)){
        curp = curp.substring(0,1) + 'X' + curp.substring(2);
    }
    return curp;
}