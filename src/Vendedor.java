public class Vendedor extends Funcionario{
    private  Double comissao;
    private int numeroVendas;

    public Vendedor(String nome, String cpf, Double comissao, int numeroVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
    }

    public Vendedor(Double comissao, int numeroVendas) {
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
    }

    @Override
    public double calcularSalario() {
        return super.getSALARIO_MINIMO() + (this.numeroVendas*this.comissao);
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public int getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }
}
