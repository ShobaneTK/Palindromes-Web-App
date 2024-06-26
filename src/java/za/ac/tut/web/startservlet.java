/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.PalindromeManager;

/**
 *
 * @author Student
 */
public class startservlet extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        String name = (String)request.getParameter("name");
        
        PalindromeManager manager = new PalindromeManager();
        String reversed = manager.wordChecker(name);
        String outCome = manager.validPalendrone(name, reversed);
        Integer count = manager.numOfPalendrome(name, reversed);
        
        request.setAttribute("name", name);
        request.setAttribute("reversed", reversed);
        request.setAttribute("outCome", outCome);
        request.setAttribute("count", count);
        
        initialiseSession(session,name);
        RequestDispatcher disp = request.getRequestDispatcher("palendroneDisplayer.jsp");
        disp.forward(request, response);
    }

    private void initialiseSession(HttpSession session, String name) 
    {
        String reversed="";
        String outCome = "";
        Integer count=0;
         session.setAttribute("name", name);
         session.setAttribute("reversed", reversed);
         session.setAttribute("outCome", outCome);
         session.setAttribute("count", count);
    }

   
}
