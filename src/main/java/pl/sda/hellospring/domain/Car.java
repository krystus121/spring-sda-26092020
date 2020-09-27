package pl.sda.hellospring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "CARS")
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "MODEL")
    private String model;

  //  @Transient // nie twórz kolumny dla pola
    @Column(name = "colour")
    private String color;

}
