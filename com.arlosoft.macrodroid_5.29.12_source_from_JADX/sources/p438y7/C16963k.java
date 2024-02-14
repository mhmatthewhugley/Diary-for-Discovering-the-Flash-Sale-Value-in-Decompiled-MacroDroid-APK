package p438y7;

import com.sun.mail.util.MailLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import javax.mail.Message;

/* renamed from: y7.k */
/* compiled from: MessageCache */
public class C16963k {

    /* renamed from: a */
    private C16955e[] f68337a;

    /* renamed from: b */
    private int[] f68338b;

    /* renamed from: c */
    private int f68339c;

    /* renamed from: d */
    private C16941c f68340d;

    /* renamed from: e */
    private MailLogger f68341e;

    C16963k(C16941c cVar, C16960i iVar, int i) {
        this.f68340d = cVar;
        MailLogger subLogger = cVar.f68235S.getSubLogger("messagecache", "DEBUG IMAP MC", iVar.mo80185m());
        this.f68341e = subLogger;
        if (subLogger.isLoggable(Level.CONFIG)) {
            MailLogger mailLogger = this.f68341e;
            mailLogger.config("create cache of size " + i);
        }
        m100193b(i, 1);
    }

    /* renamed from: b */
    private void m100193b(int i, int i2) {
        C16955e[] eVarArr = this.f68337a;
        if (eVarArr == null) {
            this.f68337a = new C16955e[(i + 64)];
        } else if (eVarArr.length < i) {
            if (this.f68341e.isLoggable(Level.FINE)) {
                this.f68341e.fine("expand capacity to " + i);
            }
            int i3 = i + 64;
            C16955e[] eVarArr2 = new C16955e[i3];
            C16955e[] eVarArr3 = this.f68337a;
            System.arraycopy(eVarArr3, 0, eVarArr2, 0, eVarArr3.length);
            this.f68337a = eVarArr2;
            int[] iArr = this.f68338b;
            if (iArr != null) {
                int[] iArr2 = new int[i3];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                int i4 = this.f68339c;
                while (i4 < i3) {
                    iArr2[i4] = i2;
                    i4++;
                    i2++;
                }
                this.f68338b = iArr2;
                if (this.f68341e.isLoggable(Level.FINE)) {
                    this.f68341e.fine("message " + i + " has sequence number " + this.f68338b[i - 1]);
                }
            }
        } else if (i < this.f68339c) {
            if (this.f68341e.isLoggable(Level.FINE)) {
                this.f68341e.fine("shrink capacity to " + i);
            }
            for (int i5 = i + 1; i5 <= this.f68339c; i5++) {
                int i6 = i5 - 1;
                this.f68337a[i6] = null;
                int[] iArr3 = this.f68338b;
                if (iArr3 != null) {
                    iArr3[i6] = -1;
                }
            }
        }
        this.f68339c = i;
    }

