package pe.edu.vallegrande.vg_ms_payment.application.services;

import pe.edu.vallegrande.vg_ms_payment.domain.models.Payment;
import reactor.core.publisher.Flux;

public interface PaymentService {
    Flux<Payment> getAll();
}
