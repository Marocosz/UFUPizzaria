public class Equipamento {

    public String nome;
    public boolean Status;
    public int Capacidade = 6;
    public int CapacidadeDisponivel;

    public Equipamento(String nome) {
        this.nome = nome;

    }
    
    public void ligar() {
        this.Status = true;
        System.out.println(this.nome + " Está ligado");
    }

    public void desligar() {
        this.Status = false;
        System.out.println(this.nome + " Está desligado");
    }

}
