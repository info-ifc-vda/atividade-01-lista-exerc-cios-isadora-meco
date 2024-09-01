/*Faça um programa que leia um número e calcule o fatorial desse número*/
import javax.swing.JOptionPane;
public class Ex6Lst1 {
   public static void main (String[] args)
   {
       int num;
       int fat = 1;

       String n = JOptionPane.showInputDialog("Digite um número:\n");
       num = Integer.parseInt(n);
       for (int i = 1;i<=num;i++)
       {
           fat*=i;
       }
       JOptionPane.showMessageDialog(null, "O fatorial do número "+num+" é:\n"+fat);
   }
}