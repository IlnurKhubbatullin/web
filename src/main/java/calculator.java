//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//import java.io.IOException;
//
//public class calculator {
//    @WebServlet(name = "calculator", value = "/calculator")
//    public class HelloServlet extends HttpServlet {
//
//        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//            response.setContentType("text/html");
//            Integer a = Integer.parseInt(request.getParameter("a"));
//            Integer b = Integer.parseInt(request.getParameter("b"));
//            String operation = request.getParameter("operation");
//            Integer result = 0;
//
//            switch (operation) {
//                case "division":
//                    result = a / b;
//                    break;
//            }
//            // Hello
////            PrintWriter out = response.getWriter();
////            out.println("<html><body>");
////            out.println("<h1>" + result + "</h1>");
////            out.println("</body></html>");
//
//        }
//        public void destroy() {
//        }
//}}
