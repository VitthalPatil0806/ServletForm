package in.bitcode;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class actionServlet
 */
public class actionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public actionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		String dat  = request.getParameter("dates");
		String gen =  request.getParameter("gender");
		String ch = request.getParameter("choice");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");	
		out.println("<h1>Welcome to Servlet:</h1>");
		out.println(name);
		out.println(pass);
		out.println(dat);
		out.println(gen);
		out.println(ch);
		out.println("</body></html>");
		
		out.close();
	}

}