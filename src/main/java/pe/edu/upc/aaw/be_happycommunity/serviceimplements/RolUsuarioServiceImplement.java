package pe.edu.upc.aaw.be_happycommunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.be_happycommunity.entities.RolUsuario;
import pe.edu.upc.aaw.be_happycommunity.repositories.IRolUsuarioRepository;
import pe.edu.upc.aaw.be_happycommunity.serviceinterfaces.IRolUsuarioService;

import java.util.List;

@Service
public class RolUsuarioServiceImplement implements IRolUsuarioService {
    @Autowired
    private IRolUsuarioRepository ruR;
    @Override
    public void insert(RolUsuario rolUsuario){
        ruR.save(rolUsuario);
    }
    @Override
    public List<RolUsuario> list(){
        return ruR.findAll();
    }

    @Override
    public void delete(Long idRolUsuario) {
        ruR.deleteById(idRolUsuario);
    }

}