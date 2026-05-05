package com.MASB.agenciapublicidad;

import com.MASB.agenciapublicidad.model.Campana;
import com.MASB.agenciapublicidad.model.Cliente;
import com.MASB.agenciapublicidad.repository.CampanaRepository;
import com.MASB.agenciapublicidad.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.time.LocalDate;

@SpringBootApplication
public class AgenciapublicidadApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgenciapublicidadApplication.class, args);
    }

    @Bean
    public CommandLineRunner cargarDatos(ClienteRepository clienteRepo, 
                                          CampanaRepository campanaRepo) {
        return args -> {

            // Solo carga datos si la tabla está vacía
            if (clienteRepo.count() == 0) {
                clienteRepo.save(new Cliente("Coca-Cola España", "Alimentación", "A12345678", "contacto@cocacola.es"));
                clienteRepo.save(new Cliente("Zara Group", "Moda", "B87654321", "info@zara.com"));
                clienteRepo.save(new Cliente("Banco Santander", "Finanzas", "C11223344", "prensa@santander.es"));
                clienteRepo.save(new Cliente("Telefónica", "Telecomunicaciones", "D55667788", "media@telefonica.com"));
                clienteRepo.save(new Cliente("El Corte Inglés", "Retail", "E99001122", "publicidad@elcorteingles.es"));
                clienteRepo.save(new Cliente("SEAT", "Automoción", "F33445566", "marketing@seat.es"));
                clienteRepo.save(new Cliente("Mercadona", "Alimentación", "G77889900", "info@mercadona.es"));
                clienteRepo.save(new Cliente("Iberdrola", "Energía", "H12398765", "prensa@iberdrola.es"));
                clienteRepo.save(new Cliente("Repsol", "Energía", "I98712345", "comunicacion@repsol.com"));
                clienteRepo.save(new Cliente("BBVA", "Finanzas", "J45678901", "marketing@bbva.es"));
            }

            if (campanaRepo.count() == 0) {
                campanaRepo.save(new Campana("Verano Fresco", 50000.0, LocalDate.of(2024, 6, 1), "TV"));
                campanaRepo.save(new Campana("Black Friday", 75000.0, LocalDate.of(2024, 11, 1), "Redes"));
                campanaRepo.save(new Campana("Navidad Mágica", 120000.0, LocalDate.of(2024, 12, 1), "TV"));
                campanaRepo.save(new Campana("Vuelta al Cole", 30000.0, LocalDate.of(2024, 9, 1), "Prensa"));
                campanaRepo.save(new Campana("San Valentín", 25000.0, LocalDate.of(2025, 2, 1), "Redes"));
                campanaRepo.save(new Campana("Lanzamiento Modelo X", 90000.0, LocalDate.of(2024, 3, 15), "TV"));
                campanaRepo.save(new Campana("Campaña Verde", 40000.0, LocalDate.of(2024, 4, 22), "Prensa"));
                campanaRepo.save(new Campana("Summer Vibes", 60000.0, LocalDate.of(2024, 7, 1), "Redes"));
                campanaRepo.save(new Campana("Rebajas Enero", 35000.0, LocalDate.of(2025, 1, 7), "Prensa"));
                campanaRepo.save(new Campana("Día de la Madre", 45000.0, LocalDate.of(2025, 5, 1), "Redes"));
            }
        };
    }
}