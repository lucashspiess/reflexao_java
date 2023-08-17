public class Avo extends Pessoa {
    private int qtdNetos;

    public int getQtdNetos() {
        return qtdNetos;
    }

    public void setQtdNetos(int qtdNetos) {
        this.qtdNetos = qtdNetos;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public String getTipoVoz() {
        return tipoVoz;
    }
}
