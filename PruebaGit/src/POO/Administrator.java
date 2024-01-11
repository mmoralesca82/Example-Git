package POO;

public class Administrator extends Person {

    private String rol;

    public Administrator(int id, String name, byte edad, long documentoDni, String direccion, String rol){
        super(id, name, edad, documentoDni,direccion);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }
}


