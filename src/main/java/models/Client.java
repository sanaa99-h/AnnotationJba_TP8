package models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@Entity(name ="unit_clients" )
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
   /* public Client(long id) {
        this.id=id;

    }*/


    private String nom;
    public Client(String nom) {

        this.nom=nom;
    }
    public Client() {
    }



    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", nom='" + nom + '\'' + '}';
    }
}
