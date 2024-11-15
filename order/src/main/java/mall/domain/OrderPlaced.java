package mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import mall.domain.*;
import mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private String productId;
    private Integer qty;
    private Integer status;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
