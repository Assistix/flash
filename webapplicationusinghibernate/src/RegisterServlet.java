

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daopack.userDao;
import beans.Employee;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String salary1=request.getParameter("salary");
		String age1=request.getParameter("age");
		int salary=Integer.parseInt(salary1);
		int age=Integer.parseInt(age1);
		
		
		Employee emp=new Employee();
		emp.setEmployeeName(name);
		emp.setEmployeeSalary(salary);
		emp.setEmployeeAge(age);
		System.out.println("details entered into the object");
		
		int i=userDao.register(emp);
		if(i>0){
			System.out.println("Successfully registered the employee");
		}
		else{
			System.out.println("Failed to register");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
