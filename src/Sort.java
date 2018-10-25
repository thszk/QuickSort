/*
 * >>> Programa didatico que implementa o metodo de ordenacao QuickSort
 * Criado por: Thiago Suzuqui Lodi
 * Curso: Engenharia de Computacao
 * Docente: Marcos Alves
 * Disciplina: Analise de Algoritmos
 */

package quicksort;

public class Sort {
    
    private int sortQuick(int A[], int p, int r) {
        int x = A[p];
        int i = p-1;
        int j = r+1;

        while (true) {
            do {
                j = j-1;
            }while (A[j] > x);
            
            do {
                i = i+1;
            }while(A[i] < x);
            
            if (i < j) {
                int aux;
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }else {
                return j;
            }
        }   
    }
    
    public void QuickSort(int A[], int p, int r) {
        if (p < r) {
            int q = sortQuick(A, p, r);
            QuickSort(A, p, q);
            QuickSort(A, q+1, r);
        }
        
    }
}
