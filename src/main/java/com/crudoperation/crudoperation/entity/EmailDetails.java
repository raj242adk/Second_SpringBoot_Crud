package com.crudoperation.crudoperation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmailDetails {

    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
}
