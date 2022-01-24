package entities;

public class PessoaJurídica extends Geral{
    private Integer numeroFuncinarios;

    public PessoaJurídica() {
        super();
    }

    public PessoaJurídica(String nome, Double rendaAnual, Integer numeroFuncinarios) {
        super(nome, rendaAnual);
        this.numeroFuncinarios = numeroFuncinarios;
    }

    public Integer getNumeroFuncinarios() {
        return numeroFuncinarios;
    }

    public void setNumeroFuncinarios(Integer numeroFuncinarios) {
        this.numeroFuncinarios = numeroFuncinarios;
    }

    @Override
    public Double imposto() {
        Double imp = 0.0;
        if(numeroFuncinarios < 10) {
            imp = super.getRendaAnual() * 0.16;
        }
        else {
            imp = super.getRendaAnual() * 0.14;
        }
        return imp;
    }
}
