package org.example.A008.Pet;

public class MeuPet {
    static void main(String[] args) {

        Pet gato = new Pet();
        gato.adotado = true;
        gato.cor = "Frajola";
        gato.fivFelv = false;
        gato.genero = "Macho";
        gato.idade = 11;
        gato.obeso = true;
        gato.pelo = "médio";
        gato.peso = 5.5;
        gato.raca = "SRD";
        gato.tamanho = "grande";
        gato.nome = "Bilbo";

        Pet cachorro = new Pet();
        cachorro.adotado = false;
        cachorro.cor = "Preto";
        cachorro.fivFelv = false;
        cachorro.genero = "Fêmea";
        cachorro.idade = 0;
        cachorro.obeso = false;
        cachorro.pelo = "Longo";
        cachorro.peso = 40.0;
        cachorro.raca = "SRD";
        cachorro.tamanho = "grande";
        cachorro.nome = "Elton John";

        System.out.println("Em 2016, adotei o gato " + gato.cor + " mais lindo da minha vida. O nome dele é " + gato.nome + ".");
        System.out.println("Ele tem " + gato.idade + " anos, é " + gato.genero + ", e pesa " + gato.peso + " Kg.");
        System.out.println("Quando eu fui adotá-lo, a veterinária disse que ele não ia crescer muito. Mas ele cresceu, ficou " + gato.tamanho + " e com o pelo " + gato.pelo + ".");
        System.out.println();
        System.out.println("Esses dias eu estava andando pelo bairro e vi um cachorro " + cachorro.cor + " muito " + cachorro.tamanho + " e com o pelo " + cachorro.pelo + ". Devia pesar uns " + cachorro.peso + " Kg.");
        System.out.println("Eu o achei muito lindo e, se um dia eu resolver adotar um cachorro, vou dar a ele o nome de " + cachorro.nome + " se for macho.");
    }
}
