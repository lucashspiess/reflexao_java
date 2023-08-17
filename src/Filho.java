public class Filho extends Pessoa{
    private int qtdIrmaos;

    public int getQtdIrmaos() {
        return qtdIrmaos;
    }

    public void setQtdIrmaos(int qtdIrmaos) {
        this.qtdIrmaos = qtdIrmaos;
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
