package com.evaparcial.n2.eva.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, length = 13, nullable = false)
    private String run;

    @Column (nullable = false)
    private String nombre;

    @Column (nullable = false)
    private String apellido;

    @Column (nullable = true)
    private String fechaNacimiento;

    @Column (nullable = false)
    private String correo;

    


    


}
