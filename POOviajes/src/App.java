public class App {
    public static void main(String[] args) throws Exception {

        /*
         * insanciamos tipo viaje
         * @params = pais(string), dias(int) -entre 3 y 7 días, precio(double) -en euros
         * 
         */
        Viaje viajeLujo = new Viaje("Japón",20, 3500); //6. instanciar objeto
        //7. Operar con el objeto
        System.out.println("Viaje " + viajeLujo.getPais() + ", "  + viajeLujo.getDias() + " días por " +  + viajeLujo.getPrecio() + "€");
        viajeLujo.setDias(30);
        System.out.println(viajeLujo.toString());//necesita toString() para visualizarlo correctamente

        /*SINO TENDRIAMOS QUE HACERLO UNO A UNO ASI
        String viajeLujoPais = "Japon";
        int viajeLujoDias=20;
        double viajeLujoPrecio=3500;

        String viajeRutaFotograficaPais="Kenia";
        int viajeRutaFotograficaDias=30;
        double viajeRutaFotograficaPrecio=5300;

        String viajeCaseroPais="Balaguer";
        int viajeCaseroDias=3;
        double viajeCaseroPrecio=120;
        */
    }
}
