package pe.edu.vallegrande.vg_ms_payment.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("payments")
public class Payment {
    @Id
    @Column("payment_id")
    private String paymentId;

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
    private LocalDate paymentDate;

    @Column("payment_status")
    private String paymentStatus;

    @Column("external_reference")
    private String externalReference;

    @Column("created_at")
    private LocalDateTime createdAt;

    @Column("updated_at")
    private LocalDateTime updatedAt;
}
