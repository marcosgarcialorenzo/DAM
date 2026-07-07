# Diferencia entre Procesos e Hilos

En el ámbito de los sistemas operativos y la programación, **un proceso y un hilo** son las unidades de ejecución que
permiten a una computadora realizar tareas, pero operan a niveles y con costes muy diferentes.

---

## 1. ¿Qué es un Proceso?

Un proceso es un **programa en ejecución**. Cuando haces doble clic en una aplicación (como Google Chrome, Spotify o un
videojuego), el sistema operativo crea un proceso.

* **Recursos independientes:** Cada proceso tiene su propio espacio de memoria virtual, su propia sección de código,
  datos y recursos del sistema (como el acceso a archivos).
* **Aislamiento:** Los procesos están totalmente aislados entre sí. Si el proceso de una aplicación falla o se congela,
  no afecta directamente a los demás procesos del sistema.
* **Coste alto:** Crear, destruir o cambiar de un proceso a otro (conmutación de contexto) es una tarea "pesada" y lenta
  para la CPU, ya que implica gestionar bloques enteros de memoria.

---

## 2. ¿Qué es un Hilo (Thread)?

Un hilo es la **unidad más pequeña de ejecución** dentro de un proceso. También se les conoce como "procesos ligeros".
Un solo proceso puede levantar múltiples hilos para realizar distintas tareas a la vez.

* **Recursos compartidos:** Todos los hilos de un mismo proceso comparten el espacio de memoria (variables globales,
  objetos, archivos abiertos). Sin embargo, cada hilo mantiene su propia pila de ejecución (*Stack*) y registros
  independientes para saber qué instrucción está ejecutando.
* **Interconexión:** Al compartir memoria, la comunicación entre hilos es extremadamente rápida. La desventaja es que,
  si un hilo genera un fallo crítico de memoria (como un puntero nulo no controlado), puede corromper todo el proceso y
  hacer que este se cierre por completo.
* **Coste bajo:** Crear o alternar entre hilos es muchísimo más rápido y consume menos recursos que hacerlo entre
  procesos, ya que no hay que reservar memoria nueva.

---

## Tabla Comparativa

| Características       | Proceso                                 | Hilo (Thread)                                                     |
|:----------------------|:----------------------------------------|:------------------------------------------------------------------|
| **Definición**        | Programa en ejecución.                  | Tarea/Línea de ejecución dentro de un proceso.                    |
| **Memoria**           | Tienen su propia memoria independiente. | Comparten la memoria del proceso padre.                           |
| **Coste de creación** | Alto (requiere muchos recursos del SO). | Bajo (es ligero y rápido de crear).                               |
| **Aislamiento**       | Totalmente aislados (seguros entre sí). | Si un hilo falla, puede tirar todo el proceso.                    |
| **Ejemplo real**      | Abrir el navegador Google Chrome.       | Una pestaña reproduce un vídeo mientras otra descarga un archivo. |

> **En resumen:** El **proceso** es el contenedor que proporciona el entorno y los recursos (la casa), mientras que los
**hilos** son los trabajadores que ejecutan las tareas simultáneamente dentro de ese mismo entorno.