package Servlet;

import Model.Cart;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "view_cart_021Servlet", value = "/view_cart_021Servlet")
public class view_cart_021Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();
            if(session==null||session.getAttribute("cart")==null){
                request.setAttribute("message","Your cart is Empty !!! ");
            }

            getServletContext().getRequestDispatcher("/ViewCart.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
