package registerjava;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/register")
public class registerServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final register register = null;
	private  registerconnection Register1 = new registerconnection();
	 /**
     * @see HttpServlet#HttpServlet()
     */
    public registerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/views/register.jsp");
		dispacher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String UserName = request.getParameter("UserName");
		String password = request.getParameter("password");
		String EMail = request.getParameter("EMail");
		String phoneNumber = request.getParameter("phoneNumber");
		 register Register = new register();
		 Register.setUserName(UserName);
		 Register.setPassword(password);
		 Register.setEMail(EMail);
		 Register.setPhoneNumber(phoneNumber);
		 try {
			registerconnection.Register1(Register);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		 


//		     response.sendRedirect("");
		 
		 RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/views/registerdetails.jsp");
			dispacher.forward(request, response);
		 
		 
		
	}

}



