package com.mballem.curso.boot.demo_mvc.dao;

// import java.util.List;

import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.demo_mvc.domain.Departamento;
// import com.mballem.curso.boot.demo_mvc.util.PaginacaoUtil;

@Repository
public class DepartamentoDaoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao {

    // public PaginacaoUtil<Departamento> buscaPaginada(String direcao, int pagina) {

    //     int tamanho = 5;
    //     int inicio = (pagina - 1) * tamanho;
    //     List<Departamento> departamentos = getEntityManager()
    //             .createQuery("select d from Departamento d order by d.nome " + direcao, Departamento.class)
    //             .setFirstResult(inicio)
    //             .setMaxResults(tamanho)
    //             .getResultList();

    //     long totalRegistros = count();
    //     long totalDePaginas = (totalRegistros + (tamanho - 1)) / tamanho;

    //     return new PaginacaoUtil<>(tamanho, direcao, departamentos, totalDePaginas);
    // }
    // public long count() {
    //     return getEntityManager()
    //             .createQuery("select count(*) from Departamento", Long.class)
    //             .getSingleResult();
    // }
}
