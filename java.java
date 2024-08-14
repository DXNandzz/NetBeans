package PKL;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "java", urlPatterns = {"/java"})
public class java extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>I Kadek Dwi Fernanda</title>");            
            out.println("<style>");
            out.println("body {");
            out.println("  font-family: Arial, sans-serif;");
            out.println("  margin: 0;");
            out.println("  padding: 0;");
            out.println("  background-color: #f4f4f4;");
            out.println("}");
            out.println("header {");
            out.println("  background-color: #4CAF50;");
            out.println("  color: white;");
            out.println("  padding: 10px 0;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("nav {");
            out.println("  margin: 0;");
            out.println("  padding: 10px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("nav a {");
            out.println("  margin: 0 15px;");
            out.println("  text-decoration: none;");
            out.println("  color: #4CAF50;");
            out.println("}");
            out.println("section {");
            out.println("  padding: 20px;");
            out.println("  text-align: center;");
            out.println("}");
            out.println("footer {");
            out.println("  background-color: #4CAF50;");
            out.println("  color: white;");
            out.println("  padding: 10px 0;");
            out.println("  text-align: center;");
            out.println("  position: fixed;");
            out.println("  width: 100%;");
            out.println("  bottom: 0;");
            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Selamat Datang</h1>");
            out.println("</header>");
            out.println("<nav>");
            out.println("<a href='#home'>Home</a>");
            out.println("<a href='#about'>About</a>");
            out.println("<a href='#contact'>Contact</a>");
            out.println("</nav>");
            out.println("<section>");
            out.println("<h2>Hallo</h2>");
            out.println("<p>Nama Saya I Kadek Dwi Fernanda, saya adalah mahasiswa dari kampus Politeknik Negeri Bali.</p> ");
            out.println ("<p>Jurusan Yang saya ambil adalah Teknologi Informasi dengan Program Studi Manajemen Informatika.</p>");
            out.println("</section>");
            out.println("<footer>");
            out.println("<p>&copy; 2024 DXNandzz</p>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Simple Webpage Servlet";
    }
}
