package add_Nov_4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Input extends GenericServlet{

	@Override
	public void service(ServletRequest reqarg0, ServletResponse resarg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter wr = resarg1.getWriter();
		wr.print("<html>\r\n" + 
				"<body>\r\n" + 
				"<h1>Hello Welcome to Servlet world to hit!</h1>\r\n" + 
				"\r\n" + 
				"    <form action=\"./hello\">\r\n" + 
				"        first value<input name=\"no1\" type=\"text\" >\r\n" + 
				"        <br>\r\n" + 
				"        secent value<input name=\"no2\" type=\"text\" >\r\n" + 
				"        <br>\r\n" + 
				"        \r\n" + 
				"        <input type=\"submit\" value=\"click me!\">\r\n" + 
				"    </form>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"");
	}

}
