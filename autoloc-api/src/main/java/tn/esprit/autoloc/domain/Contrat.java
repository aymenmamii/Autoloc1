package tn.esprit.autoloc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "contrat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private boolean valide;

    @JsonIgnoreProperties("contrat")
    @OneToMany(
            mappedBy = "contrat",
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL
    )
    private List<Paiement> paiements;

    @JsonIgnoreProperties({"contrat", "vehicule", "client"})
    @OneToOne(mappedBy = "contrat")
    private Reservation reservation;
}