package egovframework.example.cmmn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CmmnController {

	@RequestMapping (value = "/defaultLayoutsinIt.do")
	public String defaultLayoutinIt() {
		
		return "main-tiles";
	}
}
