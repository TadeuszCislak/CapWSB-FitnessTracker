package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

// TODO: Define the Event entity with appropriate fields and annotations
@Entity
@Table
@Getter
@ToString
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private String name;

    @Column(nullable = true)
    private String description;

    @Column(nullable = false)
    private LocalDate startTime;

    @Column(nullable = true)
    private LocalDate endTime;

    @Column(nullable = true)
    private String country;

    @Column(nullable = true)
    private String city;

    public Event(
            final Long id,
            final String name,
            final String description,
            final LocalDate startTime,
            final LocalDate endTime,
            final String country,
            final String city) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.country=country;
        this.city = city;
    }
}
