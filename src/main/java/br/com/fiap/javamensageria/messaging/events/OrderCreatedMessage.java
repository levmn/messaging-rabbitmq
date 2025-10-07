package br.com.fiap.javamensageria.messaging.events;

import br.com.fiap.javamensageria.domain.order.OrderItem;

import java.util.List;

public record OrderCreatedMessage(
        String orderId,
        String clientId,
        List<OrderItem> items
) {}