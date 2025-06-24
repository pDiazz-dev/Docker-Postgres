package com.github.pdiazzdev.libaryApi.repositorys;

import com.github.pdiazzdev.libaryApi.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroReposity extends JpaRepository<Livro, UUID> {
}
