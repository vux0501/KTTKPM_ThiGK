package springboot.nguyenhoangvu.respository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import springboot.nguyenhoangvu.entity.Order;

@Repository
@Transactional
public interface OrderRepository extends JpaRepository<Order, String>{
	List<Order> findAll();

}
