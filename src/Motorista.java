public class Motorista extends Funcionario {

    private int totalDeViagens;
    private float comissaoPorViagem;

    public Motorista() {
        super();
    }
    public float calcularSalario() {
        return super.getSalario() + (this.comissaoPorViagem * totalDeViagens);
    }

    public int getTotalDeViagens() {
        return totalDeViagens;
    }

    public void setTotalDeViagens(int totalDeViagens) {
        this.totalDeViagens = totalDeViagens;
    }

    public float getComissaoPorViagem() {
        return comissaoPorViagem;
    }

    public void setComissaoPorViagem(float comissaoPorViagem) {
        this.comissaoPorViagem = comissaoPorViagem;
    }
}
