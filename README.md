
# DAM

Repositorio personal con ejercicios, prácticas, entregas y exámenes del ciclo formativo de **Desarrollo de Aplicaciones Multiplataforma (DAM)**.

Este repositorio reúne trabajo de programación en Java, prácticas y ejercicios de acceso a datos (SQL, PLSQL, MongoDB), ejemplos con H2 y pequeños proyectos de repaso. Está pensado como cuaderno de trabajo y estudio del alumno.

---

## 📁 Estructura del proyecto

Es un proyecto Maven con `src` como directorio principal de código fuente. A grandes rasgos:

```text
DAM/
├── DAM.iml
├── LICENSE
├── README.md
├── pom.xml
├── data/                # ficheros H2 de ejemplo
│   ├── m3db.mv.db
│   └── m3db.trace.db
├── .gitignore
├── .gitmessage
├── .idea/
├── target/
└── src/
    ├── Curso2425/
    ├── Curso2526/
    │   ├── BasesDeDatos/
    │   └── Programacion/
    │       ├── A/ .. N/  # ejercicios organizados por bloques
    │       ├── ExamenesMGL/
    │       ├── Teclado.java
    │       └── TecladoGrafico.java
    └── Curso2627/
        ├── AccesoADatos/
        └── RepasoVerano/
```

> El árbol anterior está resumido. Cada carpeta contiene ejercicios, soluciones, enunciados y recursos por tema.

---

## 🧩 Qué contiene

- Ejercicios y soluciones de programación Java (bloques A–N).
- Prácticas y pruebas de bases de datos: SQL, PLSQL y MongoDB.
- Exámenes y ejercicios corregidos (varias convocatorias).
- Recursos adicionales: PDFs, scripts SQL, ficheros de datos y ejemplos de conexión (p. ej. H2 en `data/`).
- Clases utilitarias de entrada como `Teclado.java` y ejemplos con interfaz como `TecladoGrafico.java`.

---

## 🛠️ Tecnologías y dependencias

- Java 21 (configurado en `pom.xml`)
- Maven
- Lombok (si se usa en ejercicios concretos)
- H2 Database (ficheros de ejemplo en `data/`)
- SQL / PLSQL / MongoDB
- Archivos de apoyo: `.txt`, `.csv`, `.json`, `.xml`, PDFs
- IDE recomendado: IntelliJ IDEA

En `pom.xml` se declaran las dependencias más relevantes (p. ej. Lombok, H2) y la configuración del compilador para Java 21.

---

## ▶️ Cómo compilar y ejecutar

1) Compilar con Maven (desde la raíz del proyecto):

```bash
mvn -q compile
```

2) Ejecutar una clase con `main` desde la línea de comandos (ejemplo):

```bash
# Compilar
mvn -q compile

# Ejecutar (reemplaza fully.qualified.MainClass por la clase que quieras ejecutar)
java -cp target/classes fully.qualified.MainClass
```

3) Alternativamente puedes ejecutar desde el IDE (IntelliJ):
   - Importa el proyecto como Maven
   - Asegúrate de usar JDK 21 en la configuración del proyecto
   - Ejecuta la clase `main` desde el navegador de proyecto

4) Usando Maven Exec (si añades o tienes el plugin `exec` configurado):

```bash
mvn -q compile exec:java -Dexec.mainClass="fully.qualified.MainClass"
```

Notas útiles:
- Algunos ejemplos (p. ej. `TecladoGrafico`) usan Swing/JOptionPane y necesitan entorno gráfico para ejecutarse.
- Los ficheros H2 en `data/` son de ejemplo; si ejecutas scripts que acceden a la base de datos revisa las rutas.

---

## 🧭 Clases y ejemplos de interés

- `src/Curso2526/Programacion/Teclado.java` — utilidades de entrada por consola.
- `src/Curso2526/Programacion/TecladoGrafico.java` — ejemplo con interfaz gráfica simple.
- `src/Curso2627/RepasoVerano/...` — ejercicios de acceso a datos y repasos con mains de ejemplo.

Si quieres que añada instrucciones concretas para ejecutar alguna de estas clases, dímelo y pondré el comando exacto con el nombre completo del paquete.

---

## 📝 Convención de commits

Se utiliza una convención tipo Conventional Commits:

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

Consulta el archivo `LICENSE` para el texto completo.

---

## 👤 Autor

**Marcos García Lorenzo**

---

Si quieres, puedo:
- Añadir un índice (TOC) al inicio del README.
- Preparar un `README` más corto para mostrar en la página principal (resumen) y otro más largo en `/docs`.
- Crear un patch `git` aplicable o commitearlo en una rama y preparar el `git push` (necesitaría permiso para ejecutar comandos remotos o que me indiques cómo quieres aplicar los cambios).

