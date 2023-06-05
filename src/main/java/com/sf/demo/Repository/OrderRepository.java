package com.sf.demo.Repository;


import com.sf.demo.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<CustomerOrder, Long> {
    List<CustomerOrder> findOrdersByCustomerId(Long customerId);
}
