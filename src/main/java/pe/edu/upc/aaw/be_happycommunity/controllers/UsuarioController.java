package pe.edu.upc.aaw.be_happycommunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.be_happycommunity.dtos.UsuarioDTO;
import pe.edu.upc.aaw.be_happycommunity.entities.Usuario;
import pe.edu.upc.aaw.be_happycommunity.serviceinterfaces.IUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') or hasAuthority('INVITADO')")
    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario u=m.map(dto,Usuario.class);
        uS.insert(u);
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') or hasAuthority('INVITADO')")
    @GetMapping
    public List<UsuarioDTO>listar(){
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') or hasAuthority('INVITADO')")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id){
        uS.delete(id);
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') or hasAuthority('INVITADO')")
    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        Usuario u=m.map(dto,Usuario.class);
        uS.insert(u);
    }
    /*
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping("/reporte1")
    public List<Reporte1DTO>visualizarVecinosPagosAlDia(){
        List<String[]>lista=uS.findVecinosWithoutDebt();
        List<Reporte1DTO>listaDTO=new ArrayList<>();
        for(String[] data:lista){
            Reporte1DTO dto=new Reporte1DTO();
            dto.setApellidos(data[0]);
            dto.setNombres(data[1]);
            dto.setEstado(data[2]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping("/reporte3")
    public List<Reporte3DTO>visualizarVecinosConDeuda(){
        List<String[]>lista=uS.findVecinosWithDebt();
        List<Reporte3DTO>listaDTO= new ArrayList<>();
        for(String[] data:lista){
            Reporte3DTO dto=new Reporte3DTO();
            dto.setApellidos(data[0]);
            dto.setNombres(data[1]);
            dto.setEstado(data[2]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }

     */
}
