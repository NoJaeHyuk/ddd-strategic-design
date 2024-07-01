package kitchenpos.order.eatinorder.domain;

import kitchenpos.order.eatinorder.infra.OrderTableRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaOrderTableRepository extends OrderTableRepository, JpaRepository<OrderTable, UUID> {
}