/*Faça um programa que leia um número inteiro e diga se ele é primo */
import javax.swing.JOptionPane;
public class Ex9Lst1 {
    public static void main (String[] args)
    {
        int num;
        String n = JOptionPane.showInputDialog("Digite um número:\n");
        num = Integer.parseInt(n);
        if ((num==0)|(num==1))
        {
            JOptionPane.showMessageDialog(null, "Esse número não é primo.");
        }
        else if (num==2)
        {
            JOptionPane.showMessageDialog(null, "Esse número é primo.");
        }
        for (int i = 2;i<num;i++)
        {
            if (num%i==0)
            {
                JOptionPane.showMessageDialog(null, "Esse número não é primo.");
                break;
            }
            else if ((i==num-1)& (num%i!=0))
            {
                JOptionPane.showMessageDialog(null, "Esse número é primo.");
            }
        }

    }
}