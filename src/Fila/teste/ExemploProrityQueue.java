package Fila.teste;

import Fila.FilaComPrioridade;
import Fila.Paciente;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploProrityQueue {
    public static void main(String[] args) {
        FilaComPrioridade<Integer> filaComPrioridade = new FilaComPrioridade<Integer>();

        filaComPrioridade.addFila(1);
        filaComPrioridade.addFila(45);
        filaComPrioridade.addFila(99);
        filaComPrioridade.addFila(69);

        System.out.println(filaComPrioridade);

        System.out.println("\n\n------------------------");



        Queue<Integer> queuePriority = new PriorityQueue<>(

        );
        queuePriority.add(1);
        queuePriority.add(6);
        queuePriority.add(2);
        queuePriority.add(9);
        queuePriority.add(0);

        System.out.println(queuePriority);


        Queue<Paciente> pacienteQueue = new PriorityQueue<>(new Comparator<Paciente>() {
            @Override
            public int compare(Paciente o1, Paciente o2) {
                if (o1.getPrioridade() > o2.getPrioridade()) {
                    return 1;
                } else if (o1.getPrioridade() < o2.getPrioridade()) {
                    return -1;
                }
                return 0;
            }
        });
        pacienteQueue.add(new Paciente("Fulano",2));
        pacienteQueue.add(new Paciente("Thainã", 3));
        pacienteQueue.add(new Paciente("Aline", 1));
        System.out.println(pacienteQueue);
    }
}
