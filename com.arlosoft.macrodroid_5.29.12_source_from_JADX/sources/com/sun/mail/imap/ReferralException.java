package com.sun.mail.imap;

import javax.mail.AuthenticationFailedException;

public class ReferralException extends AuthenticationFailedException {
    private static final long serialVersionUID = -3414063558596287683L;
    private String text;
    private String url;
}
