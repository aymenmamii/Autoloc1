package tn.esprit.autoloc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "reservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private String statut;

    @JsonIgnoreProperties({"reservations", "agence", "equipements"})
    @ManyToOne
    private Vehicule vehicule;

    @JsonIgnoreProperties("reservations")
    @ManyToOne
    private Client client;

    @JsonIgnoreProperties("reservation")
    @OneToOne
    private Contrat contrat;
}