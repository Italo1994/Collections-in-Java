package List.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros;

    public SomaNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int somaTotal = 0;

        for(Integer numero : listaNumeros) {
            somaTotal += numero;
        }

        return somaTotal; 
    } 

    public int encontrarMaiorNumero() {
        int maiorNumero = listaNumeros.get(0);

        for(Integer numero : listaNumeros) {
            if(numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = listaNumeros.get(0);

        for(Integer numero : listaNumeros) {
            if(numero < menorNumero) {
                menorNumero = numero;
            }
        }

        return menorNumero;
    }

    public void exibirNumeros() {
        int count = 0;
        for(Integer numero : listaNumeros) {
            System.out.println((count+1) + "th = " + numero);
            count++;
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(50);
        somaNumeros.adicionarNumero(60);
        somaNumeros.adicionarNumero(70);
        somaNumeros.adicionarNumero(80);
        somaNumeros.adicionarNumero(90);
        somaNumeros.adicionarNumero(100);

        int somaTotal = somaNumeros.calcularSoma();
        int maior = somaNumeros.encontrarMaiorNumero();
        int menor = somaNumeros.encontrarMenorNumero();

        System.out.println("Maior número na lista: " + maior);
        System.out.println("Menor número na lista: " + menor);
        System.out.println("Soma total de todos os número da lista: " + somaTotal);
        somaNumeros.exibirNumeros();
    }
}
