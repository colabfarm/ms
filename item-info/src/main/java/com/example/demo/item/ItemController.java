package com.example.demo.item;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ItemController {
	@RequestMapping(value="/api", produces=MediaType.APPLICATION_JSON_VALUE)
	public Item getItem()
	{
		Item item = new Item();
		item.setId("1");
		item.setType("TV");
		return item;
	}
}
