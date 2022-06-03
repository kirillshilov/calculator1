package skypro.calculator;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ZeroIntException extends IllegalArgumentException  {
    public ZeroIntException(String massage) {
    }
}
