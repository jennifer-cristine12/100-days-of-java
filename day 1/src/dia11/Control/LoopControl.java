package dia11.Control;

import java.util.Random;

public class LoopControl {
    // usando for
    public int somaFor(int n) {
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += i;
        }
        return soma;
    }

    // usando while
    public int somaWhile(int n) {
        int i = 0;
        int soma = 0;
        while (i < n) {
            i++;
            soma += i;

        }
        return soma;
    }

    // usando do-while
    public int somaDoWhile(int n) {
        int i = 0;
        int soma = 0;
        do {
            i++;
            soma += i;

        } while (i < n);
        return soma;
    }

    // soma usando apenas numeros pares (usando continue)
    public int somaContinue(int n) {
        int i = 0;
        int soma = 0;
        while (i < n) {
            i++;
            if (i % 2 == 1) {
                continue;

            }
            soma += i;
        }
        return soma;
    }

    // gerar numeros aleatorios de 1 a 100 até encontar um numero que seja divisivel
    // por 5 e 7, quando o numero for encontrado, retorne e termine com break

    public void rand100() {
        Random rand = new Random();
        
        
        while (true){
            int random = rand.nextInt(101);
          
            if (random % 5 == 0 && random % 7 == 0) {
                System.out.println(random);

                break;
            }
        }
    }

    }

