package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import dto.Usuario;
import util.Conexion;
import util.GenericDAO;

public class UsuarioDAO implements GenericDAO<Usuario> {
	private static final String INSERT_USUARIO_SQL = "INSERT INTO usuario (nombre,apellido,correo,cedula,telefono,contrase�a) VALUES (?,?,?,?,?,?);";
	private static final String DELECT_USUARIO_SQL = "DELETE FROM usuario WHERE  idUsuario=?;";
	private static final String UPDATE_USUARIO_SQL = "UPDATE usuario SET nombre=?, apellido=?, correo=?,  cedula=?, telefono=? ,contrase�a=? WHERE idUsuario=?;";
	private static final String SELECT_USUARIO_BY_ID = "SELECT * from usuario WHERE idUsuario=?;";
	private static final String SELECT_ALL_USUARIOS = "SELECT * FROM usuario";

	@Override
	public void insert(Usuario obj) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement preparedStatement = (PreparedStatement) Conexion.getConexion()
					.prepareStatement(INSERT_USUARIO_SQL);
			preparedStatement.setString(1, obj.getNombre());
			preparedStatement.setString(2, obj.getApellido());
			preparedStatement.setString(3, obj.getCorreo());

			preparedStatement.setString(4, obj.getCedula());
			preparedStatement.setString(5, obj.getTelefono());
			preparedStatement.setString(6, obj.getContrase�a());

			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Usuario obj) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Usuario obj) {
		try {
			PreparedStatement preparedStatement = (PreparedStatement) Conexion.getConexion()
					.prepareStatement(UPDATE_USUARIO_SQL);
			preparedStatement.setString(1, obj.getNombre());
			preparedStatement.setString(2, obj.getApellido());
			preparedStatement.setString(3, obj.getCorreo());

			preparedStatement.setString(4, obj.getCedula());
			preparedStatement.setString(5, obj.getTelefono());
			preparedStatement.setString(6, obj.getContrase�a());
			preparedStatement.setInt(7, obj.getIdUsuario());
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Usuario findById(Integer id) {
		// TODO Auto-generated method stub
		Usuario usuario = null;
		try {
			PreparedStatement preparedStatement = (PreparedStatement) Conexion.getConexion()
					.prepareStatement(SELECT_USUARIO_BY_ID);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				usuario = new Usuario();
				usuario.setNombre(rs.getString("nombre"));
				usuario.setApellido(rs.getString("apellido"));
				usuario.setIdUsuario(id);
				usuario.setTelefono(rs.getString("telefono"));
				usuario.setCorreo(rs.getString("correo"));
				usuario.setCedula(rs.getString("cedula"));
				usuario.setContrase�a(rs.getString("contrase�a"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuario;
	}

	@Override
	public List<Usuario> findAll() {
		List<Usuario> usuarios = new ArrayList<>();
		try {
			PreparedStatement preparedStatement = (PreparedStatement) Conexion.getConexion()
					.prepareStatement(SELECT_ALL_USUARIOS);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setNombre(rs.getString("nombre"));
				usuario.setApellido(rs.getString("apellido"));
				usuario.setTelefono(rs.getString("telefono"));
				usuario.setCorreo(rs.getString("correo"));
				usuario.setCedula(rs.getString("cedula"));
				usuario.setContrase�a(rs.getString("contrase�a"));

				usuarios.add(usuario);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usuarios;
	}

	public static void main(String[] args) {
		System.out.println(new UsuarioDAO().findAll().size());
	}

}
