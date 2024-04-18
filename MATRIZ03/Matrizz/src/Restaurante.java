import javax.swing.JOptionPane;

public class Restaurante {

    public static void main(String[] args) {

        // Declaração de variáveis

        String dados[][] = new String[3][3]; // Matriz para armazenar os dados dos restaurantes (3 restaurantes, cada um com 3 informações)

        int linha, coluna; // Variáveis de controle para os loops

        String saida = "Nome: "; // String para construir a mensagem de saída

        // Entrada de Dados

        JOptionPane.showMessageDialog(null, "Entrada de dados"); // Mostra uma mensagem de entrada de dados

        for (linha = 0; linha < 3; linha++) { // Loop para cada restaurante

            // Solicita ao usuário o nome, cidade e estado do restaurante atual
            dados[linha][0] = JOptionPane.showInputDialog("Entre com o nome:");
            dados[linha][1] = JOptionPane.showInputDialog("Entre com a Cidade:");
            dados[linha][2] = JOptionPane.showInputDialog("Entre com o Estado:");

        } // Fim do for

        // Exibição de dados

        for (linha = 0; linha < 3; linha++) { // Loop para cada restaurante

            for (coluna = 0; coluna < 3; coluna++) { // Loop para cada informação do restaurante atual

                // Adiciona as informações do restaurante atual à string de saída
                saida += dados[linha][coluna];
                if (coluna == 0) {

                    saida += "\nCidade: "; // Adiciona "Cidade:" se estiver na primeira coluna
                } else if (coluna == 1) {

                    saida += "\nEstado: "; // Adiciona "Estado:" se estiver na segunda coluna
                }
            } // Fim do for interno

            saida += "\n"; // Adiciona uma quebra de linha entre os restaurantes

        } // Fim do for externo

        // Exibe a mensagem com os dados dos restaurantes
        
        JOptionPane.showMessageDialog(null, "Dados:\n" + saida);
    }
}
