package io.drewenia.remoteDeploymentWithRMI;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServletA extends HttpServlet {
    /* Web sunucusu bu methodu çağırır, client'in request'ini size iletir (bu request'i veriden çıkarabilirsiniz) ve
    bir 'response' nesnesi sunar. Bu nesneyi kullanarak bir yanıtı (bir sayfa) geri gönderirsiniz.*/
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        /* Bu, sunucuya (ve tarayıcıya) bu servletin çalıştırılması sonucunda server'dan dönen 'şey'in ne türde
        olduğunu belirtir.*/
        response.setContentType("text/html");
        /* Response nesnesi bize bir output stream verir, böylece bilgiyi geri yazabiliriz.*/
        PrintWriter out = response.getWriter();
        String message = "If you’re reading this, it worked!";

        /* Yazdığımız şey bir HTML sayfasıdır! Sayfa, server aracılığıyla tarayıcıya iletildi, tamamen normal bir HTML
        sayfası gibi, sadece bu şimdiye kadar var olmayan bir sayfadır. Başka bir deyişle, bu bilgileri içeren herhangi
        bir .html dosyası yoktur.*/
        out.println("<HTML><BODY>");
        out.println("<H1>” + message + “</H1>");
        out.println("</BODY></HTML>");
        out.close();
    }
}
