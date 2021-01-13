function eliminarMiembros(idMiembros){
    Swal.fire({
        title: '¿Seguro de eliminar el Miembro?',
        icon: "warning",
        text: "Los datos relacionados con el miembro se eliminarán",
        type: 'info',
        showCancelButton: true,
        confirmButtonText: 'Aceptar',
        cancelButtonText: 'Cancelar'
        }).then((result) => {
        if (result.value) {
            location.href = '/miembros/eliminar/' + idMiembros;
        }
    });
}
