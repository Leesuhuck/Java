package egovframework.example.mbr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MbrController {

	//회원 관리 목록
	@RequestMapping (value = "mbrMstInit.do")
	public String mbrMstInit() {
		
		return "mbr/mbrMst";
	}
	
	//회원 상세 목록
	@RequestMapping (value = "mbrDtlInit.do")
	public String mbrDtlInit() {
		
		return "mbr/mbrDtl";
	}
	
	//회원 삭제 목록
	@RequestMapping (value = "mbrDelInit.do")
	public String mbrDelInit() {
		
		return "mbr/mbrDel";
	}
}
