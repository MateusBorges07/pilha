public class TestaContaComExecacaoChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.deposita();
        try {
            c.deposita();
        }catch (MinhaExcacao ex){
            System.out.println("tratamento .....");
        }
    }
}
