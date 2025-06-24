package com.github.pdiazzdev.libaryApi;

import com.github.pdiazzdev.libaryApi.model.Autor;
import com.github.pdiazzdev.libaryApi.repositorys.AutorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var context = SpringApplication.run(Application.class, args);
		AutorRepository repository = context.getBean(AutorRepository.class);

		exemploSalvarRegistro(repository);
	}
	public static void exemploSalvarRegistro(AutorRepository autorRepository){
		Autor autor = new Autor();
		autor.setNome("José");
		autor.setNacionalidade("Brasileiros");
		autor.setDataNascimento(LocalDate.of(1950, 1, 31));

		var autorSalvo = autorRepository.save(autor);
		System.out.println("Autor Salvo" + autorSalvo);
	}
}
