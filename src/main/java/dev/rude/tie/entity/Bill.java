package dev.rude.tie.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Bill {

    @Id
    private String id;
    private String bank;
    private String description;
    private String due;
    private String pay;
    private String value;

}
