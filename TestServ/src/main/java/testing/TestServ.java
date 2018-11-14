package testing;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TestServ extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>I guess this works.</h1>");
        out.println("</body>");
        out.println("</html>");
    }
} 
