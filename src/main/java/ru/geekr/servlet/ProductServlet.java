package ru.geekr.servlet;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekr.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "FirstServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {

    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);
    private List<Product> products = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        logger.info("New GET request");

        initProducts();
        for (Product p : products) {
            resp.getWriter().println(p.toString());
        }
    }

    private void initProducts() {
        Product[] productArray = new Product[]{
                new Product(1L, "Cheese", 10.0D),
                new Product(2L, "Candy", 5.3D),
                new Product(3L, "Milk", 2.2D),
                new Product(4L, "Meat", 9.3D),
                new Product(5L, "Potato", 1.0D),
                new Product(6L, "Onion", 0.3D),
                new Product(7L, "Chocolate", 3.0D),
                new Product(8L, "Chips", 2.8D),
                new Product(9L, "Cola", 1.5D),
                new Product(10L, "Dessert", 20.0D)
        };
        products.addAll(List.of(productArray));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        logger.info("New POST request");
        resp.getWriter().printf("<h1>New POST request</h1>");
    }

}
