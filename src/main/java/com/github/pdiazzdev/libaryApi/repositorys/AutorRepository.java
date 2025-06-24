package com.github.pdiazzdev.libaryApi.repositorys;

import com.github.pdiazzdev.libaryApi.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AutorRepository extends JpaRepository<Autor, UUID> {
}
