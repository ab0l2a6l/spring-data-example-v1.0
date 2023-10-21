package org.abolfazl.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "person")
@Entity(name = "person")
@SequenceGenerator(name = "personSeq", sequenceName = "person_seq", allocationSize = 1)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id@GeneratedValue(generator = "personSeq")
    private long id;
    private String name;
    private String family;

}
