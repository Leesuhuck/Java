package egovframework.example.prd.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrdController {

	//제품 관리
	@RequestMapping(value = "/prdMstInit.do")
	public String prdMstInit() {
		
		return "prd/prdMst";
	}
	
	//제품 상세
	@RequestMapping(value = "/prdDtlInit.do")
	public String prdDtlInit() {
		
		return "prd/prdDtl";
	}
}
