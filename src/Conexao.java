public class Conexao implements AutoCloseable{

    public Conexao() {
        System.out.println("Abrindo conexao");
        //throw IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    public void close()throws Exception {
        System.out.println("Fechando conexao");
    }
}
