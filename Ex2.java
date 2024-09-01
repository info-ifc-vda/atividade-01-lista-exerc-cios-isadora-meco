/*Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
residência, calcule e mostre:
• o valor de cada quilowatt;
• o valor a ser pago por essa residência; */
import javax.swing.JOptionPane;
public class Ex2Lst1 
{
    public static void main(String[] args)
    {
        float sl;
        float qw;
        String s = JOptionPane.showInputDialog("Digite o valor do salário mínimo:");
        sl = Float.parseFloat(s);
        String q = JOptionPane.showInputDialog("Digite a quantidade de quilowatts consumida pela residência:");
        qw = Float.parseFloat(q);

        JOptionPane.showMessageDialog(null, ("O valor do quilowatt é:\nR$ "+(sl*0.01)));
        JOptionPane.showMessageDialog(null, ("O valor a ser pago por essa residência é:\nR$ "+((sl*0.01)*qw)));
    }
}