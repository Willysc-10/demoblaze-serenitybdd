EJERCICIO DE AUTOMATIZACIÓN - Serenity BDD
------------------------------------------

Este proyecto contiene la automatización del flujo de compra en la página:
https://www.demoblaze.com/

REQUISITOS:
-----------
- Java JDK 17 (o superior)
- Maven 3.9+ 
- Navegador Google Chrome instalado
- ChromeDriver compatible (el proyecto lo descargará automáticamente)

INSTRUCCIONES DE EJECUCIÓN:
---------------------------
1. Clonar este repositorio:
   git clone https://github.com/usuario/repositorio.git

2. Ingresar a la carpeta del proyecto:
   cd repositorio

3. Ejecutar las pruebas con Maven:
   mvn clean verify

4. Al finalizar la ejecución, se generará un reporte Serenity en:
   target/site/serenity/index.html

   Abrir este archivo en el navegador para visualizar los resultados.

ESCENARIO AUTOMATIZADO:
-----------------------
- Abrir la página principal de Demoblaze.
- Agregar dos productos distintos al carrito.
- Visualizar el carrito.
- Completar el formulario de compra.
- Finalizar la compra y validar la confirmación.

------------------------------------------
