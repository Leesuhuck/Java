package egovframework.example.service.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServiceController {

	//서비스 컨텐츠 목록
	@RequestMapping (value = "/serviceContentsInit.do")
	public String serviceContentsInit() {
		
		return "service/serviceContents";
	}
	
	//서비스 게임 목록
	@RequestMapping (value = "/serviceGameInit.do")
	public String serviceGameInit() {
		
		return "service/serviceGame";
	}
	
	//서비스 포럼 목록
	@RequestMapping (value = "/servicePortalInit.do")
	public String servicePortalInit() {
		
		return "service/servicePortal";
	}
}
