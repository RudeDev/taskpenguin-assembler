package dev.rude.tie.entity.person;

import lombok.Data;

@Data
public class Person {

    private String email;
    private String password;
    private String name;
    private String lastName;
    private String CPF;
    private String CNPJ;
    private String phoneArea;
    private String phone;

}
