package RequestParam_HTMLFORM;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class DayInterceptor implements HandlerInterceptor {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		Calendar cal = Calendar.getInstance();
		int dayofweek = cal.get(cal.DAY_OF_WEEK);
		if (dayofweek == 1)// 1 means Sunday,2 means Monday.......7 means Saturday
		{
			response.getWriter()
					.write("The Website is closed on sunday,Please access it on another day!!!!!!!!!!!!!!!!!!!");
			return false;
		} else {
			return true;
		}
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("HandlerInterceptor : Spring MVC Posthandle method for "
				+request.getRequestURI().toString());

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("HandlerInterceptor : Spring MVC AfterCompletion method for "
				+request.getRequestURI().toString());

	}

}
