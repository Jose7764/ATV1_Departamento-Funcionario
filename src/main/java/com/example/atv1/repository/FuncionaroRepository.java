package com.example.atv1.repository;

import com.example.atv1.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionaroRepository extends JpaRepository<Funcionario, Long> {
}
