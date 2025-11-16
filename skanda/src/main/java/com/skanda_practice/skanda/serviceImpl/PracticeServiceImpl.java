package com.skanda_practice.skanda.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skanda_practice.skanda.dtoentity.PracticeDTO;
import com.skanda_practice.skanda.dtoentity.PracticeEntiry;
import com.skanda_practice.skanda.repoDao.PracticeRepo;
import com.skanda_practice.skanda.service.PracticeService;

@Service
public class PracticeServiceImpl implements PracticeService {
	@Autowired
    private PracticeRepo orderRepository;

    // Convert Order entity to OrderDTO
    private PracticeDTO convertToDTO(PracticeEntiry order) {
        double totalAmount = order.getQuantity() * order.getPrice();
        return new PracticeDTO(order.getId(), order.getCustomerName(), order.getProduct(), totalAmount);
    }

    @Override
    public PracticeEntiry createOrder(PracticeEntiry order) {
        return orderRepository.save(order);
    }

    @Override
    public List<PracticeDTO> getAllOrders() {
        List<PracticeEntiry> orders = orderRepository.findAll();
        return orders.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public List<PracticeDTO> getOrdersByCustomerName(String customerName) {
        List<PracticeEntiry> orders = orderRepository.findOrdersByCustomerName(customerName);
        return orders.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    @Override
    public PracticeDTO getOrderById(Long id) {
    	PracticeEntiry order = orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
        return convertToDTO(order);
    }

}
