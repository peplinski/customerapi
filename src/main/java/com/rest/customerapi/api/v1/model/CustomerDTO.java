package com.rest.customerapi.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private Long id;
    private String firstName;
    private String lastName;

    @JsonProperty("customer_url")
    private String customerUrl;
}
