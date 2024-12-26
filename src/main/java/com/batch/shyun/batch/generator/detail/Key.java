package com.batch.shyun.batch.generator.detail;
import java.io.Serializable;

record Key(Long customerId, Long serviceId) implements Serializable {
}
