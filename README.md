# AREP-PARCIAL-01

## Heroku

https://arep-parcial-01.herokuapp.com/


## Empezando

Estas instrucciones ofrecerán una guía de como utilizar la copia del programa que usted podrá tener en su maquina local para fines de desarrollo y prueba.

## Prerrequisitos

**Java**

Se necesitara del java JDK 1.8, para verificar que se tiene abriremos nuestra terminal o consola de comando y ejecutaremos el siguiente comando:

```
java -version
java version "1.8.0_221"
Java(TM) SE Runtime Environment (build 1.8.0_221-b11)
Java HotSpot(TM) 64-Bit Server VM (build 25.221-b11, mixed mode)
```

En caso de no tenerlo se podra descargar de [java](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

**Maven**

Se necesitara de Maven para ejecutar el programa, para eso se verificara si se tiene con `mvn -v` en caso de no tenerlo se podrá hacer [aqui](https://maven.apache.org/install.html)

**Heroku**

Para correrlo localmente mediante heroku asegurece de terner el CLI de este con el comando `heroku --version`

```
heroku/7.37.0 win32-x64 node-v12.4.0
```
### Instalación
Para la instalacion del programa lo clonamos  con `git clone <repositorio>` o descargamos el comprimido

## Ejecucion

Para ejecutar el programa utilizaremos el comando `mvn exec:java`