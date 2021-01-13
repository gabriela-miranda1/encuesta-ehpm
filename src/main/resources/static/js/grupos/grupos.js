function eliminarGrupos(idGrupos){
    Swal.fire({
        title: '¿Seguro de eliminar el Grupo?',
        icon: "warning",
        text: "Los datos relacionados con el grupo se eliminarán",
        type: 'info',
        showCancelButton: true,
        confirmButtonText: 'Aceptar',
        cancelButtonText: 'Cancelar'
        }).then((result) => {
        if (result.value) {
            location.href = '/grupo/eliminar/' + idGrupos;
        }
    });
}