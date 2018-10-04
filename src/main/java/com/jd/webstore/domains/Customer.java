package com.jd.webstore.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String customerId;
    private String name;
    private String address;
    private String noOfOrdersMade;
}
