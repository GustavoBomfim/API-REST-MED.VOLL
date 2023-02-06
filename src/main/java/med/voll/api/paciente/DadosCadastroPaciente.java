package med.voll.api.paciente;

import jakarta.validation.constraints.NotBlank;
import med.voll.api.endereco.Endereco;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,
        @NotBlank
        int idade,
        @NotBlank
        String alergia) {

}
