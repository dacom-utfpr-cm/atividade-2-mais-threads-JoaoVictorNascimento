package exe2;

import java.util.ArrayList;

public class TestOperationGroup implements Runnable {
    private ThreadGroup group;

    public TestOperationGroup(ThreadGroup group){
        this.group = group;
    }

    @Override
    public void run(){
        System.out.println("Operations Group:");
        System.out.println("activeCount(): " + group.activeCount());
        System.out.println("activeGroupCount(): " + group.activeGroupCount());
        System.out.println("getMaxPriority(): " + group.getMaxPriority());
        System.out.println("isDaemon(): " + group.isDaemon());
        System.out.println("setMaxPriority(int priority)");
        group.setMaxPriority(8);
        System.out.println("Mudando prioridade máxima do grupo para 8");
        System.out.println("interrupt():");
        group.interrupt();
        System.out.println("Grupo " + group.getName() + "interrompido");
        System.out.println("destroy():");
        System.out.println("Iniciando destruição do Grupo: " + group.getName() );
        group.destroy();
        System.out.println("Grupo destruído");
    }
}
