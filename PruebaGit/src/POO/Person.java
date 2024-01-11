package POO;

public class Person {

    private int id;
    private String name;
    private byte edad;
    private String direccion;
    private long documentoDni;



    public Person(int id, String name, byte edad, long documentoDni, String direccion){
        this.id=id;
        this.name=name;
        this.edad= edad;
        this.documentoDni=documentoDni;
        this.direccion=direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public byte getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getDocumentoDni() {
        return documentoDni;
    }
}
