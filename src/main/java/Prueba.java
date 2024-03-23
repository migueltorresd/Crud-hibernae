    import javax.persistence.*;
    @Entity
    @Table(name = "usuario")
public class Prueba {

    @Id
    @Column(name ="userid")
    private int userID;
        @Column(name ="username")
    private String userName;
        @Column(name ="userpassword")
    private String userPassword;

    public Prueba() {
    }

    public Prueba(String userName, String userPassword) {
        super();
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "Prub [userID=" + userID + ", userName=" + userName + ", userPassword=" + userPassword + "]";
    }
}
