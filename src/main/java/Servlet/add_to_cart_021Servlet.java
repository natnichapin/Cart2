package Servlet;

import Model.Cart;
import Model.CartItem;
import Model.Product;
import Model.ProductRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "add_to_cart_021Servlet", value = "/add_to_cart_021Servlet")
public class add_to_cart_021Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String[]> a = request.getParameterMap();
        HttpSession session = request.getSession();
        Cart cart = (Cart) session.getAttribute("cart");

        if(cart==null) {
            cart = new Cart() ;
            session.setAttribute("cart",cart);
        }
        for(String productId : a.get("select")) {
            System.out.println(productId);
           cart.addItem( new CartItem(ProductRepository.find(productId),Integer.valueOf(a.get(productId)[0])) );
        }
        System.out.println(a.values());
        cart.getItems().forEach(x-> System.out.println(x.getProduct().getProductName()+" " + x.getLineItemTotal()));
        getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
