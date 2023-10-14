package pe.edu.upc.aaw.be_happycommunity.serviceinterfaces;

import pe.edu.upc.aaw.be_happycommunity.entities.RolUsuario;

import java.util.List;

public interface IRolUsuarioService {
    public void insert(RolUsuario rolUsuario);
    public List<RolUsuario> list();
    public void delete(Long idRolUsuario);
}

