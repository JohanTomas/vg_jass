package pe.edu.vallegrande.vg_ms_payment.infrastructure.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Column;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentCreateRequest {
    @Column("organization_id")
    private String organizationId;

    @Column("payment_code")
    private String paymentCode;

    @Column("user_id")
    private String userId;

    @Column("water_box_id")
    private String waterBoxId;

    @Column("payment_type")
    private String paymentType;

    @Column("payment_method")
    private String paymentMethod;

    @Column("total_amount")
    private BigDecimal totalAmount;

    @Column("payment_date")
    private LocalDateTime paymentDate;

    @Column("payment_status")
    private String paymentStatus;

    @Column("external_reference")
    private String externalReference;
}
