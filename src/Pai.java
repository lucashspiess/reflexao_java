public class Pai extends Pessoa{
    private int qtdFilhos;

    public int getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(int qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
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
