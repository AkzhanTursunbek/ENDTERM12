package entities;

public class Teachers extends Member{
    private int id;
    private String subject;

public Teachers(int id,String first_name,String last_name,String email,String subject){
    super(first_name,last_name,email);
    setId(id);
    setSubject(subject);
}

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
