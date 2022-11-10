public class Main {

    //*********** Primera parte: variable numerolf positivo, negativo o 0 *******
    public static void main(String[] args) {
        String numerolf = "-53";

        if (numerolf == "-53")
        {
            System.out.println("Número negativo");
        }
        else if (numerolf == "10"){

            System.out.println("Número positivo");

        }
        else {
            System.out.println("No es positivo ni negativo, el número es 0");
        }




        //
        //***** Segunda parte, bucle while ******
        //
        int contadorWhile = -1;

        while (contadorWhile <3){
            System.out.println(contadorWhile);
            contadorWhile = contadorWhile + 1;
        }





        //
        //******** Tercera parte, bucle do while *******
        //

    int contadorDO = 2;

        do{

            contadorDO = contadorDO +1;
            System.out.println(contadorDO);

        } while (contadorDO < 3);





        //
        //********** Bucle For ************
        //

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1) {
            System.out.println(numeroFor);
        }





        //
        //********** Switches *************
        //

            var estacion = "INVIERNO";


            switch (estacion){
                case "PRIMAVERA":
                    System.out.println("Es primavera");
                    break;
                case "VERANO":
                    System.out.println("Es verano");
                    break;
                case "OTOÑO":
                    System.out.println("Es otoño");
                    break;
                case "INVIERNO":
                    System.out.println("Es invierno");
                    break;
                default:
                    System.out.println("No hay estación disponible");





            }




    }
}