    /* renamed from: f */
    private int m100194f(int i) {
        if (this.f68338b == null) {
            return i;
        }
        if (i < 1) {
            if (this.f68341e.isLoggable(Level.FINE)) {
                this.f68341e.fine("bad seqnum " + i);
            }
            return -1;
        }
        for (int i2 = i; i2 <= this.f68339c; i2++) {
            int[] iArr = this.f68338b;
            int i3 = i2 - 1;
            if (iArr[i3] == i) {
                return i2;
            }
            if (iArr[i3] > i) {
                break;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private void m100195j(int i, int i2) {
        this.f68339c = i - 1;
        MailLogger mailLogger = this.f68341e;
        Level level = Level.FINE;
        if (mailLogger.isLoggable(level)) {
            this.f68341e.fine("size now " + this.f68339c);
        }
        int i3 = this.f68339c;
        if (i3 == 0) {
            this.f68337a = null;
            this.f68338b = null;
        } else if (i3 <= 64 || i3 >= this.f68337a.length / 2) {
            if (this.f68341e.isLoggable(level)) {
                this.f68341e.fine("clean " + i + " to " + i2);
            }
            while (i < i2) {
                int i4 = i - 1;
                this.f68337a[i4] = null;
                int[] iArr = this.f68338b;
                if (iArr != null) {
                    iArr[i4] = 0;
                }
                i++;
            }
        } else {
            this.f68341e.fine("reallocate array");
            int i5 = this.f68339c;
            C16955e[] eVarArr = new C16955e[(i5 + 64)];
            System.arraycopy(this.f68337a, 0, eVarArr, 0, i5);
            this.f68337a = eVarArr;
            int[] iArr2 = this.f68338b;
            if (iArr2 != null) {
                int i6 = this.f68339c;
                int[] iArr3 = new int[(i6 + 64)];
                System.arraycopy(iArr2, 0, iArr3, 0, i6);
                this.f68338b = iArr3;
            }
        }
    }

    /* renamed from: a */
    public void mo80198a(int i, int i2) {
        if (this.f68341e.isLoggable(Level.FINE)) {
            MailLogger mailLogger = this.f68341e;
            mailLogger.fine("add " + i + " messages");
        }
        m100193b(this.f68339c + i, i2);
    }

    /* renamed from: c */
    public void mo80199c(int i) {
        int f = m100194f(i);
        if (f >= 0) {
            int i2 = f - 1;
            C16955e eVar = this.f68337a[i2];
            if (eVar != null) {
                if (this.f68341e.isLoggable(Level.FINE)) {
                    this.f68341e.fine("expunge existing " + f);
                }
                eVar.setExpunged(true);
            }
            int[] iArr = this.f68338b;
            if (iArr == null) {
                this.f68341e.fine("create seqnums array");
                this.f68338b = new int[this.f68337a.length];
                for (int i3 = 1; i3 < f; i3++) {
                    this.f68338b[i3 - 1] = i3;
                }
                this.f68338b[i2] = 0;
                int i4 = f + 1;
                while (true) {
                    int[] iArr2 = this.f68338b;
                    if (i4 <= iArr2.length) {
                        int i5 = i4 - 1;
                        iArr2[i5] = i5;
                        i4++;
                    } else {
                        return;
                    }
                }
            } else {
                iArr[i2] = 0;
                int i6 = f + 1;
                while (true) {
                    int[] iArr3 = this.f68338b;
                    if (i6 <= iArr3.length) {
                        int i7 = i6 - 1;
                        if (iArr3[i7] > 0) {
                            iArr3[i7] = iArr3[i7] - 1;
                        }
                        i6++;
                    } else {
                        return;
                    }
                }
            }
        } else if (this.f68341e.isLoggable(Level.FINE)) {
            this.f68341e.fine("expunge no seqnum " + i);
        }
    }

    /* renamed from: d */
    public C16955e mo80200d(int i) {
        if (i < 1 || i > this.f68339c) {
            throw new ArrayIndexOutOfBoundsException("message number (" + i + ") out of bounds (" + this.f68339c + ")");
        }
        int i2 = i - 1;
        C16955e eVar = this.f68337a[i2];
        if (eVar == null) {
            if (this.f68341e.isLoggable(Level.FINE)) {
                this.f68341e.fine("create message number " + i);
            }
            eVar = this.f68340d.mo80136L(i);
            this.f68337a[i2] = eVar;
            if (mo80204i(i) <= 0) {
                this.f68341e.fine("it's expunged!");
                eVar.setExpunged(true);
            }
        }
        return eVar;
    }

    /* renamed from: e */
    public C16955e mo80201e(int i) {
        int f = m100194f(i);
        if (f >= 0) {
            return mo80200d(f);
        }
        if (!this.f68341e.isLoggable(Level.FINE)) {
            return null;
        }
        MailLogger mailLogger = this.f68341e;
        mailLogger.fine("no message seqnum " + i);
        return null;
    }

    /* renamed from: g */
    public C16955e[] mo80202g() {
        this.f68341e.fine("remove expunged messages");
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i <= this.f68339c) {
            if (mo80204i(i) <= 0) {
                arrayList.add(mo80200d(i));
            } else {
                if (i2 != i) {
                    C16955e[] eVarArr = this.f68337a;
                    int i3 = i2 - 1;
                    eVarArr[i3] = eVarArr[i - 1];
                    if (eVarArr[i3] != null) {
                        eVarArr[i3].setMessageNumber(i2);
                    }
                }
                i2++;
            }
            i++;
        }
        this.f68338b = null;
        m100195j(i2, i);
        int size = arrayList.size();
        C16955e[] eVarArr2 = new C16955e[size];
        if (this.f68341e.isLoggable(Level.FINE)) {
            this.f68341e.fine("return " + size);
        }
        arrayList.toArray(eVarArr2);
        return eVarArr2;
    }

    /* renamed from: h */
    public C16955e[] mo80203h(Message[] messageArr) {
        this.f68341e.fine("remove expunged messages");
        ArrayList arrayList = new ArrayList();
        int length = messageArr.length;
        int[] iArr = new int[length];
        boolean z = false;
        for (int i = 0; i < messageArr.length; i++) {
            iArr[i] = messageArr[i].getMessageNumber();
        }
        Arrays.sort(iArr);
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i3 <= this.f68339c) {
            if (i2 >= length || i3 != iArr[i2] || mo80204i(i3) > 0) {
                if (i4 != i3) {
                    C16955e[] eVarArr = this.f68337a;
                    int i5 = i4 - 1;
                    int i6 = i3 - 1;
                    eVarArr[i5] = eVarArr[i6];
                    if (eVarArr[i5] != null) {
                        eVarArr[i5].setMessageNumber(i4);
                    }
                    int[] iArr2 = this.f68338b;
                    if (iArr2 != null) {
                        iArr2[i5] = iArr2[i6];
                    }
                }
                int[] iArr3 = this.f68338b;
                if (!(iArr3 == null || iArr3[i4 - 1] == i4)) {
                    z = true;
                }
                i4++;
            } else {
                arrayList.add(mo80200d(i3));
                while (i2 < length && iArr[i2] <= i3) {
                    i2++;
                }
            }
            i3++;
        }
        if (!z) {
            this.f68338b = null;
        }
        m100195j(i4, i3);
        int size = arrayList.size();
        C16955e[] eVarArr2 = new C16955e[size];
        if (this.f68341e.isLoggable(Level.FINE)) {
            this.f68341e.fine("return " + size);
        }
        arrayList.toArray(eVarArr2);
        return eVarArr2;
    }

    /* renamed from: i */
    public int mo80204i(int i) {
        if (this.f68338b == null) {
            return i;
        }
        if (this.f68341e.isLoggable(Level.FINE)) {
            MailLogger mailLogger = this.f68341e;
            mailLogger.fine("msgnum " + i + " is seqnum " + this.f68338b[i - 1]);
        }
        return this.f68338b[i - 1];
    }

    /* renamed from: k */
    public int mo80205k() {
        return this.f68339c;
    }
}
