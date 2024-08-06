package br.com.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projeto.domain.Preco;

public interface PrecosRepository extends JpaRepository<Preco, Integer> {

}