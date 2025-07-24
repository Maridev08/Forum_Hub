package hub.forun.api.domain.topicos;

import hub.forun.api.domain.curso.DadosCurso;
import hub.forun.api.domain.repostas.DadosResposta;
import hub.forun.api.domain.usuario.DadosUsuario;

import java.time.LocalDateTime;
import java.util.List;

public class Topico {
    String titulo;
    String mensagem;
    LocalDateTime dataCriacao;
    Status status;
    DadosUsuario autor;
    DadosCurso curso;
    List<DadosResposta> resposta;
}
