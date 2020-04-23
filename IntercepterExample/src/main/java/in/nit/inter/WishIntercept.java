package in.nit.inter;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class WishIntercept implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
System.out.println("inside prehandle");
		Calendar cal=null;
		int hour=0;
		int minutes=0;
		RequestDispatcher rd=null;
		
		cal=Calendar.getInstance();
		hour=cal.get(Calendar.HOUR_OF_DAY);
		minutes=cal.get(Calendar.MINUTE);
		if(hour<=12 || minutes<=12) {
			System.out.println("Time :"+hour+":"+minutes);
			rd=request.getRequestDispatcher("/error.jsp");
            rd.forward(request, response);
		   return false;
	}else {
		System.out.println("else Time :"+hour+":"+minutes);

		return true;
	}
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("inside posthandle");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("inside afterCompletion");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
