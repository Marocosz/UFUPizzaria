public class Ingredientes {

    private Object[] qtIngrediente = new Object[2];

    public Ingredientes(String nome,int qtd) {
        qtIngrediente[0] = nome;
        qtIngrediente[1] = qtd;
    }
    
    public String getNome(){
        return (String) qtIngrediente[0];
    }

    public void setNome(String nome){
        this.qtIngrediente[0] = nome;
    }

    public int getQtd(){
        return (Integer) qtIngrediente[1];
    }

    public void setQtd(int qtd){
        this.qtIngrediente[1] = qtd;
    }

    
}


