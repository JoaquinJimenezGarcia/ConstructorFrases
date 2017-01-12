package com.joaquinjimenezgarcia;

public class Main {

    public static void main(String[] args) {

        String verbos[] = {
                "Coger", "Arrascar", "Saltar", "Machacar", "Peregrinar", "Maximizar", "Nivelar", "Integrar", "Transformar"
        };
        String conceptos[] = {
                "transiciones", "paradigmas", "tabulaciones", "miembros", "dubitaciones", "estupefacientes", "relaciones", "redes", "canales"
        };
        String adjetivos[] = {
                "granulares", "de activación", "viriles", "populares", "de contorno", "perimetrales", "conyugales", "globales", "timables"
        };

        imprimirFrase(verbos, conceptos, adjetivos);

    }

    static void imprimirFrase(String vb[], String concept[], String adj[]){

        System.out.println(vb[(int)(Math.random()*vb.length)] + " " +
                           concept[(int)(Math.random()*concept.length)] + " " +
                           adj[(int)(Math.random()*adj.length)]
        );
    }
}
