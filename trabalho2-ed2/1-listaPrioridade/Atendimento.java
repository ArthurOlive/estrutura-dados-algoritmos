import java.util.ArrayList;
import java.util.List;

public class Atendimento {
    public static void main(String [] args){
        MaxHeap<Condutor> maxHeap = new MaxHeap<Condutor>();

        //condicoes especiais
        List<Condicao> condicoesComDeficiencia = new ArrayList<Condicao>();
        condicoesComDeficiencia.add(new Condicao("Deficiencia", 3, true));

        List<Condicao> condicoesSemDeficiencia = new ArrayList<Condicao>();
        condicoesSemDeficiencia.add(new Condicao("Deficiencia", 3, false));
        
        Condutor c1 = new Condutor("Seu jorge", 55, 'M', "Rua 1", false, false, condicoesSemDeficiencia);
        Condutor c2 = new Condutor("Antonia", 30, 'F', "Rua 1", true, true, condicoesSemDeficiencia);
        Condutor c3 = new Condutor("Maria", 55, 'F', "Rua 1", true, false, condicoesSemDeficiencia);
        Condutor c4 = new Condutor("Geoge", 85, 'M', "Rua 1", false, false, condicoesSemDeficiencia);
        Condutor c5 = new Condutor("Vitor", 19, 'M', "Rua 2", false, false, condicoesComDeficiencia);
        Condutor c6 = new Condutor("Vivian", 85, 'F', "Rua 1", false, true, condicoesSemDeficiencia);
        Condutor c7 = new Condutor("Jose", 95, 'M', "Rua 1", false, false, condicoesSemDeficiencia);
        Condutor c8 = new Condutor("Bruna", 18, 'F', "Rua 1", true, true, condicoesSemDeficiencia);
        Condutor c9 = new Condutor("Felipe", 32, 'M', "Rua 1", false, false, condicoesSemDeficiencia);
        Condutor c10 = new Condutor("Ana", 20, 'F', "Rua 1", true, true, condicoesSemDeficiencia);
        Condutor c11 = new Condutor("Pedro", 63, 'M', "Rua 1", false, false, condicoesSemDeficiencia);
        Condutor c12 = new Condutor("Jorge henrique", 47, 'M', "Rua 1", false, false, condicoesSemDeficiencia);
        Condutor c13 = new Condutor("Cauan", 15, 'M', "Rua 2", false, false, condicoesComDeficiencia);
        Condutor c14 = new Condutor("Leticia", 26, 'F', "Rua 1", false, true, condicoesSemDeficiencia);
        Condutor c15 = new Condutor("Maiara", 21, 'M', "Rua 1", false, false, condicoesSemDeficiencia);
        Condutor c16 = new Condutor("Jerfesson", 18, 'M', "Rua 1", false, false, condicoesSemDeficiencia);
        Condutor c17 = new Condutor("Yago", 42, 'M', "Rua 1", false, false, condicoesSemDeficiencia);
        Condutor c18 = new Condutor("Lais", 19, 'M', "Rua 1", false, false, condicoesSemDeficiencia);
        Condutor c19 = new Condutor("Aurora", 32, 'M', "Rua 1", true, false, condicoesSemDeficiencia);
        Condutor c20 = new Condutor("Beatriz", 22, 'M', "Rua 1", false, true, condicoesSemDeficiencia);

        maxHeap.add(c1);
        maxHeap.add(c2);
        maxHeap.add(c3); 
        maxHeap.add(c4); 
        maxHeap.add(c5); 
        maxHeap.add(c6); 
        maxHeap.add(c7); 
        maxHeap.add(c8);
        maxHeap.add(c9);
        maxHeap.add(c10);
        maxHeap.add(c11); 
        maxHeap.add(c12); 
        maxHeap.add(c13); 
        maxHeap.add(c14); 
        maxHeap.add(c15); 
        maxHeap.add(c16);  
        maxHeap.add(c17); 
        maxHeap.add(c18); 
        maxHeap.add(c19); 
        maxHeap.add(c20);  
        
        /* 
        HEAP LIST
        Bloco<Condutor>[] lista = maxHeap.getList();

        for (int i = 0; i < maxHeap.getTam(); i++) {
            System.out.print(lista[i].getKey().getScore() + " ");
        }
        System.out.println();
        */
        
        System.out.println("Chamada para atendimento: ");
        System.out.println("ordem / nome condutor / prioridade ");
        for(int i = 0; i < 20; i++) {
            try {
                Bloco<Condutor> condutor = maxHeap.remove();
                System.out.println("Chamada " + (i+1) + ": " + condutor.getKey().getNome() + " - " + condutor.getKey().getScore());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Atendimento encerrado");

    }   
}
