public class Equipamento {

    public String nome;
    public boolean Status;
    public int capacidade = 6;
    public int capacidadeDisponivel;

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

    public int getCapacidadeDisponivel() {
        return capacidadeDisponivel;
    }

    public void setCapacidadeDisponivel(int n) {

        
    }

}
