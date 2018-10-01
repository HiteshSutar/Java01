import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
class Details extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("t1");
		String add=req.getParameter("t2");
		out.println("hello from the get method" +name +"and you are from " +add);
	}
}