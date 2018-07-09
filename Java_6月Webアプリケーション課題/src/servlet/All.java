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
 * Servlet implementation class All
 */
@WebServlet("/All")
public class All extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public All() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<ReturnData> resultList = ManagementDao.getAllData();
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
		String view = "/WEB-INF/view/All.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
