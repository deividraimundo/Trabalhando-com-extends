
public class Gerente extends Funcionario {
    private String cpf;
    private String rg;
    private Endereco endereco;
    
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getRg(){
        return this.rg;
    }
    public void setRg(int rg){
        this.cpf = cpf;
    }
    
    public String getEndereco(){
        return "Rua: " + endereco.getRua() + "\nNúmero: " + endereco.getNumero().toString() + "\nBairro: " + endereco.getBairro() + "\nCEP: " + endereco.getCep() + "\nCidade: " + endereco.getCidade() + "\nEstado: " + endereco.getEstado();
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    @Override
    public Cliente maiorVendaPorCliente(Cliente cliente){
        return cliente;
    }
}
