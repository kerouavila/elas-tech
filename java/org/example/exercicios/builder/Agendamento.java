package org.example.exercicios.builder;

public class Agendamento {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    private Agendamento(Builder builder) {
        this.nomePet = builder.nomePet;
        this.servico = builder.servico;
        this.horario = builder.horario;
        this.perfume = builder.perfume;
        this.laco = builder.laco;
        this.hidratacao = builder.hidratacao;
        this.observacao = builder.observacao;
        this.desconto = builder.desconto;
    }

    public void mostrar(){
        System.out.println("Dados do agendamento: ");
        System.out.println("Nome do Pet: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horário: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + laco);
        System.out.println("Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.println("Desconto: " + (desconto * 100) + "%");
        System.out.println();
    }

    public static class Builder {
        private String nomePet;
        private String servico;
        private String horario;
        private boolean perfume = false;
        private boolean laco = false;
        private boolean hidratacao = false;
        private String observacao = "";
        private double desconto = 0.0;

        public Builder(String nomePet, String servico, String horario) {
            this.nomePet = nomePet;
            this.servico = servico;
            this.horario = horario;
        }

        public Builder comPerfume(boolean perfume) {
            this.perfume = perfume;
            return this;
        }

        public Builder comLaco(boolean laco) {
            this.laco = laco;
            return this;
        }

        public Builder comHidratacao(boolean hidratacao) {
            this.hidratacao = hidratacao;
            return this;
        }

        public Builder observacao(String observacao) {
            this.observacao = observacao;
            return this;
        }

        public Builder desconto(double desconto) {
            this.desconto = desconto;
            return this;
        }

        public Agendamento build() {
            return new Agendamento(this);
        }
    }
}
