package egovframework.example.haksaengStatus.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class haksaengStatus {

	//학생 스테이터스
	@RequestMapping (value = "/initHaksaengStatus.do")
	public String mbrMstInit() {
		return "main-tiles";
	}
}
