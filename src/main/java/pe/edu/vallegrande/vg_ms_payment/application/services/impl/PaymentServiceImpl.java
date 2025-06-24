package pe.edu.vallegrande.vg_ms_payment.application.services.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.vg_ms_payment.application.services.PaymentService;
import pe.edu.vallegrande.vg_ms_payment.domain.models.Payment;
import pe.edu.vallegrande.vg_ms_payment.infrastructure.repository.PaymentRepository;
import reactor.core.publisher.Flux;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Flux<Payment> getAll() {
        return paymentRepository.findAll()
                .doOnNext( payment -> log.info("payment retrieved: {}", payment));
    }
}
