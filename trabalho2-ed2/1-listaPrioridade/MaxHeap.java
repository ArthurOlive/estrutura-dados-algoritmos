import java.util.List;

public class MaxHeap<T> {
    private int tamanhoHeap;
    private int tam;
    private Bloco<T> [] lista;

    public MaxHeap() {
        //tamanho inicial é 10
        tamanhoHeap = 10;
        this.tam = 0;
        lista = new Bloco[tamanhoHeap];
    }

    public int getTam(){
        return tam;
    }

    public int getTamHeap(){
        return tamanhoHeap;
    }

    public Bloco<T>[] getList() {
        return lista;
    }

    public void replace(int i, int j) {
        Bloco<T> aux = lista[i];
        lista[i] = lista[j];
        lista[j] = aux;
    }

    public void show() {
        for (int i = 0; i < tam; i ++) {
            System.out.print(lista[i].getKey());
        }
        System.out.println();
    }

    public void up(int i) {
        //correção da contagem começando em 0
        int aux = i;
        if (i > 0 && i % 2 == 0) {
            aux--;
        }
        int j = Math.abs(aux / 2);
        if (j >= 0 && tam > 0) {
            if (lista[i].compareTo((Comparable) lista[j].getKey()) < 0){
                replace(i, j);
                up(j);
            }
        }
    }

    public void down(int i, int n) {
        int j = i * 2;
        //correção da contagem a partir do 0
        j -= 1;
        if (j <= (n - 1)){
            if (j < (n - 1)){
                if (lista[j+1].compareTo((Comparable) lista[j].getKey()) < 0){
                    j++;
                }
            }
            if (lista[j].compareTo((Comparable) lista[i - 1].getKey()) < 0){
                replace(i - 1, j);
                //ajuste para cima para reajustar o j--;
                down(j + 1, n);
            }
        }
    }

    public void add(T key) {
        if (tam < tamanhoHeap) {
            Bloco<T> newBloco = new Bloco();
            newBloco.setKey(key);
            lista[tam] = newBloco;
            up(tam);
            tam ++;
        } else {
            overflow();
            Bloco<T> newBloco = new Bloco();
            newBloco.setKey(key);
            lista[tam] = newBloco;
            up(tam);
            tam ++;
        }
    }

    public Bloco<T> remove(){
        Bloco<T> rem = null;
        if (tam != 0) {
            rem = lista[0];
            lista[0] = lista[tam-1];
            lista[tam-1] = null;
            tam--;
            down(1, tam);
        }

        return rem;
    }

    public void overflow() {
        //vai dobrar o tamanho do array
        tamanhoHeap *= 2;
        Bloco<T> [] newLista = new Bloco[tamanhoHeap];

        //copia a lista para o novo array
        for (int i = 0; i < tam; i ++) {
            newLista[i] = lista[i];
        }

        lista = newLista;
    }
}