package src;

import java.util.Scanner;

public class VetorString {
    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "BA";
        estados[2] = "CE";
        estados[3] = "DF";
        estados[4] = "AM";
        estados[5] = "AP";
        estados[6] = "PB";
        estados[7] = "RN";
        estados[8] = "MS";
        estados[9] = "SP";

        for (int i = 0; i < estados.length; i++){
            System.out.println("estado " + i + ": " + estados[i]);
        }

        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual estado deseja buscar? ");
        String sigla = entrada.nextLine();

        //Busca Linear
        boolean existe = false;

        for (int i = 0; i < estados.length; i++){
            String elemento = estados[i];
            if (sigla.equalsIgnoreCase(elemento)){
                existe = true;
                break;
            }
        }

        if (existe) {
            System.out.println("Encontrou");
        }else {
            System.out.println("Não encontrou");
        }
    }
}
