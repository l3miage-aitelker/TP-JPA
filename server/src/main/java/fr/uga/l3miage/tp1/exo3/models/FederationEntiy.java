package fr.uga.l3miage.tp1.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity

public class FederationEntiy {

    @Id
    private String name;

    private boolean isFageMembership;

    @OneToMany
    private Set<AssociationEntity> associations;
}
