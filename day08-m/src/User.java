
import java.util.ArrayList;
public class User {
    private String name;
    private String psw;

    public User(String name, String psw) {
        this.name = name;
        this.psw = psw;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
    public void print(){
        System.out.println(name+"-"+psw);
    }

}
