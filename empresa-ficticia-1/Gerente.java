
public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    public int getSenha(){
        return this.senha;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    public int getNumeroDeFuncionariosGerenciados(){
        return this.numeroDeFuncionariosGerenciados;
    }
    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados){
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    @Override
    public double getBonificacao(){
        return this.getSalario() * 0.15;
        //return super.getBonificacao() + 1000;
    }
}
