/*$(document).ready(function(){
    $("#formSeccion").attr('action', '/cuestionario/save');
    $('.selectpicker').selectpicker('refresh')
});*/


/*function editarSeccion(idSeccion, codigo, nombre, descripcion){
    location.href = '/cuestionario/editar/' + idSeccion
   // $("#formSeccion").attr('action',  '/cuestionario/editar/' + idSeccion);
    $("#nombre").val(nombre);
    $("#codigo").val(codigo);
    $("#descripcion").val(descripcion);
    $('.selectpicker').selectpicker('refresh')
    $("#btnAccionSeccion").html('Editar');
    $([document.documentElement, document.body]).animate({
        scrollTop: $("#cardDetalleSeccion").offset().top
    }, 100);
}*/

function eliminarSeccion(idSeccion){
    Swal.fire({
        title: '¿Seguro de eliminar la Seccion?',
        icon: "warning",
        text: "Los datos relacionados con la Seccion se eliminarán",
        type: 'info',
        showCancelButton: true,
        confirmButtonText: 'Aceptar',
        cancelButtonText: 'Cancelar'
        }).then((result) => {
        if (result.value) {
            location.href = '/cuestionario/eliminar/' + idSeccion;
        }
    });
}


/*function btnLimpiarSeccion(){
    $("#formSeccion").attr('action', '@{/cuestionario/save}');
    $("#nombre").val("");
    $("#codigo").val("");
    $("#descripcion").val("");
    $('.selectpicker').selectpicker('refresh')
    $("#btnAccionSeccion").html('Guardar');

}
*/