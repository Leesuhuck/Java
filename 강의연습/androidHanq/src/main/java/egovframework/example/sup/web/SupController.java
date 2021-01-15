package egovframework.example.sup.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SupController {

	//고객지원 메세지
	@RequestMapping (value = "/supMsgInit.do")
	public String supMsgInit() {
		
		return "sup/supMsg";
	}
	
	//고객지원 전화번호
	@RequestMapping (value = "/supPhoneInit.do")
	public String supPhoneInit() {
		
		return "sup/supPhone";
	}
}
