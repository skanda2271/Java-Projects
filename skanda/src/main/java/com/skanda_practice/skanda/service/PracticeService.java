package com.skanda_practice.skanda.service;

import java.util.List;

import com.skanda_practice.skanda.dtoentity.PracticeDTO;
import com.skanda_practice.skanda.dtoentity.PracticeEntiry;

public interface PracticeService {
	PracticeEntiry createOrder(PracticeEntiry order);

    List<PracticeDTO> getAllOrders();

    List<PracticeDTO> getOrdersByCustomerName(String customerName);

    PracticeDTO getOrderById(Long id);

}
