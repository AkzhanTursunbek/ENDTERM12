package entities;


public class Students extends Member{
    private int ID;
    private int age;
    private int score;
    private int group_id;

public Students(int ID,String first_name,String last_name,int age,int score,String email,int group_id){
    super(first_name,last_name,email);
    setID(ID);
    setAge(age);
    setScore(score);
    setGroupID(group_id);
}

    public Students(Students students) {
        super(students);
    }

    public int getGroupID() {
        return group_id;
    }

    public void setGroupID(int group_id) {
        this.group_id = group_id;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }





}
