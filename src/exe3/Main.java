/*
    Autor: João Victor Nascimento
    RA: 1817442
    Descrição: Faça um programa em Java para testar um conjunto de operações sobre um grupo de threads. Use o ThreadGroup.
 */
package exe3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i < 5; i++){
            Thread t;
            if(i == 4){
                t = new Thread(new CousinThread(i*20000,100000), Integer.toString(i));
            }
            else {
                t = new Thread(new CousinThread(i * 20000, ((i + 1) * 20000) - 1), Integer.toString(i));
            }
            t.start();
            t.join();
        }
    }
}
