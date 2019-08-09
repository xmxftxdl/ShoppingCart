package com.demo.CartList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.Items.Items;
import com.demo.item.item;
import com.demo.product.ProductList;
import com.demo.productElement.Product;

/**
 * Servlet implementation class CartList
 */
@WebServlet("/CartList")
public class CartList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		item temp = null;
		List<Product>ListProduct=new ArrayList<>();
		ListProduct=new ProductList().ListProduct();
		request.setAttribute("ListProduct",ListProduct);
		int id = Integer.parseInt(request.getParameter("ID"));
		System.out.println(id);
		temp=new ProductList().searchProduct(id);
		Items.addCart(temp);
		request.getRequestDispatcher("dashboard.jsp").forward(request,response);

	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
