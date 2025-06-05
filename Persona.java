public class Persona {
    //Todas las personas pueden hacer muchas cosas, las personas tienen nombre, edad
    //etc, asi que vamos a simular algunas actividades mediante metodos.

    //Una buena practica es declarar viariables en la parte mas alta del codigo

    int edad = 20;

    void mayorDeEdad() {
        if (edad >= 18) {
            System.out.println("Eres un mayor de edad");
        }else{
            System.out.println("Eres un adolescente");
        }
    }

    void descansar(boolean estaCansado) {
        if(estaCansado){
            System.out.println("Vete a dormir");
        } else {
            System.out.println("Sigue practicando codigo...:3");
        }
    }

    void puedeDesayunar(boolean hayComida) {
        if (hayComida) {
            System.out.println("Puedes desayunar");
        } else {
            System.out.println("No hay desayuno disponible");
        }
    }

    void puedeEntrenar(boolean tieneTiempo) {
        if (tieneTiempo) {
            System.out.println("Puedes ir a entrenar boxeo");
        } else {
            System.out.println("Hoy no hay tiempo para entrenar");
        }
    }

    void puedeCocinar(boolean tieneIngredientes) {
        if (tieneIngredientes) {
            System.out.println("Puedes cocinar algo delicioso");
        } else {
            System.out.println("Faltan ingredientes para cocinar");
        }
    }

    void salirAComprar(boolean faltaAlgo) {
        if (faltaAlgo) {
            System.out.println("Debes salir a comprar");
        } else {
            System.out.println("Tienes todo lo necesario");
        }
    }

    void limpiarCasa(boolean estaSucia) {
        if (estaSucia) {
            System.out.println("Es hora de limpiar la casa");
        } else {
            System.out.println("La casa ya está limpia");
        }
    }
}