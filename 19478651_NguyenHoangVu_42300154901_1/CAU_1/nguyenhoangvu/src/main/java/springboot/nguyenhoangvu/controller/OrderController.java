package springboot.nguyenhoangvu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.nguyenhoangvu.entity.Order;
import springboot.nguyenhoangvu.respository.OrderRepository;



@RestController
@RequestMapping("/api")
public class OrderController {
	
//	@Autowired
//	JmsProducer jmsProducer;
	
	@Autowired
	OrderRepository orderRepository;
	
	@GetMapping("/findAll")
//	@PreAuthorize("hasAnyAuthority('USER_READ')")
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = orderRepository.findAll();
//		jmsProducer.sendMessage(list);
		return ResponseEntity.ok(list);
	}

}
