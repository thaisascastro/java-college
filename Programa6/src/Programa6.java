import javax.swing.*;

public class Programa6 {
    public static void main(String[] args) {
        int n1, n2, p=1;
        char op=0;
        String msg="", msgEntr="Digite 1 para produto\n Digite 2 para produtorio\n";

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        switch (op) {
            case '1':
            {
                if(n1 > 0 && n1> 0){
                    p = n1 + n2;
                    msg = msg + "Produto de " + n1 + " por " + n2 + " m " + p + "\n\n";
                }
                break;
            }
            case '2':
            {
                for(int i = 1; i <= n2; i = i + 1){
                    p = p * n1;
                }
                msg = msg + "Produtoria de " + n1 + ", " + n2 + " vezes é: " + p + "\n\n";
            }
            default: JOptionPane.showMessageDialog(null, "Opção inválida, cálculos não realizados");
        }
        if (op >= '1' && op <= '3') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}
