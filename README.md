# DAM

Repositorio con ejercicios, prácticas y exámenes del ciclo formativo **DAM (Desarrollo de Aplicaciones Multiplataforma)**.

---

## 📁 Estructura del proyecto

La raíz del proyecto contiene un único módulo Maven y el código fuente se organiza bajo `src/`:

```text
DAM/
├── pom.xml
├── README.md
├── data/
│   └── m3db.mv.db
└── src/
	├── Curso2425/
	│   └── Programacion/
	│       └── Examenes/
	│           ├── Ev1/
	│           └── Ev3/
	└── Curso2526/
		├── BasesDeDatos/
		│   ├── ExamenesMGL/
		│   │   └── SQL/
		│   ├── MongoDB/
		│   ├── SQL/
		│   └── UT08 PLSQL/
		└── Programacion/
			├── A/
			├── B/
			├── C/
			├── D/
			├── E/
			├── F/
			├── G/
			├── H/
			├── HundirLaFlota/
			├── I/
			├── J/
			├── K/
			├── L/
			├── M/
			├── N/
			├── ExamenesMGL/
			├── Teclado.java
			└── TecladoGrafico.java
```

> Nota: el árbol anterior está resumido para mostrar las carpetas principales. Dentro de cada bloque hay varios ejercicios, soluciones y exámenes organizados por tema.

---

## 🛠️ Tecnologías utilizadas

- **Java 21**
- **Maven**
- **Lombok**
- **H2 Database**
- **SQL** y **MongoDB**
- **IDE recomendado**: IntelliJ IDEA

El `pom.xml` configura `src` como directorio de código fuente y utiliza un único proyecto Maven.

---

## 📝 Convención de commits

Se sigue una convención tipo *Conventional Commits*:

```text
<tipo>: <descripción corta en imperativo>
```

### Tipos habituales

| Tipo | Descripción | Ejemplo |
|---|---|---|
| `feat` | Nueva funcionalidad | `feat(K0): añadir método ordenar empleados por edad` |
| `fix` | Corrección de errores | `fix(E7): corregir división por cero` |
| `docs` | Documentación | `docs(N1): ampliar comentarios del ejercicio` |
| `refactor` | Mejora interna sin cambiar comportamiento | `refactor(Empresa): simplificar lógica de modificación` |

---

## 📄 Licencia

Este proyecto está publicado bajo licencia **MIT**.

El contenido del repositorio está pensado para **apuntes y ejercicios de uso educativo** dentro del ciclo DAM.

Consulta el archivo `LICENSE` para ver el texto completo de la licencia.

---

## 👤 Autor

**Marcos García Lorenzo** — Estudiante DAM en el IES Luis Vives
