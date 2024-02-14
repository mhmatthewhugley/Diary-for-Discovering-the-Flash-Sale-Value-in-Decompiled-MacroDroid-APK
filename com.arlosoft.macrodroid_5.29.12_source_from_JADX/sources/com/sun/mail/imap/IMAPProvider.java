package com.sun.mail.imap;

import com.sun.mail.util.DefaultProvider;
import javax.mail.Provider;
import p438y7.C16960i;

@DefaultProvider
public class IMAPProvider extends Provider {
    public IMAPProvider() {
        super(Provider.Type.STORE, "imap", C16960i.class.getName(), "Oracle", (String) null);
    }
}
