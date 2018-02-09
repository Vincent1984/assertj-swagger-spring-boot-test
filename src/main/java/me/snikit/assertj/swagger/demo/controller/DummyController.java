package me.snikit.assertj.swagger.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import me.snikit.assertj.swagger.demo.dto.ItemDTO;

@RestController
public class DummyController {

	private static final Logger log = LoggerFactory.getLogger(DummyController.class);
	List<ItemDTO> itemList = new ArrayList<>();

	public DummyController() {
		itemList.add(new ItemDTO(0, "item 1"));
		itemList.add(new ItemDTO(1, "item 2"));
		itemList.add(new ItemDTO(2, "item 3"));
		itemList.add(new ItemDTO(4, "item 4"));
		itemList.add(new ItemDTO(5, "item 5"));
	}

	@GetMapping("/item/{id}")
	public ItemDTO getItem(@PathVariable("id") int index) {
		log.info("getting item {}", itemList.get(index));
		return itemList.get(index);
	}

	@ResponseStatus(HttpStatus.OK)
	@PutMapping("/item")
	public void putItem(@RequestBody ItemDTO itemDTO) {
		log.info("putting item {}", itemDTO);
		itemList.add(itemDTO);
	}
}
