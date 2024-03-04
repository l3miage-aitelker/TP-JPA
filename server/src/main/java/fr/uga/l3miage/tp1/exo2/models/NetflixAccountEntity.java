package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.math.BigInteger;
@Entity
@Table(name="table2")
public class NetflixAccountEntity {
    @Id
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "nb_devices")
    private Integer nb_devices;
    @Column(name = "typeAccount")
    private String typeAccount;
    @Column(name = "uuid_user")
    private String uuid_user;

    @OneToOne
    private NetflixUserEntity user;
}
