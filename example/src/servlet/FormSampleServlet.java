package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormSampleServlet
 */
@WebServlet("/FormSampleServlet")
public class FormSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormSampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//リクエストパラメータの文字コードを指定
		request.setCharacterEncoding("UTF-8");

		//リクエストパラメータの取得
		String name = request.getParameter("name");
		String qtype = request.getParameter("qtype");
		String body = request.getParameter("body");

//		フォームチェック
		String errorMsg = "";
		if(name == null || name.length() == 0) {
			errorMsg += "名前が入力されていません<br>";
		}
		if(qtype == null || qtype.length() == 0) {
			errorMsg += "お問い合わせの種類が選択されていません";
		}else {
			if(qtype.equals("company")) { qtype = "会社について";}
			else if(qtype.equals("product")) { qtype = "製品について";}
			else if(qtype.equals("support")) { qtype = "アフターサポートについて";}
		}
		if(body == null || body.length() == 0) {
			errorMsg += "お問い合わせ内容が入力されていません";
		}
//		表示するメッセージを設定
		String msg = name + "さんのお問い合わせ内容(" + qtype + ")を登録しました";
		String opinion = body;
		if(errorMsg.length() != 0) {
			msg = errorMsg;
		}
//		HTMLを出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=UTF-8>");
		out.println("<title>ユーザー登録結果</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + msg + "</p><br>");
		out.println("<p>" + opinion + "</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
