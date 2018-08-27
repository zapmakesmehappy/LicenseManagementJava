package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ManagementDao;

/**
 * Servlet implementation class ManagementRegisterResultServlet
 */
@WebServlet("/ManagementRegisterResultServlet")
public class ManagementRegisterResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManagementRegisterResultServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String Kkey1 = request.getParameter("name");
		String Kkey2 = request.getParameter("lname");
		String Kkey3 = request.getParameter("date");
		String key4 = request.getParameter("sof");
		if("".equals(Kkey1) || "".equals(Kkey2) || "".equals(Kkey3) || "".equals(key4)){
			String view = "/WEB-INF/view/ManagementRegisterResult2.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		}else{
			try{
				int key1 = ManagementDao.searchIdDao(Kkey1);
				int key2 = ManagementDao.searchLidDao(Kkey2);
				if(key1 == 0 || key2 == 0){
					String view = "/WEB-INF/view/ManagementRegisterResult3.jsp";
					RequestDispatcher dispatcher = request.getRequestDispatcher(view);
					dispatcher.forward(request, response);
				}else{
					int key3 = Integer.parseInt(Kkey3);
					ManagementDao.registerlicenseDao(key1, key2, key3, key4);
					String view = "/WEB-INF/view/ManagementRegisterResult.jsp";
					RequestDispatcher dispatcher = request.getRequestDispatcher(view);
					dispatcher.forward(request, response);
				}
			}catch(NumberFormatException e){
				String view = "/WEB-INF/view/ManagementRegisterResult2.jsp";
				RequestDispatcher dispatcher = request.getRequestDispatcher(view);
				dispatcher.forward(request, response);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
