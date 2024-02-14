package p438y7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import javax.mail.Message;
import p447z7.C17062n;
import p447z7.C17069t;

/* renamed from: y7.o */
/* compiled from: Utility */
public final class C16967o {

    /* renamed from: y7.o$a */
    /* compiled from: Utility */
    class C16968a implements Comparator<Message> {
        C16968a() {
        }

        /* renamed from: a */
        public int compare(Message message, Message message2) {
            return message.getMessageNumber() - message2.getMessageNumber();
        }
    }

    /* renamed from: y7.o$b */
    /* compiled from: Utility */
    public interface C16969b {
        /* renamed from: a */
        boolean mo80173a(C16955e eVar);
    }

    /* renamed from: a */
    public static C17062n[] m100204a(Message[] messageArr, C16969b bVar) {
        ArrayList arrayList = new ArrayList(1);
        int i = 0;
        while (i < messageArr.length) {
            C16955e eVar = messageArr[i];
            if (!eVar.isExpunged()) {
                int w = eVar.mo80169w();
                if (bVar == null || bVar.mo80173a(eVar)) {
                    C17062n nVar = new C17062n();
                    nVar.f68493a = w;
                    while (true) {
                        i++;
                        if (i >= messageArr.length) {
                            break;
                        }
                        C16955e eVar2 = messageArr[i];
                        if (!eVar2.isExpunged()) {
                            int w2 = eVar2.mo80169w();
                            if (bVar == null || bVar.mo80173a(eVar2)) {
                                if (w2 != w + 1) {
                                    i--;
                                    break;
                                }
                                w = w2;
                            }
                        }
                    }
                    nVar.f68494b = w;
                    arrayList.add(nVar);
                }
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C17062n[]) arrayList.toArray(new C17062n[arrayList.size()]);
    }

    /* renamed from: b */
    public static C17062n[] m100205b(Message[] messageArr, C16969b bVar) {
        Message[] messageArr2 = (Message[]) messageArr.clone();
        Arrays.sort(messageArr2, new C16968a());
        return m100204a(messageArr2, bVar);
    }

    /* renamed from: c */
    public static C17069t[] m100206c(Message[] messageArr) {
        ArrayList arrayList = new ArrayList(1);
        int i = 0;
        while (i < messageArr.length) {
            C16955e eVar = messageArr[i];
            if (!eVar.isExpunged()) {
                long x = eVar.mo80170x();
                C17069t tVar = new C17069t();
                tVar.f68512a = x;
                while (true) {
                    i++;
                    if (i >= messageArr.length) {
                        break;
                    }
                    C16955e eVar2 = messageArr[i];
                    if (!eVar2.isExpunged()) {
                        long x2 = eVar2.mo80170x();
                        if (x2 != 1 + x) {
                            i--;
                            break;
                        }
                        x = x2;
                    }
                }
                tVar.f68513b = x;
                arrayList.add(tVar);
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C17069t[]) arrayList.toArray(new C17069t[arrayList.size()]);
    }
}
