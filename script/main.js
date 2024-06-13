/*FUNCION QUE TIENE LA PROPIEDAD DE MOSTRAR U OCUTAR EL MENU */

function hideShow(){
    var menu = document.getElementById('background');
    if (menu.style.visibility === 'visible'){
        menu.style.visibility = 'hidden';
    }else {
        menu.style.visibility = 'visible';
    }
}

