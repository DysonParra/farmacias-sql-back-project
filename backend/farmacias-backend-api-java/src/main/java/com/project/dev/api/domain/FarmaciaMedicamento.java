/*
 * @fileoverview    {FarmaciaMedicamento}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
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
 * TODO: Definición de {@code FarmaciaMedicamento}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Entity
@Table(name = "\"FarmaciaMedicamento\"")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class FarmaciaMedicamento implements Serializable {

    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Long intId;
    @JoinColumn(name = "intIdFarmacia", referencedColumnName = "intCodigoFarmacia")
    private Long intIdFarmacia;
    @JoinColumn(name = "intIdMedicamento", referencedColumnName = "intId")
    private Long intIdMedicamento;

}
