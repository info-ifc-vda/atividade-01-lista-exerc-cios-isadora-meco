/*Faça um programa que receba dez números inteiros e mostre a quantidade de números
primos dentre os número que foram digitados.*/
import javax.swing.JOptionPane;
public class Ex10Lst1 {
    public static void main (String[] args)
    {
        int num;
        int cont=0;
        for (int j = 0;j<10;j++)
        {
            String n = JOptionPane.showInputDialog("Digite um número:\n");
            num = Integer.parseInt(n);
            if (num==2)
            {
                cont++;
            }
            for (int i = 2;i<num;i++)
            {
               if (num%i==0)
                {
                  break;
                }
                else if ((i==num-1)& (num%i!=0))
                {
                    cont++;
                }
            }
            num=0;
        }
        JOptionPane.showMessageDialog(null, "O total de múmeros primos é:\n"+cont);
    } 
}