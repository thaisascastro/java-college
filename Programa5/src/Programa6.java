import javax.swing.*;

class ProgRepeticao {
     public static void main(String[] args) {
         int Tabuada;
         char op=0;
         String msg ="", msgEntr="Digite 1 repetição for\nDigite 2 para repetição while\n" +
                 "Digite 3 para repetição do/while";

         Tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
         op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

         switch (op) {
             case '1': {
                 msg = msg + "Tabuada do " + Tabuada + "pelo for: \n\n";
                 for(int i=1; i<=10; i=i+1) {
                     msg = msg + Tabuada + " x " + i + " = " + Tabuada*i + "\n";
                 }
                 break;
             }
             case '2': {
                 msg = msg + "Tabuada do " + Tabuada + "pelo while: \n\n";
                 int i = 1;
                 while(1 <=10) {
                     msg = msg + Tabuada + " x " + i + " = " + Tabuada*i + "\n";
                     i = i + 1;
                 }
             }
             case '3': {
                 msg = msg + "Tabuada do " + Tabuada + "pelo do/while: \n\n";
                 int i = 1;
                 do  {
                     msg = msg + Tabuada + " x " + i + " = " + Tabuada * i + "\n";
                     i = i + 1;
                 } while (i <= 10);
                 break;
             }
             default: JOptionPane.showMessageDialog(null, "Opção inválida, cálculos não realizados");
             if(op >= 'i' && op <= '3') {
                 JOptionPane.showMessageDialog(null, msg);
             }
             System.exit(0);
         }
     }
}
