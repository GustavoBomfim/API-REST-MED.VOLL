package med.voll.api.domain.consulta;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamentoConsulta motivoCancelamentoConsulta
) {
}
