/*1. Faça um programa que recebe o número de horas trabalhadas, e o valor da hora trabalhada. Calcule e mostre o salário a receber seguindo estas regras:
• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
hora trabalhada;
• o imposto equivale a 30% do salário bruto;
• o salário a receber equivale ao salário bruto menos o imposto. */
import javax.swing.JOptionPane;
public class Ex1Lst1 
{
    
    public static void main (String[] args)
    {
        float hr;
        float vl;
        float cal = 0;
        JOptionPane.showMessageDialog(null, "Bem vindo!");
        String hrs = JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:");
        hr = Float.parseFloat(hrs);
        String vlr = JOptionPane.showInputDialog("Digite o valor da hora trabalhada:");
        vl = Float.parseFloat(vlr);

        cal = hr*vl;

        JOptionPane.showMessageDialog(null,("O valor do salário a receber é:\nR$ ")+(cal*0.7));
    }
}