package med.voll.api.domain.paciente;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        int idade,
        @NotBlank
        String alergia) {

}
