# Lista de revisão publicada em 16 de outubro de 2026 no curso de Java da SoulCode, ElasTech.

## Respostas para a questão 1:

### a) Explique, com suas palavras, o que é abstração em programação orientada a objetos.
A abstração é um processo para simplificar atributos e comportamentos essenciais de um objeto, ocultando a complexidade do código para focar no que o objeto faz, e não em como ele está sendo feito.

### b) Qual a diferença entre abstração e encapsulamento?
A abstração oculta detaljes para deixar o código mais objetivo. O encapsulamento oculta informações para trazer mais segurança para a aplicação. 

### c) Quando você usa lista.add("Bilbo"), você sabe como o Java guarda esse elemento na memória? Por que isso é um exemplo de abstração?
ao usar "lista.add("Bilbo") eu tenho um ccomando mais simples para inserir um novo elemento a um Array ou Arraylist sem que eu precise me preocupar com a composição que tem por trás da ação.


## Respostas para a questão 2:

### Para cada código abaixo, diga qual princípio do SOLID está sendo violado e explique como você corrigiria.
### a) 
```java
class Relatorio {
    void calcularTotais() { /* ... */ }
    void formatarEmPdf() { /* ... */ }
    void salvarNoDisco() { /* ... */ }
    void enviarPorEmail() { /* ... */ }
}
```
O princípio que foi violado foi o da responsabilidade única, pois a mesma classe relatório está acumulando múltiplas funções, como calcular, salvar e enviar. Se eu fosse corrigir, eu criaria uma classe para calcular e formatar, uma para salvar e outra para enviar por e-mail.

### b)
```java
class EnviadorEmail {
    void enviar(String tipo) {
        if (tipo.equals("aniversario")) {
            System.out.println("Feliz aniversário!");
        } else if (tipo.equals("seguranca")) {
            System.out.println("Alerta de segurança!");
        } else if (tipo.equals("promocao")) {
            System.out.println("Promoção imperdível!");
        }
    }
}
```
Está violando o princípio de aberto/fechado, utilizando uma classe para inserir condicionais que verificam cada tipo de e-mail. Eu tentaria criar uma interface com classes para cada tipo de e-mail.

### c)
```java
class EnviadorEmail {
    void enviar(String tipo) {
        if (tipo.equals("aniversario")) {
            System.out.println("Feliz aniversário!");
        } else if (tipo.equals("seguranca")) {
            System.out.println("Alerta de segurança!");
        } else if (tipo.equals("promocao")) {
            System.out.println("Promoção imperdível!");
        }
    }
}
```
A classe principal está dependendo de um banco de dados do MySQL. Se um dia precisar trocar, vai precisar alterar o código interno da classe.
