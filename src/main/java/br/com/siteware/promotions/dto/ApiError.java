package br.com.siteware.promotions.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@NoArgsConstructor
public class ApiError extends BaseResponse {

    private HttpStatus status;
    private String detailedMessage;

    public ApiError(HttpStatus status) {
        this();
        this.status = status;
    }

    public ApiError(HttpStatus status, Throwable ex) {
        this();
        this.status = status;
        this.setMessage("Unexpected error");
        this.detailedMessage = ex.getLocalizedMessage();
    }

    public ApiError(HttpStatus status, String message) {
        this();
        this.status = status;
        this.setMessage(message);
    }

    public ApiError(HttpStatus status, String message, Throwable ex) {
        this();
        this.status = status;
        this.setMessage(message);
        this.detailedMessage = ex.getLocalizedMessage();
    }
}