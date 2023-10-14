package pe.edu.upc.aaw.be_happycommunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.be_happycommunity.entities.RolUsuario;

@Repository
public interface IRolUsuarioRepository extends JpaRepository<RolUsuario,Long> {

}
