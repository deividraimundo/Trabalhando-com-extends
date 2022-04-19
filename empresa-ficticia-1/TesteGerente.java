
public class TesteGerente {

    public static void main(String[] args) {
        Gerente g = new Gerente();
        
        g.setNome("João da Silva");
        g.setSenha(4321);
        
        g.setSalario(5000);
        System.out.println(g.getBonificacao());
    }
    
}
