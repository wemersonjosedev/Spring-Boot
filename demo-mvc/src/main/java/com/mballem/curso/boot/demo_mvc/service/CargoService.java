package com.mballem.curso.boot.demo_mvc.service;

import java.util.List;

import com.mballem.curso.boot.demo_mvc.domain.Cargo;
import com.mballem.curso.boot.demo_mvc.util.PaginacaoUtil;

public interface CargoService {
    
    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void excluir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();

    boolean cargoTemFuncionarios(Long id);

    PaginacaoUtil<Cargo> buscarPorPagina(int pagina, String direcao);
    // PaginacaoUtil<Cargo> buscarPorPagina(int pagina);
}
