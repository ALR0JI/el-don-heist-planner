
# PROP — Subgrupo 12.2

Proyecto desarrollado para la asignatura PROP de la FIB - UPC.

## Descripción

Descripción del proyecto pendiente de completar.

## Tecnologías

- Java
- Programación orientada a objetos (POO)
- Swing (frontend)

## Estructura del proyecto

El proyecto se divide en un `backend` (lógica de dominio y datos en memoria) y un `frontend` (interfaz Swing). El frontend depende del backend; el backend no conoce Swing.

```
backend/src/main/
  model/   entidades, enumerados y clases de solo datos
  uc/      controladores de caso de uso (XxxUC) y algoritmos
  ctrl/    controladores de datos (CtrlX) y FactoriaCtrl
backend/src/test/
  model/ uc/ integracion/   tests, en el mismo paquete que la clase que prueban
frontend/src/main/
  presentacion/   Main, CtrlPresentacion y las vistas Swing
ejemplos/         ficheros de entrada con el formato del enunciado
```

## Cómo ejecutarlo

```
make compile   # compila backend en out/backend y frontend en out/frontend
make run       # compila y lanza presentacion.Main
make clean     # borra out/
```
