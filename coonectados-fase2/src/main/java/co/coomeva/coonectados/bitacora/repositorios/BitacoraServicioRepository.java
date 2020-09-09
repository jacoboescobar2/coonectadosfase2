package co.coomeva.coonectados.bitacora.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import co.coomeva.coonectados.bitacora.modelos.BitacoraServicio;


public interface BitacoraServicioRepository extends JpaRepository<BitacoraServicio, Long>

{

}
