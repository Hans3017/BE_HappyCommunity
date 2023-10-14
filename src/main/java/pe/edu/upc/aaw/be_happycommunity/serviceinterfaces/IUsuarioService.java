package pe.edu.upc.aaw.be_happycommunity.serviceinterfaces;

import pe.edu.upc.aaw.be_happycommunity.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    public List<Usuario>list();
    public void delete(Long idUsuario);

    public List<String[]>findVecinosWithoutDebt();

    public List<String[]>findVecinosWithDebt();

}
