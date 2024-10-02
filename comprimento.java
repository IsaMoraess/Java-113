package COM_TABELA;

import javax.swing.JOptionPane;
public class comprimento {
    public static void main(String[] args) {

        // Captura os comprimentos dos lados utilizando JOptionPane
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do primeiro pedaço de madeira: "));
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do segundo pedaço de madeira: "));
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do terceiro pedaço de madeira: "));

        // Cria uma instância da classe Triangulo
        Triangulo triangulo = new Triangulo();

        // Verifica e obtém o resultado do tipo de triângulo ou a mensagem de erro
        String resultado = triangulo.verificaETipoTriangulo(lado1, lado2, lado3);

        // Exibe o resultado em uma janela de diálogo
        JOptionPane.showMessageDialog(null, resultado);
    }
}

