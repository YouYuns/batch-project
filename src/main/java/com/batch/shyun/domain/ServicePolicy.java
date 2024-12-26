package com.batch.shyun.domain;


import lombok.Getter;

@Getter
public enum ServicePolicy {
    A(1L, "/shyun/services/a", 10),
    B(2L, "/shyun/services/b", 10),
    C(3L, "/shyun/services/c", 10),
    D(4L, "/shyun/services/d", 15),
    E(5L, "/shyun/services/e", 15),
    F(6L, "/shyun/services/f", 10),
    G(7L, "/shyun/services/g", 10),
    H(8L, "/shyun/services/h", 10),
    I(9L, "/shyun/services/i", 10),
    J(10L, "/shyun/services/j", 10),
    K(11L, "/shyun/services/k", 10),
    L(12L, "/shyun/services/l", 12),
    M(13L, "/shyun/services/m", 12),
    N(14L, "/shyun/services/n", 12),
    O(15L, "/shyun/services/o", 10),
    P(16L, "/shyun/services/p", 10),
    Q(17L, "/shyun/services/q", 10),
    R(18L, "/shyun/services/r", 10),
    S(19L, "/shyun/services/s", 10),
    T(20L, "/shyun/services/t", 10),
    U(21L, "/shyun/services/u", 10),
    V(22L, "/shyun/services/v", 10),
    W(23L, "/shyun/services/w", 19),
    X(24L, "/shyun/services/x", 19),
    Y(25L, "/shyun/services/y", 19),
    Z(26L, "/shyun/services/z", 19);



    private final Long id;
    private final String url;
    private final Integer fee;

    ServicePolicy(Long id, String url, Integer fee) {
        this.id = id;
        this.url = url;
        this.fee = fee;
    }
}
