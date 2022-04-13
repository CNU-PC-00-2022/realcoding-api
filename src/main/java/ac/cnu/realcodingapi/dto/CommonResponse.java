package ac.cnu.realcodingapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonInclude(NON_NULL)
public class CommonResponse<T> {

    private T data;
    private String message;

    public static <T> CommonResponse<T> from(T data, String message) {
        return new CommonResponse<>(data, message);
    }

    public static CommonResponse<?> of(String message) {
        return new CommonResponse<>(null, message);
    }
}
