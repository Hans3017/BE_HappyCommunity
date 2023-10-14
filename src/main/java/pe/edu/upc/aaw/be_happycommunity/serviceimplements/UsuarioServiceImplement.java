package pe.edu.upc.aaw.be_happycommunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.be_happycommunity.entities.Usuario;
import pe.edu.upc.aaw.be_happycommunity.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.be_happycommunity.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long idUsuario) {
        uR.deleteById(idUsuario);
    }
    @Override
    public List<String[]> findVecinosWithoutDebt() {
        return uR.findVecinosWithoutDebt();
    }

    @Override
    public List<String[]> findVecinosWithDebt() {
        return uR.findVecinosWithDebt();
    }

}
