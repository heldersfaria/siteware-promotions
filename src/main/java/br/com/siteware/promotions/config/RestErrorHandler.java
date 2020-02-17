package br.com.siteware.promotions.config;

import br.com.siteware.promotions.dto.ApiError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice(basePackages = {"br.com.siteware.promotions.controller"})
public class RestErrorHandler {

    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleGenericException(final HttpServletRequest req, Exception ex) {
        ApiError apiError = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR, ex);
        logError(req, ex);
        return buildResponseEntity(apiError);
    }

    private ResponseEntity<Object> buildResponseEntity(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

    private void logError(final HttpServletRequest req, final Throwable e) {
        log.error("Request " + String.valueOf(req.getRequestURL()) + "raised an exception : " + e.getClass().getName(), e);
    }
}
