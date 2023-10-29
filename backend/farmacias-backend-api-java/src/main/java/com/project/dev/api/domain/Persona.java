/*
 * @fileoverview    {Persona}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementation done.
 * @version 2.0     Documentation added.
 */
package com.project.dev.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code Persona}.
 *
 * @author Dyson Parra
 * @since 11
 */
@Entity
@Table(name = "\"Persona\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Persona implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intIdPersona;
    @Column(length = 70)
    private String strApellidoPersona;
    @Column(length = 200)
    private String strDireccion;
    @Column(length = 20)
    private String strGenero;
    @Column(length = 70)
    private String strNombrePersona;
    @Column(length = 20)
    private String strTelefono;
    @JoinColumn(name = "intIdBarrio", referencedColumnName = "intIdBarrio")
    private Long intIdBarrio;
    @JoinColumn(name = "intIdTipoPersona", referencedColumnName = "intIdTipoPersona")
    private Long intIdTipoPersona;

}
