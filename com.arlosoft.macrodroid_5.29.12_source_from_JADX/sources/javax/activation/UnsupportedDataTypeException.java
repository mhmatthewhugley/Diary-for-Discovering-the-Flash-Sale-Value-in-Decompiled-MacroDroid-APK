package javax.activation;

import java.io.IOException;

public class UnsupportedDataTypeException extends IOException {
    public UnsupportedDataTypeException() {
    }

    public UnsupportedDataTypeException(String str) {
        super(str);
    }
}
