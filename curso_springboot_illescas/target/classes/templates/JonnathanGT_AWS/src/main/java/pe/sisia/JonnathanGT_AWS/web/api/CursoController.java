package pe.sisia.JonnathanGT_AWS.web.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.sisia.JonnathanGT_AWS.modelo.Curso;
import pe.sisia.JonnathanGT_AWS.repositoryo.CursoRepositoryo;
import pe.sisia.JonnathanGT_AWS.service.S3Service;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    @Autowired
    private CursoRepositoryo cursoRepository;

    @Autowired
    private S3Service s3Service;

    @GetMapping
    List<Curso> getAll(){
        return cursoRepository.findAll()
                .stream()
                .peek(curso -> curso.setImagenUrl(s3Service.getObjectUrl(curso.getImagenPath())))
                .collect(Collectors.toList());
    }

    @PostMapping
    Curso create(@RequestBody Curso curso) {
        //return cursoRepository.save(curso);
        cursoRepository.save(curso);
        curso.setImagenUrl(curso.getImagenPath());
        return curso;
    }

}
