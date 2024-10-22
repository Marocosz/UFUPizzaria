public class Equipamento {

    public String nome;
    public boolean Status;
    public int Capacidade;
    public int CapacidadeDisponivel;

    public Equipamento(String nome) {
        this.nome = nome;

    }
    
    public void ligar() {
        this.Status = true;
        System.out.println(this.nome + " Está ligado");
    }

}
