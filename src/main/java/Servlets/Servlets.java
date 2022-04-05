package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
// when TomCat Launch it will be listening on url  //http://localhost:8080/app
@WebServlet(urlPatterns = "/home")
public class Servlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     String json= "{\"id\":1,\"name\":\"Donald Duck\"}";
      resp.setStatus(200);


    }
}
