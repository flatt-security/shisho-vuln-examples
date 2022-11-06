package com.flatt.text4shell.controller;

import org.apache.commons.text.StringSubstitutor;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("text4shell")
public class SearchController {
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	@ResponseBody
	public String search(@RequestParam(defaultValue = "default") String search) {
		StringSubstitutor interpolator = StringSubstitutor.createInterpolator();
		try {
			// ...

			String foo = interpolator.replace(search);

			// ...
		} catch (Exception e) {
			System.out.println(e);
		}

		return "Search results for: " + search;
	}

}
