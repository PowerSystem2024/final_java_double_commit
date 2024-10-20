| Proyecto Final Java ☕ • UTN-FRSR, Mendoza |
|---------------------------------------------|

### Cohorte 2024 - Grupo: Double Commit

## Nombre del Proyecto:  
**Power Gym**

## Descripción del Proyecto:

Este proyecto final ha sido desarrollado como parte del curso de Java en la `Universidad Tecnológica Nacional - Facultad Regional San Rafael (UTN-FRSR)`, por el grupo `Double Commit`, perteneciente a la cohorte 2024. El sistema tiene como objetivo brindar una solución eficiente para la gestión de clientes en un gimnasio. Está diseñado para facilitar el manejo de la información relacionada con los usuarios, como sus datos personales, rutinas de entrenamiento, y sus objetivos físicos, integrando además funcionalidades adicionales de administración y estadísticas.

El proyecto ha sido completamente desarrollado en el **IDE NetBeans** utilizando **Java** como lenguaje de programación principal, y está estructurado para permitir escalabilidad y adaptabilidad a medida que se requieran nuevas funcionalidades.

---

## Funcionalidades Clave del Sistema:

1. **Gestión de Clientes:**
   - Registro, actualización y eliminación de clientes.
   - Almacenamiento de información relevante, como edad, altura, peso, y objetivo (adelgazar, tonificar, aumentar musculatura).
   - Cálculo automático del índice de masa corporal (IMC) y categorización del mismo (Bajo peso, Normal, Sobrepeso).

2. **Registro de Rutinas:**
   - Creación de rutinas de entrenamiento personalizadas para cada cliente.
   - Posibilidad de asignar rutinas según los objetivos y condiciones físicas del usuario.

3. **Generación de Reportes:**
   - Visualización de los datos en una tabla dinámica para facilitar la administración.
   - Generación de reportes basados en el estado físico de los clientes (IMC, objetivos alcanzados, progreso).

4. **Interfaz de Usuario Intuitiva:**
   - Diseño de una interfaz gráfica amigable y sencilla de navegar, desarrollada utilizando las bibliotecas de **Swing** de Java.
   - Uso de tablas interactivas que permiten realizar búsquedas y ediciones de manera eficiente.

5. **Control de Seguridad y Acceso:**
   - Sistema de acceso controlado para que los administradores puedan gestionar los datos de los clientes de manera segura.

---

## Arquitectura del Proyecto:

El sistema sigue un enfoque **MVC (Modelo-Vista-Controlador)** para lograr una separación clara de las responsabilidades y facilitar la mantenibilidad y escalabilidad. El proyecto está dividido en tres capas principales:

1. **Modelo (Entidad):**
   - Representa los datos del negocio (Clientes y Rutinas) y las operaciones que se pueden realizar sobre ellos.

2. **Vista:**
   - Implementada con **Java Swing**, proporciona la interfaz gráfica para interactuar con el sistema, permitiendo que los usuarios ingresen datos y vean resultados.

3. **Controlador (Servicios):**
   - Clases como `ServicioCliente` y `ServicioRutina` gestionan la lógica del negocio, incluyendo la validación de datos, el cálculo de IMC, y la interacción con la vista.

---

## Tecnologías Utilizadas:

- **Lenguaje de Programación:** Java SE 8+
- **IDE de Desarrollo:** NetBeans
- **Framework de Interfaz Gráfica:** Swing
- **Patrón de Diseño:** Modelo-Vista-Controlador (MVC)
- **Manejo de Datos:** Estructuras de datos en memoria (ArrayList), con posibilidad de ser adaptado a sistemas de bases de datos en el futuro.

---

## Contribución del Grupo Double Commit:

El equipo **Double Commit** ha trabajado de manera colaborativa y organizada para llevar adelante este proyecto, aplicando las mejores prácticas de programación y asegurando que el código sea claro, eficiente y bien documentado. El grupo se ha enfocado en:
- Crear un sistema que sea fácil de usar tanto para administradores como para usuarios.
- Aplicar principios sólidos de programación orientada a objetos y diseño modular.
- Implementar un sistema flexible que pueda escalar para incluir nuevas funcionalidades en el futuro, como la integración de pagos o un sistema de notificaciones automáticas.

---

## Futuras Mejoras Potenciales:

El sistema está diseñado para crecer, y entre las posibles mejoras que se podrían implementar en futuras versiones, se incluyen:
- Integración con una base de datos para almacenar y gestionar de manera más eficiente los datos de los clientes.
- Incorporación de un sistema de pago en línea para gestionar la suscripción de los usuarios.
- Aplicación móvil para que los clientes puedan consultar sus rutinas y progreso desde cualquier lugar.
- Generación automática de recomendaciones de ejercicios basadas en los objetivos del cliente y su historial de progreso.

---

## Conclusión:

Este proyecto representa un esfuerzo colaborativo para desarrollar un sistema útil y funcional que resuelva una necesidad real dentro de los gimnasios, ofreciendo una solución completa para la gestión de los clientes y sus rutinas. El sistema no solo facilita la organización interna, sino que también mejora la experiencia del cliente al proporcionar un seguimiento personalizado de sus objetivos.

El grupo **Double Commit** se enorgullece de presentar este trabajo como su proyecto final de Java para la **UTN-FRSR**, y espera que pueda servir de base para desarrollos futuros, tanto académicos como profesionales.

---

## Integrantes del Grupo Double Commit:

<article style="display: grid; grid-template-columns: repeat(auto-fit, minmax(auto, 1fr))">

<div style="display: flex; align-items: center; align-content: center; gap: 8px;" href="https://github.com/Mendoxeneixe">
<img src="https://avatars.githubusercontent.com/u/134340520?v=4" alt="Avatar github Franco" width="45" height="45" />
<span style="font-weight: 800; font-size: 1rem">Franco Morales</span>
</div>

<div style="display: flex; align-items: center; align-content: center; gap: 8px; margin-top: 8px;" href="https://github.com/solidsnk86">
<img src="https://avatars.githubusercontent.com/u/93176365?v=4" alt="Avatar github Gabriel" width="45" height="45" />
<span style="font-weight: 800; font-size: 1rem">Gabriel Calcagni</span>
</div>

<div style="display: flex; align-items: center; align-content: center; gap: 8px; margin-top: 8px;" href="https://github.com/Philama">
<img src="https://avatars.githubusercontent.com/u/25463245?v=4" alt="Avatar github Philama" width="45" height="45" />
<span style="font-weight: 800; font-size: 1rem">Guardini Philama</span>
</div>

<div style="display: flex; align-items: center; align-content: center; gap: 8px; margin-top: 8px;" href="https://github.com/megon1">
<img src="https://avatars.githubusercontent.com/u/86989774?v=4" alt="Avatar github megon1" width="45" height="45" />
<span style="font-weight: 800; font-size: 1rem">Mauro Exequiel Gonzalez</span>
</div>

<div style="display: flex; align-items: center; align-content: center; gap: 8px; margin-top: 8px;" href="https://github.com/CeciliaOlejar">
<img src="https://avatars.githubusercontent.com/u/104603137?v=4" alt="Avatar github ceciliaOlejar" width="45" height="45" />
<span style="font-weight: 800; font-size: 1rem">Cecilia Olejarczyk</span>
</div>

</article>



