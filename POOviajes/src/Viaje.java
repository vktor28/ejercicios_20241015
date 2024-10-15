//1. crear la clase en documento aparte
/** 
@author victor juarez
*/
public class Viaje {


    //2. Definir propiedades o atributos
    //datos suelen ser PRIVADOS (se accede a travñes de un método público)
    private String pais;
    private int dias;
    private double precio;
/**
    * @param pais indica el pais
     * @param dia indica los dias
     * @param precio indica el precio
 */

    // métodos sueles ser públicos
    //3. crear método CONSTRUCTOR del objeto
    //palabra clave "this"

    public Viaje(String pais, int dias, double precio){
        this.pais=pais;
        this.dias=dias;
        this.precio=precio;
    }


    // 4. crear GETTERS para leer la información y SETTERS para modificar
    // Getters retornan lo que pides
    // setters reciben qué quieres cambiar
    //GETTERS-----
    public String getPais(){
        return this.pais; //devuelce el que encuentra aquí
    }
    public int getDias(){
        return this.dias;
    }
    public double getPrecio(){
        return this.precio;
    }
    //SETTERS---
    public void setPais(String pais){
        this.pais = pais; //sobreescribe el que había
    }

    public void setDias(int dias){
        this.dias = dias;
    }
    public void seetPrecio(double precios){
        this.precio = precio;
    }

    // 5. Sobreescribir el método toString para p
    @Override
    public String toString(){
        return "el país destino es: " + getPais() + " durante " + getDias()+" por solo" + getPrecio() + "$";
    }






}
