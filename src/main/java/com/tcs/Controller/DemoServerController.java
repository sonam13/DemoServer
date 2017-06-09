package com.tcs.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoServerController {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public @ResponseBody String getMsg() {
		return "Finally load balanced 8011";
	}
}
