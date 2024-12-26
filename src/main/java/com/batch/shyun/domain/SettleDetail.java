package com.batch.shyun.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@ToString
public class SettleDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;

    private Long serviceId;

    private Long count;

    private Long fee;

    private LocalDate targetDate;

    public SettleDetail(Long customerId, Long serviceId, Long count, Long fee, LocalDate targetDate) {
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.count = count;
        this.fee = fee;
        this.targetDate = targetDate;
    }
}
