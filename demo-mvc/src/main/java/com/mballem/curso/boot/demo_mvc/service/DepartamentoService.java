package com.mballem.curso.boot.demo_mvc.service;

import java.util.List;

import com.mballem.curso.boot.demo_mvc.domain.Departamento;
// import com.mballem.curso.boot.demo_mvc.util.PaginacaoUtil;

public interface DepartamentoService {
    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void excluir(Long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscarTodos();

    boolean departamentoTemCargos(Long id);

    // PaginacaoUtil<Departamento> buscarPorPagina(String direcao, int pagina);
}
