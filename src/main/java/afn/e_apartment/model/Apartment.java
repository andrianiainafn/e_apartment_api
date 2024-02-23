package afn.e_apartment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
@Builder
@Entity
public class Apartment {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String numApp;
    private String design;
    private int rent;

}
