public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
    private int horasDeAula;
    
    public int getHorasDeAula(){
        return horasDeAula;
    }
    public void setHorasDeAula(int horasDeAula){
        this.horasDeAula = horasDeAula;
    }
    
    public double getGastos(){
        return this.getSalario() + this.horasDeAula * 10;
    }
    
    public String getInfo(){
        return super.getInfo() + " horas de aula: " + this.horasDeAula;
    }
}
