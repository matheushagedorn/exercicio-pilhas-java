class PilhaEstatica {
    private static final int TAMANHO_MAXIMO = 20;
    private Aluno[] pilha;
    private int topo;

    public PilhaEstatica() {
        pilha = new Aluno[TAMANHO_MAXIMO];
        topo = -1;
    }

    public void init() {
        topo = -1;
    }

    public void destroy() {
        topo = -1;
        pilha = null;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == TAMANHO_MAXIMO - 1;
    }

    public void push(Aluno aluno) {
        if (!isFull()) {
            pilha[++topo] = aluno;
        } else {
            System.out.println("Erro: Pilha cheia!");
        }
    }

    public Aluno pop() {
        if (!isEmpty()) {
            return pilha[topo--];
        } else {
            System.out.println("Erro: Pilha vazia!");
            return null;
        }
    }

    public Aluno topo() {
        if (!isEmpty()) {
            return pilha[topo];
        } else {
            System.out.println("Erro: Pilha vazia!");
            return null;
        }
    }
}