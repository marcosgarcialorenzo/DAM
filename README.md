# DAM

Repositorio personal con ejercicios, prácticas, entregas y exámenes del ciclo formativo de **Desarrollo de Aplicaciones Multiplataforma**.

El proyecto reúne trabajo de programación en Java, acceso a datos, SQL, MongoDB y pequeños ejercicios de repaso. Está pensado como cuaderno de estudio y de prácticas del alumno.

---

## 📁 Estructura del proyecto

La raíz del proyecto es un proyecto Maven con `src` como directorio principal de código fuente:

```text
DAM/
├── LICENSE
├── README.md
├── pom.xml
├── data/
│   └── m3db.mv.db
├── .gitignore
├── .gitmessage
├── .idea/
├── target/
└── src/
    ├── Curso2425/
    │   ├── BasesDeDatos/
    │   └── Programacion/
    │       └── Examenes/
    │           ├── Ev1/
    │           └── Ev3/
    ├── Curso2526/
    │   ├── BasesDeDatos/
    │   │   ├── ExamenesMGL/
    │   │   ├── MongoDB/
    │   │   ├── SQL/
    │   │   └── UT08 PLSQL/
    │   └── Programacion/
    │       ├── A/
    │       ├── B/
    │       ├── C/
    │       ├── D/
    │       ├── E/
    │       ├── F/
    │       ├── G/
    │       ├── H/
    │       ├── HundirLaFlota/
    │       ├── I/
    │       ├── J/
    │       ├── K/
    │       ├── L/
    │       ├── M/
    │       ├── N/
    │       ├── ExamenesMGL/
    │       ├── Teclado.java
    │       └── TecladoGrafico.java
    └── Curso2627/
        ├── AccesoADatos/
        └── RepasoVerano/
```

> El árbol anterior está resumido para mostrar los bloques principales. Cada carpeta incluye varios ejercicios, soluciones, enunciados, archivos de apoyo y entregas por tema.

---

## 🧩 Contenido principal

- Programación en Java con ejercicios por bloques (`A` a `N`).
- Prácticas de bases de datos con SQL, PLSQL y MongoDB.
- Exámenes y simulacros de programación y bases de datos.
- Ejercicios de acceso a datos y repaso de verano en cursos posteriores.
- Archivos auxiliares como PDFs, scripts SQL, ficheros de datos y ejemplos de conexión.

---

## 🛠️ Tecnologías y herramientas

- Java 21
- Maven
- Lombok
- H2 Database
- SQL / PLSQL / MongoDB
- Ficheros `.txt`, `.csv`, `.json`, `.xml` y PDFs de apoyo
- IntelliJ IDEA como entorno recomendado

El `pom.xml` configura la compilación del proyecto con Java 21 y usa `src` como carpeta de origen.

---

## ▶️ Cómo usarlo

Desde la raíz del repositorio:

```bash
mvn compile
```

Si quieres ejecutar una clase Java concreta, puedes lanzarla desde tu IDE o desde la línea de comandos con el classpath generado por Maven.

---

## 📝 Convención de commits

Se usa una convención tipo Conventional Commits:

```text
<tipo>: <descripción corta en imperativo>
```

Tipos habituales:

- `feat`: nueva funcionalidad o ejercicio
- `fix`: corrección de errores
- `docs`: documentación o explicación
- `refactor`: mejora interna sin cambiar comportamiento

Ejemplos:

```text
feat(K0): añadir método ordenar empleados por edad
fix(E7): corregir división por cero
docs(N1): ampliar comentarios del ejercicio
```

---

## 📄 Licencia

Este proyecto está publicado bajo la licencia **MIT**.

El contenido del repositorio está pensado para uso académico y de estudio dentro del ciclo DAM.

Consulta el archivo `LICENSE` para ver el texto completo.

---

## 👤 Autor

**Marcos García Lorenzo**
