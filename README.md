 Proyecto POO 

Descripción

Este proyecto es un ejemplo práctico donde se aplican varios conceptos de la Programación Orientada a Objetos (POO) en Java, como encapsulación, herencia y polimorfismo.

El sistema simula diferentes tipos de vehículos, donde cada uno tiene un comportamiento específico.

---

## Conceptos aplicados

### Encapsulación

Se usa al declarar atributos privados dentro de la clase `Vehiculo`, evitando el acceso directo desde otras clases y controlando el acceso mediante métodos.

### Herencia

Las clases `Carro` y `Moto` heredan de la clase base `Vehiculo`, reutilizando su estructura y comportamiento.

### Polimorfismo

Se sobrescribe el método `mostrarInfo()` en las clases hijas, permitiendo que cada objeto responda de forma diferente.

---

## Estructura del proyecto

```
proyecto-poo/
├── Vehiculo.java
├── Carro.java
├── Moto.java
└── Main.java
```

---

## Explicación del código

### Clase Vehiculo

```java
public class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo de marca: " + marca);
    }
}
```

* `marca` es un atributo privado → encapsulación
* `getMarca()` permite acceder al valor de forma controlada
* `mostrarInfo()` define un comportamiento general

---

### Clase Carro

```java
public class Carro extends Vehiculo {

    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Carro marca: " + getMarca());
    }
}
```

* Usa `extends Vehiculo` → herencia
* `super(marca)` llama al constructor padre
* Sobrescribe el método → polimorfismo

---

### Clase Moto

```java
public class Moto extends Vehiculo {

    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Moto marca: " + getMarca());
    }
}
```

* Hereda de `Vehiculo`
* Tiene su propia implementación de `mostrarInfo()`

---

### Clase Main

```java
public class Main {
    public static void main(String[] args) {

        Vehiculo v1 = new Carro("Toyota");
        Vehiculo v2 = new Moto("Yamaha");

        v1.mostrarInfo();
        v2.mostrarInfo();
    }
}
```

* Se crean objetos usando la clase padre → polimorfismo
* Cada objeto ejecuta su propia versión del método

---

## Cómo ejecutar el proyecto

1. Abrir la terminal en la carpeta del proyecto
2. Compilar:

```
javac *.java
```

3. Ejecutar:

```
java Main
```

---

## Salida esperada

```
Carro marca: Toyota
Moto marca: Yamaha
```

---

## Conclusión

Este proyecto demuestra cómo aplicar los conceptos fundamentales de la Programación Orientada a Objetos en Java. Permite entender cómo las clases se relacionan entre sí y cómo se puede reutilizar código de manera eficiente.

---

## Autor

Paula Cardenas
