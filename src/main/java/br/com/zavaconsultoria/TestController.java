package br.com.zavaconsultoria;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/teste")
@RestController
public class TestController {

	@GetMapping
	public ResponseEntity<String> get(){
		return ResponseEntity.ok("ok");
	}
}
