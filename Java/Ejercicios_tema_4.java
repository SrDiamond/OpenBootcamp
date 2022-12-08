public class Main {
    public static void main(String[] args) {
        int numeroIf=4, numeroWhile=0,numeroFor;
        String estacion="Otoño";

        //Saldra positivo ya que el valor de la variable es positivo
        if(numeroIf>0) System.out.println("El numero es positivo");
        else if (numeroIf==0) System.out.println("El numero es 0.");
        else System.out.println("El numero es negativo");
        System.out.println("------------------------");

        //Mostrara del 0 hasta el 2. Si queremos que mostrara el 3 tendria que ser menor e igual.
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("------------------------");

        //Mostrara el numero 3.
        do{
            System.out.println(numeroWhile);
        }while(numeroWhile<3);
        System.out.println("------------------------");

        //Mostrara del 0 hasta el 3
        for(numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("------------------------");

        //Mostrara el otoño
        switch(estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("No es un estacion");
        }
    }
}