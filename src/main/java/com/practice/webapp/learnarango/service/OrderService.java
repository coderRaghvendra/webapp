package com.practice.webapp.learnarango.service;

import com.practice.webapp.learnarango.entity.Order;
import com.practice.webapp.learnarango.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return (List<Order>) orderRepository.findAll();
    }

    public Optional<Order> getOrderById(String id) {
        return orderRepository.findById(id);
    }

    public void deleteOrder(String id) {
        orderRepository.deleteById(id);
    }

    public Order updateOrder(String id, Order updatedOrder) {
        return orderRepository.findById(id)
            .map(existing -> {
                existing.setProduct(updatedOrder.getProduct());
                existing.setQuantity(updatedOrder.getQuantity());
                return orderRepository.save(existing);
            }).orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
    }
}
