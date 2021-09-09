package com.dio.sistemaponto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BancoHorasId implements Serializable {
        private Long idBancoHoras;
        private Long idMovimento;
        private Long idUsuario;
    }

    @EmbeddedId
    private BancoHorasId id;
    //private String usuario; <- Desnecessário
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHorasTrabalhadas;
    private BigDecimal saldoHorasTrabalhadas;
}
