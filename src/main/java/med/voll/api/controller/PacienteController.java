package med.voll.api.controller;

import med.voll.api.domain.paciente.DadosCadastroPaciente;
import med.voll.api.domain.paciente.DadosListagemPaciente;
import med.voll.api.domain.paciente.Paciente;
import med.voll.api.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository pacienteRepository;
    @PostMapping
    @Transactional
    public ResponseEntity cadastrarPaciente(@RequestBody DadosCadastroPaciente dadosCadastroPaciente){
        pacienteRepository.save(new Paciente(dadosCadastroPaciente));
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemPaciente>> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        var paciente = pacienteRepository.findAll(paginacao).map(DadosListagemPaciente::new);
        return ResponseEntity.ok().body(paciente);
    }
}
