package com.cafe24.mysite.controller.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cafe24.mysite.dto.JSONResult;

import io.swagger.annotations.ApiOperation;


@RestController("guestbookAPIController")
@RequestMapping("/api/guestbook")
public class GuestbookController {

	@ApiOperation(value="방명록 리스트")
	@RequestMapping(value = "/list/{no}", method = RequestMethod.GET)
	public JSONResult list(@PathVariable(value = "no") int no) {
		return JSONResult.success(null);
	} 
}
