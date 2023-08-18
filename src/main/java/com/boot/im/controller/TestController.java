package com.boot.im.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author sky
 * @Date 2023/8/18 17:45
 * @Description TODO
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

	@GetMapping("/getUser/{id}")
	public String getUser(@PathVariable String id) {

		return new String(id);
	}
}

