package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ManagementDao;
import dto.ReturnData;
import dto.ReturnI;

/**
 * Servlet implementation class SearchStudentResultServlet
 */
@WebServlet("/SearchStudentResultServlet")
public class SearchStudentResultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchStudentResultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String Kkey1 = request.getParameter("year");
		String Kkey2 = request.getParameter("class");
		int key1 = Integer.parseInt(Kkey1);
		int key2 = Integer.parseInt(Kkey2);

		if("".equals(key1) || "".equals(key2)){
			String view = "/WEB-INF/view/StudentRegisterResult2.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		}else{
			/*ManagementDao.getClassData(key1, key2);
			String view = "/WEB-INF/view/SearchStudentResult.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);*/
			ArrayList<ReturnData> resultList = ManagementDao.getClassData(key1,key2);
			int i = 0;
			for(ReturnData result : resultList){
				String name = result.getName();
				String lname = result.getLname();
				int date = result.getDate();
				String sof = result.getSof();
				ReturnData data = new ReturnData(name,lname,date,sof);
				String rs = "rs" + i;
				//取得した値をリクエストスコープへ
				request.setAttribute(rs,data);
				i = i + 1;
			}
			//結果画面へフォワード
			ReturnI ri = new ReturnI(i);
			request.setAttribute("inum", ri);
			String view = "/WEB-INF/view/SearchStudentResult.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(view);
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
