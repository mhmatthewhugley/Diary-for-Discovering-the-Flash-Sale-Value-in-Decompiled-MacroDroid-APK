package com.udojava.evalex;

import com.udojava.evalex.Expression;

public class TokenizerException extends Expression.ExpressionException {
    public TokenizerException(String str, int i) {
        super(str, i);
    }
}
