package tn.esprit.autoloc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "equipement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;

    private String libelle;

    @JsonIgnoreProperties({"equipements", "agence", "reservations"})
    @ManyToMany(
            mappedBy = "equipements",
            fetch = FetchType.LAZY
    )
    private List<Vehicule> vehicules;
}