package com.batch.shyun.batch.generator.detail;
import com.batch.shyun.domain.ApiOrder;
import com.batch.shyun.domain.ServicePolicy;
import org.springframework.batch.item.ItemProcessor;

public class PreSettleDetailProcessor implements ItemProcessor<ApiOrder, Key> {

    @Override
    public Key process(ApiOrder item) throws Exception {
        if(item.getState() == ApiOrder.State.FAIL)
            return null;

        final Long serviceId = ServicePolicy.findByUrl(item.getUrl())
                .getId();

        return new Key(
                item.getCustomerId(),
                serviceId
        );
    }

}
