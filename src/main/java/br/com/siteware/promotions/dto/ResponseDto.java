package br.com.siteware.promotions.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<T> extends BaseResponse {

    public T object;

    public static <T> ResponseEntity<ResponseDto<T>> build(T object) {
        return null;
    }
}
