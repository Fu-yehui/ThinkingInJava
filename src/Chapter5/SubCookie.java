package Chapter5;

import com.roger.ThinkingInJava.Chapter5.Cookie;

public class SubCookie extends Cookie{

	public SubCookie(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	


	public static void main(String[] args) {
		SubCookie cookie=new SubCookie(55);
		//System.out.println(cookie.getId());
	System.out.println(cookie.id);

	}

}
