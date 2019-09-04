/*
    Autor: João Victor Nascimento
    RA: 1817442
    Descrição: Faça um programa em Java que consulte periodicamente o estado de um conjunto de threads.
 */
package exe1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<Thread> threads = new ArrayList();
        int tamanho =  5;
        for(int i = 0; i < tamanho; i++){
            int finalI = i;
            Thread t = new Thread(()->{
                try{
                    System.out.println("Thread " + Integer.toString(finalI) + "Iniciada...");
                    while (true){
                        Thread.sleep(3000);
                    }
                } catch (InterruptedException exception){
                    System.out.println("Thread " + Integer.toString(finalI) + " Interrompida.");
                    exception.printStackTrace();
                }
            }, Integer.toString(i));
            t.start();
            threads.add(t);
        }

        VerifyStateThread verify = new VerifyStateThread(threads);
        Thread threadVerify = new Thread(verify);
        threadVerify.start();

        for(Thread t: threads){
            t.sleep(3000);
            t.interrupt();
        }
    }

}
