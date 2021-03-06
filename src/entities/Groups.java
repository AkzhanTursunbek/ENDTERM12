package entities;

public class Groups {
    private int id;
    private String name;
    private String level;
    private int mentor_id;

 public Groups(int id, String name, String level, int mentor_id){
    setId(id);
    setName(name);
    setLevel(level);
    setMentor_id(mentor_id);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getMentor_id() {
        return mentor_id;
    }

    public void setMentor_id(int mentor_id) {
        this.mentor_id = mentor_id;
    }
}
