package com.eventostec.api.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name = "coupon")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CouponEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String code;
    private Double discount;
    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventEntity event;
}
