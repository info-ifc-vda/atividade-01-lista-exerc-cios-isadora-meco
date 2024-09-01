/*Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
calcule e mostre:
• a quantidade de jogadores com idade inferior a 18 anos;
• a média das idades dos jogadores de cada time;
• a média das alturas de todos os jogadores do campeonato;
• a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato.
 */

 import javax.swing.JOptionPane;

 public class Ex5Lst1 {
     public static void main (String[] args)
     {
         int idade;
         int altura;
         int peso;
         int i;
         int cont = 0;
         int contp = 0;
         int contid = 0;
         int somaid = 0;
         int somalt = 0;
         int[] vet = new int[5];
 
         for (i=0;i<10;i++) //mudar o 10 pra 55
         {
             String id = JOptionPane.showInputDialog("Digite a idade do jogador:");
             idade = Integer.parseInt(id);
             String a = JOptionPane.showInputDialog("Digite a altura do jogador em centímetros:");
             altura = Integer.parseInt(a);
             String p = JOptionPane.showInputDialog("Digite o peso do jogador:");
             peso = Integer.parseInt(p);
             cont++;
             somaid+=idade;
             somalt+=altura;
             if (cont == 2) // colocar 11
             {
                vet[0] = somaid;
                somaid = 0;
             }
             else if (cont == 4) // colocar 22
             {
                vet[1] = somaid;
                somaid = 0;
             }
             else if (cont == 6) // colocar 33
             {
                vet[2] = somaid;
                somaid = 0;
             }
             else if (cont == 8) // colocar 44
             {
                vet[3] = somaid;
                somaid = 0;
             }
             else if (cont == 10) // colocar 55
             {
                vet[4] = somaid;
                somaid = 0;
             }
             if (idade<18)
             {
                 contid++;
             }
             if (peso > 80)
             {
                contp++;
             }

         }
         JOptionPane.showMessageDialog(null, "A quantidade de jogadores com idade menor de 18 é:\n"+contid);// mudar os valores dos divisores embaixo por 11
         JOptionPane.showMessageDialog(null, "A média da idade de cada time é:\n1 - "+(float)(vet[0]/2)+"\n2 - "+(float)(vet[1]/2)+"\n3 - "+(float)(vet[2]/2)+"\n4 - "+(float)(vet[3]/2)+"\n5 - "+(float)(vet[4]/2));
         JOptionPane.showMessageDialog(null, "A média da altura de todos os jogadores do campeonato é:\n"+(float)(somalt/10));//mudar o divisor pra 55
         JOptionPane.showMessageDialog(null, "A porcentagem dos jogadores com mais de 80kg é:\n"+(float)((contp*100)/10)); //mudar o 10 p 55
     }
     
 }