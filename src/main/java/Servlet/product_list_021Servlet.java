package Servlet;

import Model.CartItem;
import Model.Product;
import Model.ProductRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "product_list_021Servlet", value = "/product_list_021Servlet")
public class product_list_021Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> ListP = ProductRepository.findAll() ;
        request.setAttribute("ListP",ListP);
        getServletContext().getRequestDispatcher("/ListAll.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
