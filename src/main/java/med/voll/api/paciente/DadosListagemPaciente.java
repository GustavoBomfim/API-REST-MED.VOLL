package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;

public record DadosListagemPaciente(String nome, int idade, String alergia) {
    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getIdade(), paciente.getAlergia());
    }
}
