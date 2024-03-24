/**
 * La clase Prueba representa un objeto de usuario en la base de datos.
 * Esta clase utiliza anotaciones de JPA para mapear la clase a una tabla de base de datos.
 */
import javax.persistence.*;

@Entity // Indica que esta clase es una entidad JPA
@Table(name = "usuario") // Especifica el nombre de la tabla en la base de datos
public class Prueba {

    @Id // Indica que este campo es la clave primaria de la tabla
    @Column(name ="userid") // Especifica el nombre de la columna en la base de datos
    private int userID; // Identificador único del usuario

    @Column(name ="username") // Especifica el nombre de la columna en la base de datos
    private String userName; // Nombre de usuario

    @Column(name ="userpassword") // Especifica el nombre de la columna en la base de datos
    private String userPassword; // Contraseña del usuario

    /**
     * Constructor por defecto de la clase Prueba.
     */
    public Prueba() {
    }

    /**
     * Constructor parametrizado de la clase Prueba.
     * @param userName El nombre de usuario.
     * @param userPassword La contraseña del usuario.
     */
    public Prueba(String userName, String userPassword) {
        super();
        this.userName = userName;
        this.userPassword = userPassword;
    }

    // Métodos getters y setters para acceder y modificar los atributos privados

    /**
     * Obtiene el ID del usuario.
     * @return El ID del usuario.
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Establece el ID del usuario.
     * @param userID El ID del usuario.
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * Obtiene el nombre de usuario.
     * @return El nombre de usuario.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Establece el nombre de usuario.
     * @param userName El nombre de usuario.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Obtiene la contraseña del usuario.
     * @return La contraseña del usuario.
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Establece la contraseña del usuario.
     * @param userPassword La contraseña del usuario.
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación de cadena de la clase Prueba.
     * @return Una representación de cadena de la clase Prueba.
     */
    @Override
    public String toString() {
        return "Prueba [userID=" + userID + ", userName=" + userName + ", userPassword=" + userPassword + "]";
    }
}
