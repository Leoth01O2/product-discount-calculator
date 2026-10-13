package com.codegym;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "DiscountServlet", urlPatterns = {"/display-discount"})
public class DiscountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String description = request.getParameter("description");
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        double discountAmount = listPrice * discountPercent * 0.01;
        double discountPrice = listPrice - discountAmount;

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head><title>Discount Result</title></head>");
            out.println("<body>");
            out.println("<h2>Product Discount Result</h2>");
            out.println("<p>Product Description: " + description + "</p>");
            out.println("<p>List Price: " + listPrice + "</p>");
            out.println("<p>Discount Percent: " + discountPercent + "%</p>");
            out.println("<p>Discount Amount: " + discountAmount + "</p>");
            out.println("<p>Discount Price: " + discountPrice + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}