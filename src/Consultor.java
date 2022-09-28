public class Consultor extends Funcionario{
    private  Double valordahora;
    private Long horastrabalhadas;

    public Consultor(String nome, String cpf, Double valordahora, Long horastrabalhadas) {
        super(nome, cpf);
        this.valordahora = valordahora;
        this.horastrabalhadas = horastrabalhadas;
    }

    public Double getValordahora() {
        return valordahora;
    }

    public void setValordahora(Double valordahora) {
        this.valordahora = valordahora;
    }

    public Long getHorastrabalhadas() {
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(Long horastrabalhadas) {
        this.horastrabalhadas = horastrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return this.valordahora*this.horastrabalhadas;
    }
}
