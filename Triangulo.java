package COM_TABELA;

public class Triangulo {

    // Método que verifica se pode formar um triângulo e retorna o tipo, ou indica que não pode formar
    public String verificaETipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                return "Equilátero";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        } else {
            return "Não pode formar um triângulo.";
        }
    }
}
