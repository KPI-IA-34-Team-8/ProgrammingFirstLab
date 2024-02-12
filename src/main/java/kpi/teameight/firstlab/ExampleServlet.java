package kpi.teameight.firstlab;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "exampleServlet", value = "/example-servlet")
public class ExampleServlet extends HttpServlet {
    private String message;

    // Once the servlet starts:
    public void init() {
        message = "Hello World! This is an example servlet. Initialization was completed successfully!";
    }

    // The code that runs when we do a request to the servlet
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + message + "</h2>");
        out.println("<a href=\"./\">Go back</a>");
        out.println("</body></html>");
    }

    // Once the servlet stops existing:
    public void destroy() {
    }
}