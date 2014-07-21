package com.facemake.front.web.control;

import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.facemake.core.maker.text.DynamicImgTextableFaceMaker;
import com.facemake.core.sourceface.TextRegional;
import com.facemake.core.sourceface.impl.TextableSourceFace;
import com.facemake.util.JsonUtil;
import com.facemake.util.TimerUtil;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet implements ApplicationContextAware{
	private static final long serialVersionUID = 1L;


	DynamicImgTextableFaceMaker faceMaker ;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloWorld() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TimerUtil.start("sss");
		
		WebApplicationContext applicationContext = WebApplicationContextUtils
				.getRequiredWebApplicationContext(request.getSession().getServletContext()) ;
		
		faceMaker = applicationContext.getBean("dynamicImgTextableFaceMaker", DynamicImgTextableFaceMaker.class) ;

		List<String> texts = new ArrayList<String>() ;
		texts.add("ABCDEGF");
		texts.add("HIJKLMN~~~");

		InputStream result = faceMaker.format(getTextableSourceFace() ,getSourceImage("111.gif")
				, texts ) ;

		try {
			IOUtils.copy(result, new FileOutputStream(new File("C:/Users/Administrator/Desktop/result.gif"))) ;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(TimerUtil.timing());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


	public InputStream getSourceImage(String imgName){
		try {
			String imgPath = "C:/Users/Administrator/Desktop/" + imgName;
			return new FileInputStream(new File(imgPath)) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null ;
	}

	public TextableSourceFace getTextableSourceFace(){
		TextableSourceFace face = new TextableSourceFace();
		face.setWidth(20);
		face.setHeight(10);
		face.setDescripe("测试");
		face.setRepeat(Integer.MAX_VALUE);  

		String attributes = face.getAttributes() ;
		Map<String, Object> attributesMap = JsonUtil.toMap(attributes) ;

		List<TextRegional> regionals = face.getTextRegionals() ;

		TextRegional r1 = new TextRegional();
		r1.setFontSize(13);
		r1.setFontType("仿宋");
		r1.setLeftUp(new Point(26,28));  
		r1.setMaxTextSize(3);  
		r1.setColor(Color.red.getRGB());

		TextRegional r2 = new TextRegional();
		r2.setFontSize(13);
		r2.setFontType("楷体");
		r2.setLeftUp(new Point(99, 130));  
		r2.setMaxTextSize(3);  
		r2.setColor(Color.green.getRGB());

		regionals.add(r1);
		regionals.add(r2);

		attributesMap.put(TextableSourceFace.REGIONALS_SIZE, regionals.size()) ;
		attributesMap.put(TextableSourceFace.REGIONALS_KEY, regionals) ;  

		attributes = JsonUtil.toJsonString(attributesMap) ;

		face.setAttributes(attributes);

		return face ;
	}

	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		
	}


}
