package p438y7;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.event.MessageCountEvent;

/* renamed from: y7.m */
/* compiled from: MessageVanishedEvent */
public class C16965m extends MessageCountEvent {

    /* renamed from: a */
    private static final Message[] f68345a = new Message[0];
    private static final long serialVersionUID = 2142028010250024922L;
    private long[] uids;

    public C16965m(Folder folder, long[] jArr) {
        super(folder, 2, true, f68345a);
        this.uids = jArr;
    }
}
