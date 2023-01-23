package com.joseillescas_fullstack.app.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "usuarios")
public class Usuario {


	@Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre", length = 100)
    private String nombre;


    @Column(name = "clave", length = 100, nullable = false, unique = true)
    private String clave;

    @Column(name = "correo", length = 200, nullable = false, unique = true)
    private String email;

    @Column(name = "estado")
    private String estado;

    @NonNull
    private String titulo;
    private String imagenPath;
    private String cedula;

    @Transient
    private String imagenUrl;

    @Transient
    private String cedulaUrl;
}
