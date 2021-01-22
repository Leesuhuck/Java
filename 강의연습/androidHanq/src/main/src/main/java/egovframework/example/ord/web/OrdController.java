package egovframework.example.ord.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdController {

	//주문 관리
	@RequestMapping(value = "/ordMstInit.do")
	public String ordMstInit() {
		
		return "ord/ordMst";
	}
}
