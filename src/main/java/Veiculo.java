public class Veiculo {

    // Declarando os atributos Veiculo
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float velocMax;
    private int qtdRodas;
    private Motor motor;

    // Construtores
    public Veiculo() {

        this.placa = "";
        this.marca = "";
        this.modelo = "";
        this.cor = "";
        this.velocMax = 0;
        this.qtdRodas = 0;
        motor = new Motor();
    }

    // Parametros
    public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qtdRodas = qtdRodas;
        this.motor = motor;
    }

    // Getters e setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getVelocMax() {
        return velocMax;
    }

    public void setVelocMax(float velocMax) {
        this.velocMax = velocMax;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // Override toString
    @Override
    public String toString() {

        // Informacoes do Veiculo
        System.out.print("Veiculo Cadastrado\n");
        System.out.println("Placa: " +this.placa);
        System.out.println(("Marca: " + this.marca));
        System.out.println(("Modelo: " + this.modelo));
        System.out.println(("Cor: " + this.cor));
        System.out.println(("Velocidade Maxima: " + this.velocMax));
        System.out.println(("Quantidade de Rodas:" + this.qtdRodas));

        // Motor
        System.out.println("\nInformações sobre o Motor");
        System.out.println("Quantidade de Pistoes: " + this.motor.getQtdPist());
        System.out.println("Potencia do Motor: " + this.motor.getPotencia() + "CV");
        System.out.println("\n***********************************\n");
        return null;
    }
}

