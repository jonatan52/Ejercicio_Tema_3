public class Coche {
    int puertas =  4;


    public static void main(String[] args) {
        Coche miCoche =  new Coche();



        int resultado = suma(10, 5, 8);
        System.out.println("La suma de los numeros es " + resultado);


        incremento_puertas(miCoche.puertas);
        System.out.println("mi cohe ahora tiene " + incremento_puertas(miCoche.puertas) + " puertas");

    }


    //función con tres parámetros
    public static int suma(int a, int b, int c){

        int resultado = a + b + c;

        return resultado;
    }


        public static int incremento_puertas(int x){
        x++;
            return x;
        }

        }









