package pe.edu.upc.aaw.be_happycommunity.dtos;

public class RolUsuarioDTO {
    private Long idRolUsuario;
    private String rol;
    private UsuarioDTO usuario;

    public Long getIdRolUsuario() {
        return idRolUsuario;
    }

    public void setIdRolUsuario(Long idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }
}
