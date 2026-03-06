public class User {
    private String name;
    private String nameId;

    public User(String name, String nameId){
        this.name = name;
        this.nameId = nameId;
    }
    public String getName(){
        return name;
    }
    public String getNameId(){
        return nameId;
    }
}

