package pe.edu.vallegrande.vg_ms_payment.infrastructure.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.edu.vallegrande.vg_ms_payment.domain.models.Payment;

public interface PaymentRepository extends ReactiveCrudRepository<Payment, String> {

}
