package com.google.firebase.messaging;

import java.util.Locale;

public final class SendException extends Exception {
    private final int errorCode;

    SendException(String str) {
        super(str);
        this.errorCode = m77001a(str);
    }

    /* renamed from: a */
    private int m77001a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c = 0;
                    break;
                }
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c = 1;
                    break;
                }
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c = 2;
                    break;
                }
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c = 3;
                    break;
                }
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
            case 4:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }
}
