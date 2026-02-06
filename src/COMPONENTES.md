# Listado de Componentes Swing Reutilizables

Este documento contiene una lista de componentes Swing sencillos y reutilizables que pueden ser implementados como parte de una biblioteca de componentes para proyectos Java.

## 1. Botón Principal
- **Descripción**: Un botón principal que se puede utilizar para acciones comunes en la interfaz de usuario.

- **Funcionalidad**: Ejecutar acciones al hacer clic
- **Componentes base**: JButton
- **Características**: Configurado con el color principal de la app (escoger un color que se adapte a tu diseño), un texto que entra por parámetro y un tamaño que entra por parámetro. 
- **Caracteristicas especiales**: Si el texto es muy largo, se ajusta automáticamente al tamaño del botón poniendo puntos suspensivos.
- **Ejemplo de uso**:
```java
MainButton mainButton = new MainButton("Click Me", 150, 50);
mainButton.addActionListener(e -> {
    // Acción a ejecutar al hacer clic
});
```

## 2. Botón secundario
- **Descripción**: Un botón secundario que se puede utilizar para acciones comunes en la interfaz de usuario.

- **Funcionalidad**: Ejecutar acciones al hacer clic
- **Componentes base**: JButton
- **Características**: Configurado con el color secundario de la app (escoger un color que se adapte a tu diseño), un texto que entra por parámetro y un tamaño que entra por parámetro. 
- **Caracteristicas especiales**: Si el texto es muy largo, se ajusta automáticamente al tamaño del botón poniendo puntos suspensivos.
- **Ejemplo de uso**:
```java
SecondaryButton secondaryButton = new SecondaryButton("Click Me", 150, 50, e -> {
    // Acción a ejecutar al hacer clic
});
```

## 3. Botón peligro
- **Descripción**: Un botón  que se puede utilizar para acciones peligrosas o críticas, como borrar, descartar etc.

- **Funcionalidad**: Ejecutar acciones al hacer clic
- **Componentes base**: JButton
- **Características**: Configurado con el color peligro de la app (escoger un color que se adapte a tu diseño), un texto que entra por parámetro y un tamaño que entra por parámetro. 
- **Caracteristicas especiales**: Si el texto es muy largo, se ajusta automáticamente al tamaño del botón poniendo puntos suspensivos.
- **Ejemplo de uso**:
```java
DangerButton dangerButton = new DangerButton("Click Me", 150, 50, e -> {
    // Acción a ejecutar al hacer clic
});
```

## 4. Tarjeta de información
- **Descripción**: Un componente que muestra información en un formato de tarjeta, con un título, una descripción y una imagen opcional.
- **Funcionalidad**: Mostrar información de manera visualmente atractiva
- **Componentes base**: JPanel, JLabel, ImageIcon
- **Características**: Configurado con un título, una descripción y una imagen opcional que se pasan por parámetro. El diseño de la tarjeta se adapta al tamaño del contenido.
- **Ejemplo de uso**:
```java
record CardData(String title, String description, String imagePath) {}

CardData data = new CardData("Título de la tarjeta", "Descripción de la tarjeta", "ruta/a/la/imagen.png");
InfoCard infoCard = new InfoCard(data);
```

## 5. TopBar
- **Descripción**: Un componente que se utiliza como barra superior de la aplicación, con un título, un botón de menú y una barra de buscador que usará un provider para ejecutar la busqueda.
- **Funcionalidad**: Proporcionar una barra superior con un título, un botón de menú y una barra de buscador
- **Componentes base**: JPanel, JLabel, JButton, JTextField
- **Características**: Configurado con un título que se pasa por parámetro y un botón de menú que se puede personalizar con una acción al hacer clic. El diseño de la barra se adapta al tamaño del contenido.
- **Ejemplo de uso**:
```java
TopBar topBar = new TopBar("Título de la aplicación", e -> {
    // Acción a ejecutar al hacer clic en el botón de menú
}, query -> {
    // Acción a ejecutar al realizar una búsqueda
});
```

## 6. Modal de confirmación
- **Descripción**: Un componente que se utiliza para mostrar un modal de confirmación con un mensaje y botones de acción.
- **Funcionalidad**: Mostrar un modal de confirmación con un mensaje y botones de acción
- **Componentes base**: JDialog, JLabel, JButton
- **Características**: Configurado con un mensaje que se pasa por parámetro y botones de acción que se pueden personalizar con acciones al hacer clic. El diseño del modal se adapta al tamaño del contenido.
- **Ejemplo de uso**:
```java
ConfirmationModal confirmationModal = new ConfirmationModal("¿Estás seguro de que deseas continuar?", e -> {
    // Acción a ejecutar al hacer clic en el botón de confirmación
}, e -> {
    // Acción a ejecutar al hacer clic en el botón de cancelación
});
confirmationModal.setVisible(true);
```
## 7. Componente imagen
- **Descripción**: Un componente que se utiliza para mostrar una imagen con un título opcional y una descripción opcional.
- **Funcionalidad**: Mostrar una imagen con un título opcional y una descripción opcional
- **Componentes base**: JPanel, JLabel, ImageIcon
- **Características**: Configurado con una imagen que se pasa por parámetro y un título opcional y una descripción opcional que se pasan por parámetro. El diseño del componente se adapta al tamaño del contenido.
- **Ejemplo de uso**:
```java
ImageComponent imageComponent = new ImageComponent("ruta/a/la/imagen.png", "Título de la imagen", "Descripción de la imagen");
```

