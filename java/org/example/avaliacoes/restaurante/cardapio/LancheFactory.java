package org.example.avaliacoes.restaurante.cardapio;

public class LancheFactory {
    public static Lanche bauruPileque () {
        return new Lanche("Bauru Pileque", 31.90);
    }

    public static Lanche bauruFrangoDaCasa () {
        return new Lanche("Bauru de frango da Casa", 34.56);
    }

    public static Lanche bauruStrogonoff () {
        return new Lanche ("Bauru strogonoff", 37.90);
    }

    public static Lanche bauruSuperComBacon () {
        return new Lanche("Bauru Super com bacon", 47.80);
    }

    public static Lanche cocaColaZeroLata() {
        return new Lanche ("Coca-cola zero lata", 5.70);
    }

    public static Lanche guaranaFrukiLata () {
        return new Lanche ("Guaraná Fruki lata", 5.70);
    }

    public static Lanche batataCrinkleSimples() {
        return new Lanche("Batata crinkle simples", 17.00);
    }

    public static Lanche batataCanoa() {
        return new Lanche("Batata canoa", 20.00);
    }
}
