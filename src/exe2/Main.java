/*
    Autor: João Victor Nascimento
    RA: 1817442
    Descrição: Faça um programa em Java para testar um conjunto de operações sobre um grupo de threads. Use o ThreadGroup.
 */
package exe2;

public class Main {
    public static void main(String[] args){
        ThreadGroup group = new ThreadGroup("group1");
        int tamanho =  5;
        for(int i = 0; i < tamanho; i++){
            Thread t = new Thread(group, new ThreadSleep(), "Thread " + Integer.toString(i));
            t.start();
        }

        TestOperationGroup test = new TestOperationGroup (group);
        test.run();
    }
}
