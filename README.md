Llanquihue Tour

Descripción

Aplicacion desarrollada en Java para gestionar información de tours turísticos. Los datos se cargan desde un archivo de texto y se almacenan en una colección ArrayList, permitiendo recorrer y filtrar la información según el precio de los tours.

Estructura del proyecto


*src

	*data
		-GestorDatos.java
		
	*model
		-Tour.java
		
	*ui
		-Main.java
		
*Libraries


Funcionalidad

-Lectura de datos desde un archivo de texto.

-Creación de objetos Tour.

-Almacenamiento en un ArrayList.

-Recorrido completo de la colección.

-Filtrado precio mayor o igual a $27.000.

-Filtrado precio menor a $27.000.


Instrucciones de ejecución

-Abrir proyecto.

-Ejecutar la clase Main del paquete ui.

-El sistema cargará los datos desde el archivo tours.txt.

-Se mostrarán todos los tours registrados y los resultados de los filtros por precios.
