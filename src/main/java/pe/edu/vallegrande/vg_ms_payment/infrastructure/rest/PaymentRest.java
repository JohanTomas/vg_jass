package pe.edu.vallegrande.vg_ms_payment.infrastructure.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.vg_ms_payment.application.services.PaymentService;
import pe.edu.vallegrande.vg_ms_payment.domain.models.Payment;
import pe.edu.vallegrande.vg_ms_payment.infrastructure.dto.ResponseDto;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payments")
@CrossOrigin("*")
@AllArgsConstructor
public class PaymentRest {

    private final PaymentService paymentService;

    @GetMapping
    public Mono<ResponseDto<List<Payment>>> getAll() {
        return paymentService.getAll()
                .collectList()
                .map(payments -> new ResponseDto<>(true, payments));
    }
}
