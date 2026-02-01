# ConversorDeMonedas

---

## Descripción

ConversorDeMonedas es una aplicación de consola desarrollada en Java.  
La aplicación permite convertir cantidades de dinero entre distintas monedas, aplicando conceptos fundamentales de programación orientada a objetos, lógica de control y el uso de una API.

---

## Funcionalidades Destacadas

- Conversión entre diferentes monedas.
- Menú interactivo por consola.
- Ingreso de montos personalizados.
- Resultado de la conversión mostrado de forma clara.
- Estructura preparada para ampliar con más monedas o integración con APIs.

---

## Estructura del Proyecto
``` 
ConversorDeMonedas/
├── src/
│   ├── Calculo.java          # Lógica de conversión de monedas
│   ├── Modelos.java          # Filtro de monedas / Historial de monedas / Atributos, getters y setters de las monedas /
│   └── Principal.java        # Menú e interacción con el usuario mediante consola
├── .gitignore                # Archivos ignorados por Git
├── ConversorDeMonedas.iml    # Configuración del proyecto (Dependencia de la librería Gson)
``` 

---

## Instalación

1. Clonar el repositorio:
  ```bash
  git clone https://github.com/OverBM/ConversorDeMonedas.git
  ```
2. Descargar la librería Gson 2.13.2.
3. Crear una carpeta llamada libs en el proyecto y copiar allí el archivo gson-2.13.2.jar.
4. Abrir el proyecto.
5. Agregar el JAR:
``` 
File /
├── Project Structure
│  └── Modules
│    └── Dependencies
│      └── JARs or directories
``` 
6. Ejecutar la clase principal.


