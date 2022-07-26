#language: es

Característica: Modulo Busqueda Google

  Antecedentes:
    Cuando se asigna el usuario
    Y se ingresa al portal de google

  @PortalSearchGoogle
  Esquema del escenario: Ingreso al portal de Busqueda Google
    Entonces valida la barra de busqueda Google
    Y el usuario busca el <termino> en el buscador
    #Y valida titulo en el portal de Ayuda con el texto <textoTitulo>

    Ejemplos:
      | termino|
    ##@externaldata@./src/test/resources/Data/LibroDatos.xlsx@Hoja1
   |"Halo CE"|
