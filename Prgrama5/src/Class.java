import javax.swing.*;

class ProgDecisao {
    public static void main(String[] args) {
        int num;
        char op=0;
        String msg="", msgEntr="Digite 1 para par/impar\nDigite 2 para positivo/negativo";

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        switch (op) {
            case '1': {
                if(num % 2 == 0) {
                    msg = msg + num + "É par.\n";
                }
                else {
                    msg = msg + num + "É ímpar.\n";
                }
                break;
            }
            case '2':
            {
                if(num > 0) {
                    msg = msg + num + "É positivo.\n";
                }
                else {
                    msg = msg + num + "Não é positivo.\n";
                }
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opção inválida, cálculos não realizados");

            if (op == '1' || op == '2') {
                JOptionPane.showMessageDialog(null, msg);
            }
            System.exit(0);
        }
    }
}
