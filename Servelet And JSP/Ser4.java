package com.myservelet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypack.Player;
import mypack.Playerdao;

/**
 * Servlet implementation class Ser4
 */
@WebServlet("/Ser4")
public class Ser4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ser4() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");

		//out.print("servlet 1");

		String fname= request.getParameter("playerFName");
		String lname= request.getParameter("playerLName");
		String dob= request.getParameter("dob");
		int age= Integer.parseInt(request.getParameter("age"));
		String playergame= request.getParameter("game");


		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date dateDob=null;
		try
		{
		dateDob=sdf.parse(dob);
		}
		catch (Exception e) {
		// TODO: handle exception
		}

		Player player=new Player("", fname, lname, dateDob,age, playergame);

		Playerdao dao=new Playerdao();
		out.print(dao.savePlayer(player));



		}

}
