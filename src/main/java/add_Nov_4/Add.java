package add_Nov_4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Add extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		String no1 = arg0.getParameter("no1");
		int num1=Integer.parseInt(no1);
		
		String no2 = arg0.getParameter("no2");
		int num2=Integer.parseInt(no2);
		
		int add=num1+num2;
		
		PrintWriter wr = arg1.getWriter();
		wr.println("<html><body>"+add+"</body></html>");
	}

}
