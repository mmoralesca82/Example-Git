package POO;

public class User extends Person{

    private String nickname;

    public User (int id, String name, byte edad, long documentoDni, String direccion, String nickname){
        super(id, name, edad, documentoDni,direccion);
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }
}
