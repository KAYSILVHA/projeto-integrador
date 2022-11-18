package com.example.projetointegrador.exception;

import lombok.Data;

import java.io.Serializable;

@Data
public class StandardException implements Serializable {
    private static final long serialVersionVID=1l;

    private String timestamp;

    private String status;

    private String error;

    private String trace;

    public StandardException(){
}}
