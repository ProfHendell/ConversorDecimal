/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author hende
 */
public class Conversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor = decbin(14);
        System.out.println(valor);
    }

    public static String decbin(double numero) {
        double cociente = -1;
        double resta = 0;
        String buffer = "";

        while (cociente != 0) {
            cociente = Math.floor(numero / 2);
            resta = Math.floor(numero % 2);
            numero = cociente;
            buffer = buffer + (int) resta;
        }
        return new StringBuilder(buffer).reverse().toString();
    }

    public static void bindec(double binario) {

    }

}
