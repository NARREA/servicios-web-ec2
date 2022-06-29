package com.idat.EC2JuanNarreaBodega.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC2JuanNarreaBodega.model.Bodega;


@Repository
public interface BodegaRepository extends JpaRepository<Bodega, Integer>{

}
