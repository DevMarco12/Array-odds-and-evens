import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    Integer numeros[] = new Integer[10];
    Integer par[] = new Integer[10];
    Integer impar[] = new Integer[10];

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Digite o " + (i + 1) + " número: ");
      numeros[i] = ler.nextInt();
    }

    int vetorPar = 0;
    int vetorImpar = 0;

    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] % 2 == 0) {
        par[vetorPar] = numeros[i];
        vetorPar++;
        }
        else {
          impar[vetorImpar] = numeros[i];
          vetorImpar++;
        }
    }

    for(int i = 0; i < numeros.length; i++) {
      System.out.println("O " + (i + 1) + " número digitado foi: " + numeros[i]);
    }
    for (int i = 0; i < par.length; i++) {
      if (par[i] == null) {
      break;
    }

    System.out.println("Os números pares digitados foram: " + par[i]);
    }
    for (int i = 0; i < impar.length; i++) {
      if (impar[i] == null) {
      break;
    }

    System.out.println("Os números impares ímpares digitados foram: " + impar[i]);
    }
  }
}