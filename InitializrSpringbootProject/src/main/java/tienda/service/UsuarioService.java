
package tienda.service;

import tienda.domain.Usuario;
import java.util.List;

public interface UsuarioService {
    
    // Se obtiene un listado de usuarios en un List
    public List<Usuario> getUsuarios();
    
    // Se obtiene un Usuario, a partir del username de un usuario
    public Usuario getUsuario(Usuario usuario);
    
    // Se obtiene un Usuario, a partir del username de un usuario
    public Usuario getUsuarioPorUsername(String username);
    
    // Se obtiene un Usuario, a partir del username y el password de un usuario
    public Usuario getUsuarioPorUsernameYPassword(String Username, String Password);
    
    // Se obtiene un Usuario, a partir del username y el password de un usuario
    public Usuario getUsuarioPorUsernameOCorreo(String username, String correo);
    
    // Se valida si existe un Usuario considerando el username
    public boolean existeUsuarioPorUsernameOCorreo(String username, String correo);
    
    // Se inserta un nuevo usuario si el id del usuario esta vacio
    // Se actualiza un usuario si el id del usuario NO esta vacio
    public void save(Usuario usuario,boolean crearRolUser);
    
    // Se elimina el usuario que tiene el ide pasadopor parámetro
    public void delete(Usuario usuario);
}
