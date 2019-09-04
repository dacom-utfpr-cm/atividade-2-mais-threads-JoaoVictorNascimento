/*
    Autor: João Victor Nascimento
    RA: 1817442
    Descrição: Faça um programa multithreaded em Java que ordene um vetor usando o Merge Sort recursivo.
    Faça com que a thread principal dispare duas threads para classificar cada metade do vetor.
 */
package exe5;

public class Main {
    public static void main(String[] args) {
        int[] vetor = {15, 17, 216, 99, 49, 142, 94, 231, 40, 8, 26};
        MergeSort merge = new MergeSort(vetor);
        merge.run();
    }
}
