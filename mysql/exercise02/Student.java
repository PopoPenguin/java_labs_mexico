package mysql.exercise02;

/*
created by PopoPenguin on 10/30/17
*/


public class Student {

    private int id;
    private String f_name;
    private String l_name;
    private String p_language;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getP_language() {
        return p_language;
    }

    public void setP_language(String p_language) {
        this.p_language = p_language;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", p_language='" + p_language + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
