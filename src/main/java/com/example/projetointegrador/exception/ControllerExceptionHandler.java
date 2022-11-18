package com.example.projetointegrador.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Arrays;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)

    public ResponseEntity<StandardException> entityNotFound(EntityNotFoundException e, HttpServletRequest request) {

        StandardException err = new StandardException();
        err.setTimestamp(String.valueOf(LocalDateTime.now()));
        err.setStatus(String.valueOf(HttpStatus.NOT_FOUND.value()));
        err.setError(e.getMessage());

        err.setTrace("nome_arquivo:" +Arrays.stream(
                e.getStackTrace()).findFirst().get().getFileName() +
                "linha: " + Arrays.stream(
                        e.getStackTrace()).findFirst().get().getLineNumber() +
                "nome_metodo:"+ Arrays.stream( e.getStackTrace()).findFirst().get().getMethodName() );

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}