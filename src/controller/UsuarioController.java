package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.UsuarioDAO;
import dto.Usuario;

/**
 * Servlet implementation class UsuarioController
 */
@WebServlet("/UsuarioController")
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private UsuarioDAO usuarioDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioController() {
    	  super();
    	usuarioDAO=new UsuarioDAO();
   
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.actionDefault(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String action=request.getParameter("accion");
		switch (action) {
		case "insertar": 
			this.insertarUsuario(request, response);
		case "iniciar": 
			this.iniciaSesion(request, response);			
		default:
		this.actionDefault(request, response);
		}
		
		{
			this.actionDefault(request, response);
			
			
		}
	}

	
	protected void insertarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String correo=request.getParameter("correo");
		String cedula=request.getParameter("cedula");
		String telefono=request.getParameter("telefono");
		String contraseña=request.getParameter("contraseña");
		
		usuarioDAO.insert(new Usuario(nombre,apellido,correo,cedula,telefono,contraseña));;
		
		
		
//		
//		this.actionDefault(request, response);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

	protected void actionDefault(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("index.jsp").forward(request,response);
		
	
		
		
		
		
		
		
	}
	
	
	protected void iniciaSesion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		
		
		
		
		
		
	}
	
}
