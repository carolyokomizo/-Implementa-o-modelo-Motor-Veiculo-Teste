
public class Teste {
    public static void main(String[] args) {

        // Criando o Veiculo
        // Veiculo 1: Moto
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setPlaca("MOT-123");
        veiculo1.setMarca("Honda");
        veiculo1.setModelo("Elite125");
        veiculo1.setCor("Roxo");
        veiculo1.setVelocMax(150.0F);
        veiculo1.setQtdRodas(2);

        veiculo1.getMotor().setQtdPist(1);
        veiculo1.getMotor().setPotencia(15);

        veiculo1.toString();

        // Veiculo 2 - Carro
        Veiculo veiculo2 = new Veiculo();
        veiculo2.setPlaca("CAR-321");
        veiculo2.setMarca("Renault");
        veiculo2.setModelo("Kwid");
        veiculo2.setCor("Branco");
        veiculo2.setVelocMax(130.0F);
        veiculo2.setQtdRodas(4);

        veiculo2.getMotor().setQtdPist(3);
        veiculo2.getMotor().setPotencia(71);

        veiculo2.toString();

        // Veiculo 3 - Carro Eletrico
        Veiculo veiculo3 = new Veiculo();
        veiculo3.setPlaca("RAC-755");
        veiculo3.setMarca("BYD");
        veiculo3.setModelo("BYD Dolphin Mini");
        veiculo3.setCor("preto");
        veiculo3.setVelocMax(280.0F);
        veiculo3.setQtdRodas(4);

        veiculo3.getMotor().setQtdPist(0);
        veiculo3.getMotor().setPotencia(75);

        veiculo3.toString();

        // Veiculo 4 - Caminhao
        Veiculo veiculo4 = new Veiculo();
        veiculo4.setPlaca("MAR-456");
        veiculo4.setMarca("Volvo");
        veiculo4.setModelo("FH 540");
        veiculo4.setCor("Branco");
        veiculo4.setVelocMax(90.0F);
        veiculo4.setQtdRodas(8);

        veiculo4.getMotor().setQtdPist(6);
        veiculo4.getMotor().setPotencia(540);

        veiculo4.toString();

        // Veiculo 5 - Onibus
        Veiculo veiculo5 = new Veiculo();
        veiculo5.setPlaca("BUS-360");
        veiculo5.setMarca("Mercedes-Benz");
        veiculo5.setModelo("LO 916");
        veiculo5.setCor("Cinza");
        veiculo5.setVelocMax(110.0F);
        veiculo5.setQtdRodas(4);

        veiculo5.getMotor().setQtdPist(4);
        veiculo5.getMotor().setPotencia(163);

        veiculo5.toString();
    }
}
