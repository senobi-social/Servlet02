package chapter3;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// WebServletアノテーションはURLの定義する
// サーブレットのクラスの定義直前に記述する
// 最後の[hello]の部分は書き換え可能
@WebServlet(urlPatterns = { "/chapter3/hello" })
public class Hello extends HttpServlet {
    public void doGet(
        HttpServletRequest request, HttpServletResponse response
        ) throws ServletException, IOException
    {
        // HTMLを出力するためのエンコーディング
        response.setContentType("text/html; charset=UTF-8");

        // HttpServletResponseインタフェースのgetWriter()
        // 出力ストリームを取得する
        PrintWriter out = response.getWriter();

        // toolパッケージのpageクラスを使用
        Page.header(out);


        out.println("<p>Hello!</p>");
        out.println("<p>こんにちは！</p>");
        out.println("<p>" + new java.util.Date() + "</p>");

        
        // toolパッケージのpageクラスを使用
        Page.footer(out);


    }
}
