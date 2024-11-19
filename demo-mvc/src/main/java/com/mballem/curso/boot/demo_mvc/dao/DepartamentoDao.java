package com.mballem.curso.boot.demo_mvc.dao;

import java.util.List;
import com.mballem.curso.boot.demo_mvc.domain.Departamento;
// import com.mballem.curso.boot.demo_mvc.util.PaginacaoUtil;

public interface DepartamentoDao {
    
    void save(Departamento departamento);
    void update(Departamento departamento);

    void delete(Long id);

    Departamento findById(Long id);

    List<Departamento> findAll();

    // PaginacaoUtil<Departamento> buscaPaginada( String direcao, int pagina);
}
