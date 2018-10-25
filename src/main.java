/*
* >>> Programa didatico que implementa o metodo de ordenacao QuickSort
* Criado por: Thiago Suzuqui Lodi
* Curso: Engenharia de Computacao
* Docente: Marcos Alves
* Disciplina: Analise de Algoritmos
 */

package quicksort;
import java.util.Random;

public class main {

    public static void main(String[] args) {

        int n = LE.readIntPane("Indique o tamanho do vetor: ");      //tamanho do vetor
        int v[] = new int[n];                                             //criando vetor

        Random rand = new Random();
        int m = LE.readIntPane("Indique o valor maximo para\ngerar numeros aleatorios: ");  //le a restricao de valor
        
        for (int i=0; i<n; i++) {                                         //atribuindo valores aleatorios
            v[i] = rand.nextInt(m);                                       //fazendo restricao de 0 - (m-1)
        }

        //aqui temos a concatenacao do vetor de inteiros em um String para facilitar exibicao
        String vetNaoOrdenado = "|";
        for (int i=0; i<n; i++) {
            vetNaoOrdenado = vetNaoOrdenado + vetNaoOrdenado.valueOf(v[i]);
            vetNaoOrdenado = vetNaoOrdenado + "|";
        }

        Sort op = new Sort();
        op.QuickSort(v, 0, n-1);                                    //ordena vetor

        //mesmo processo da linha 26
        String vetOrdenado = "|";
        for (int i=0; i<n; i++) {
            vetOrdenado = vetOrdenado + vetOrdenado.valueOf(v[i]);
            vetOrdenado = vetOrdenado + "|";
        }

        //imprime o vetor antes e depois da ordenacao
        LE.show("Vetor sem ordem:\n"+vetNaoOrdenado+"\n\nVetor ordenado:\n"+vetOrdenado);
    }
    
}
