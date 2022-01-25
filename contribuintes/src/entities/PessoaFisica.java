package entities;

public class PessoaFisica extends Geral{
    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double imposto() {
        Double imp = 0.0;
        if(super.getRendaAnual() < 20000) {
            imp = super.getRendaAnual() * 0.2;
        }
        else {
            imp = super.getRendaAnual() * 0.25;
        }
        if (gastosSaude > 0) {
            imp -= gastosSaude / 2;
        }
        return imp;
    }
}
