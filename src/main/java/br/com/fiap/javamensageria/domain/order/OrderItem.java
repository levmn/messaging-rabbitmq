package br.com.fiap.javamensageria.domain.order;

public record OrderItem(
        String productId,
        int quantity
) {}
