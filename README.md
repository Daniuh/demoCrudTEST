# demoCrudTEST
Haga lo siguiente:
- agregue un endPoint de actualizacion de usuario
- incorpore una nueva entidad/modelo(UsuarioRol) que tenga
  los campos (idUsuario,idRol,Rol("vendedor","cajero","consultor",etc..))
  un usuario puede en un momento tener 1 o mas roles asociados.
  debe haber una relacion (Usuario - UsuarioRol):
        @ManyToOne Relation
        @OneToMany Relation
        @OneToOne Relation
        @ManyToMany Relation
  aplique la que usted considere mas apropiada y en README
  justifique ademas incorpore en este mismo README coloque 
varias ScreenShoot(capturas) de la ejecucion de la API REST.
  
- implemente algunas pruebas unitarias a esa nueva entidad/modelo 

Debe registrar en la tabla de abajo su nombre completo y su repositorio
de github con la solucion.


Función Actualizar:


![Captura de pantalla 2022-04-28 015745](https://user-images.githubusercontent.com/88155850/165696499-c652e0ef-c511-40aa-ac61-4d1c97635b5c.png)

Función Agregando Rol:

![AgregandoRol](https://user-images.githubusercontent.com/88155850/165775903-aa47c08b-a928-4de9-8ae8-dcd1d1091603.png)

Función Actualizar Rol:

![ActualizandoRol](https://user-images.githubusercontent.com/88155850/165776033-7ee4dc5e-9a08-4c34-adcb-0d9b56c668ca.png)

Función Eliminar Rol:

![EliminandoRol](https://user-images.githubusercontent.com/88155850/165776238-9d6e3b1d-eca9-4c2d-9f30-b6839ee5092b.png)

Función de relación entre tablas:

![Relación tablas](https://user-images.githubusercontent.com/88155850/166128338-68a63dbf-5112-4e82-bd10-e73678137d3f.png)
