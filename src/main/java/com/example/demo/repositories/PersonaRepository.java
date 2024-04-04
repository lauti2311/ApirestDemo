package com.example.demo.repositories;

import com.example.demo.entities.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {

    // Anotacion Metodo de Query
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    boolean existsByDni(int dni);

    // Anotacion JPQL parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'")
    List<Persona> search(String filtro);

    // Anotacion JPQL parametros nombrados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'")
    List<Persona> search2(@Param("filtro") String filtro);

    // Anotacion con query nativo
    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE '%?1%' OR persona.apellido LIKE '%?1%'",
            nativeQuery = true
    )
    List<Persona> search1(String filtro);
}
