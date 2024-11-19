package com.mballem.curso.boot.demo_mvc.dao;

import java.util.List;
import com.mballem.curso.boot.demo_mvc.domain.Cargo;
import com.mballem.curso.boot.demo_mvc.util.PaginacaoUtil;

public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);
    
    void delete(Long id);

    Cargo findById(Long id);
    
    List<Cargo> findAll();

    PaginacaoUtil<Cargo> buscarPaginada(int pagina, String direcao);
    // PaginacaoUtil<Cargo> buscarPaginada(int pagina);
}
