/*Faça um programa que leia dois números e apresente o fatorial de todos os números
que estejam dentro do intervalo definido pelos números que foram lidos */

import javax.swing.JOptionPane;
public class Ex7Lst1 {
    public static void main (String[] args)
    {
        int num1;
        int num2;
        int fat=1;
        String n1 = JOptionPane.showInputDialog("Digite o primeiro valor:\n");
        num1 = Integer.parseInt(n1);
        String n2 = JOptionPane.showInputDialog("Digite o segundo número:\n");
        num2 = Integer.parseInt(n2);
        for (int j=num1;j<=num2;j++)
        {
            for (int i = 1;i<=j;i++)
            {
                fat*=i;
            }
            JOptionPane.showMessageDialog(null, "O fatorial do número "+j+" é: "+fat);
            fat = 1;
        }
    }
}