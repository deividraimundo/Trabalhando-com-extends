public class EmpregadoDaFaculdade {
    private String nome;
    private double salario;
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getGastos(){
        return this.salario;
    }
    
    public String getInfo(){
        return "nome: " + this.nome + " com salário " + this.salario;
    }
}
