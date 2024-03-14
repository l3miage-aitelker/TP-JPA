package fr.uga.l3miage.tp1.exo3.models;
import fr.uga.l3miage.tp1.exo3.enums.BrandType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="brand_miage")
public class BrandMiageEntity {
    @Id
    @Column(name="company_name")
    private String company_name;

    @Column(name="siretNumber")
    private String siretNumber;

    @Column(name="type")
    private BrandType type;


    @OneToMany
    private Set<ProductEntity> products;
}
