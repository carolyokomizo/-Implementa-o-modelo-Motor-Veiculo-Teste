public class Motor {

    // Declarando os atributos Motor
    private int qtdPist;
    private int potencia;


    // Construtores
    public Motor() {
        this.qtdPist = 0;
        this.potencia = 0;
    }

    // Parametros
    public Motor (int qtdPist, int potencia) {
        this.qtdPist = qtdPist;
        this.potencia = potencia;
    }

    // Getters e setters

    public int getQtdPist() {
        return qtdPist;
    }

    public void setQtdPist(int qtdPist) {
        this.qtdPist = qtdPist;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
