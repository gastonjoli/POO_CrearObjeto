package ClasesYObjetos;

//Crear Proyecto dentro crear paquete dentro de paquete crear class y objetos

public class Personaje {

    //Atributos

    String nombre;
    String raza;
    int vida;

    //Métodos

    public static void main(String[] args) {

        Personaje personaje1 = new Personaje();

        personaje1.nombre ="Gladiador";
        personaje1.raza = "Elio";
        personaje1.vida = 7000;

        System.out.println(); // esto es para separar un poco de arriba

        System.out.println("El nombre del personaje 1 es: "+personaje1.nombre);
        System.out.println("La Raza del personaje 1 es: "+personaje1.raza);
        System.out.println("El Hp del personaje 1 es: "+personaje1.vida);

        System.out.println(); // esto es para separar datos de pj1 y de pj2.

        // creamos un segundo objeto y asi tantos como queramos.

        Personaje personaje2 = new Personaje();

        personaje2.nombre = "Assasin";
        personaje2.raza = "Asmo";
        personaje2.vida = 4000;

        System.out.println("El nombre del personaje 2 es: "+personaje2.nombre);
        System.out.println("La Raza del personaje 2 es: "+personaje2.raza);
        System.out.println("El Hp del personaje 2 es: "+personaje2.vida);








    }



}

