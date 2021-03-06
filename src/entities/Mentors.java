package entities;

public class Mentors extends Member{
    private int id;

    public Mentors(String first_name){
        super(first_name);
    }

    public Mentors(int id,String first_name,String last_name,String email){

    super(first_name,last_name,email);
    setId(id);
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
