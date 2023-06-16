package Interface;

import java.util.Scanner;

public class Central {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bem vindo ao programa para calcular a área de um retângulo,círculo ou triângulo.");
            System.out.println("Digite: \n(1)Retângulo \n(2)Círculo \n(3)Triângulo");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    Retangulo retangulo = new Retangulo();
                    System.out.println("Digite a altura do retângulo:");
                    retangulo.setAltura(scanner.nextDouble());
                    System.out.println("Digite a largura do retângulo:");
                    retangulo.setLargura(scanner.nextDouble());
                    System.out.println("A área do retângulo é:" + retangulo.calculateArea());
                    break;
                case 2:
                    Circulo circulo = new Circulo();
                    System.out.println("Digite o raio:");
                    circulo.setRaio(scanner.nextDouble());
                    System.out.println("A área do retângulo é:" + circulo.calculateArea());
                    break;
                case 3:
                    Triangulo triangulo = new Triangulo();
                    System.out.println("Digite a base do triângulo:");
                    triangulo.setBase(scanner.nextDouble());
                    System.out.println("Digite a altura do triângulo:");
                    triangulo.setAltura(scanner.nextDouble());
                    System.out.println("A área do retângulo é:" + triangulo.calculateArea());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
                    
            }
 scanner.close();
        } catch (Exception e) {
            System.out.println("Erro inesperado");
        }
    }
}
