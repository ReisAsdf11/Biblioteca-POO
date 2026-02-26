public class user {
    private String nome;
    private String document;

    public user(String nome){
        this.nome = nome;
    }

    public String getName(){
        return nome;
    }

    public String getDocument(){
        return document;
    }

    public boolean verifyDocument(){
        return true;
    }
}
