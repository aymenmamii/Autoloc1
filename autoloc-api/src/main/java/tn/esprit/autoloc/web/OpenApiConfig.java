package tn.esprit.autoloc.web;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "AutoLoc API",
                version = "1.0",
                description = "API REST de gestion de location de véhicules (agences, véhicules, réservations, paiements...)",
                contact = @Contact(name = "Équipe AutoLoc")
        )
)
public class OpenApiConfig {
}