package pe.edu.vallegrande.vg_ms_payment.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate; 

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("payment_details")
public class PaymentDetail {
    @Id
    @Column("payment_detail_id")
    private String paymentDetailId;

    @Column("payment_id")
    private String paymentId;

    private String concept;
    private Integer year;
    private Integer month;
    private BigDecimal amount;
    private String description;

    @Column("period_start")
    private LocalDate periodStart;

    @Column("period_end")
    private LocalDate periodEnd;
}
