package br.com.siteware.promotions.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class BaseResponse
{

    private LocalDateTime timestamp;
    private String message;

    public BaseResponse() {
        timestamp = LocalDateTime.now();
    }

    public BaseResponse(Throwable ex) {
        this();
        this.message = "Unexpected error";
    }

    public BaseResponse(String message) {
        this();
        this.message = message;
    }
}