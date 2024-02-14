package p382rd;

import org.apache.commons.cli.HelpFormatter;
import p382rd.C16416i;

/* renamed from: rd.k */
/* compiled from: TokeniserState */
enum C16429k {
    Data {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char v = aVar.mo79102v();
            if (v == 0) {
                jVar.mo79291u(this);
                jVar.mo79281k(aVar.mo79086g());
            } else if (v == '&') {
                jVar.mo79272a(C16429k.CharacterReferenceInData);
            } else if (v == '<') {
                jVar.mo79272a(C16429k.TagOpen);
            } else if (v != 65535) {
                jVar.mo79282l(aVar.mo79088i());
            } else {
                jVar.mo79284n(new C16416i.C16422f());
            }
        }
    },
    CharacterReferenceInData {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98443n(jVar, C16429k.Data);
        }
    },
    Rcdata {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char v = aVar.mo79102v();
            if (v == 0) {
                jVar.mo79291u(this);
                aVar.mo79082a();
                jVar.mo79281k(65533);
            } else if (v == '&') {
                jVar.mo79272a(C16429k.CharacterReferenceInRcdata);
            } else if (v == '<') {
                jVar.mo79272a(C16429k.RcdataLessthanSign);
            } else if (v != 65535) {
                jVar.mo79282l(aVar.mo79088i());
            } else {
                jVar.mo79284n(new C16416i.C16422f());
            }
        }
    },
    CharacterReferenceInRcdata {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98443n(jVar, C16429k.Rcdata);
        }
    },
    Rawtext {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98445r(jVar, aVar, this, C16429k.RawtextLessthanSign);
        }
    },
    ScriptData {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98445r(jVar, aVar, this, C16429k.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char v = aVar.mo79102v();
            if (v == 0) {
                jVar.mo79291u(this);
                aVar.mo79082a();
                jVar.mo79281k(65533);
            } else if (v != 65535) {
                jVar.mo79282l(aVar.mo79095p(0));
            } else {
                jVar.mo79284n(new C16416i.C16422f());
            }
        }
    },
    TagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char v = aVar.mo79102v();
            if (v == '!') {
                jVar.mo79272a(C16429k.MarkupDeclarationOpen);
            } else if (v == '/') {
                jVar.mo79272a(C16429k.EndTagOpen);
            } else if (v == '?') {
                jVar.mo79276f();
                jVar.mo79294x(C16429k.BogusComment);
            } else if (aVar.mo79071K()) {
                jVar.mo79279i(true);
                jVar.mo79294x(C16429k.TagName);
            } else {
                jVar.mo79291u(this);
                jVar.mo79281k('<');
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    EndTagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79104x()) {
                jVar.mo79289s(this);
                jVar.mo79282l("</");
                jVar.mo79294x(C16429k.Data);
            } else if (aVar.mo79071K()) {
                jVar.mo79279i(false);
                jVar.mo79294x(C16429k.TagName);
            } else if (aVar.mo79067G('>')) {
                jVar.mo79291u(this);
                jVar.mo79272a(C16429k.Data);
            } else {
                jVar.mo79291u(this);
                jVar.mo79276f();
                jVar.f67106n.mo79240t('/');
                jVar.mo79294x(C16429k.BogusComment);
            }
        }
    },
    TagName {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            jVar.f67103k.mo79271z(aVar.mo79094o());
            char g = aVar.mo79086g();
            if (g != 0) {
                if (g != ' ') {
                    if (g != '/') {
                        if (g == '<') {
                            aVar.mo79080V();
                            jVar.mo79291u(this);
                        } else if (g != '>') {
                            if (g == 65535) {
                                jVar.mo79289s(this);
                                jVar.mo79294x(C16429k.Data);
                                return;
                            } else if (!(g == 9 || g == 10 || g == 12 || g == 13)) {
                                jVar.f67103k.mo79270y(g);
                                return;
                            }
                        }
                        jVar.mo79288r();
                        jVar.mo79294x(C16429k.Data);
                        return;
                    }
                    jVar.mo79294x(C16429k.SelfClosingStartTag);
                    return;
                }
                jVar.mo79294x(C16429k.BeforeAttributeName);
                return;
            }
            jVar.f67103k.mo79271z(C16429k.f67131I0);
        }
    },
    RcdataLessthanSign {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79067G('/')) {
                jVar.mo79280j();
                jVar.mo79272a(C16429k.RCDATAEndTagOpen);
            } else if (!aVar.mo79071K() || jVar.mo79273b() == null || aVar.mo79101u(jVar.mo79274c())) {
                jVar.mo79282l("<");
                jVar.mo79294x(C16429k.Rcdata);
            } else {
                jVar.f67103k = jVar.mo79279i(false).mo79260H(jVar.mo79273b());
                jVar.mo79288r();
                jVar.mo79294x(C16429k.TagOpen);
            }
        }
    },
    RCDATAEndTagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79071K()) {
                jVar.mo79279i(false);
                jVar.f67103k.mo79270y(aVar.mo79102v());
                jVar.f67100h.append(aVar.mo79102v());
                jVar.mo79272a(C16429k.RCDATAEndTagName);
                return;
            }
            jVar.mo79282l("</");
            jVar.mo79294x(C16429k.Rcdata);
        }
    },
    RCDATAEndTagName {
        /* renamed from: t */
        private void m98456t(C16427j jVar, C16382a aVar) {
            jVar.mo79282l("</");
            jVar.mo79283m(jVar.f67100h);
            aVar.mo79080V();
            jVar.mo79294x(C16429k.Rcdata);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79071K()) {
                String l = aVar.mo79091l();
                jVar.f67103k.mo79271z(l);
                jVar.f67100h.append(l);
                return;
            }
            char g = aVar.mo79086g();
            if (g == 9 || g == 10 || g == 12 || g == 13 || g == ' ') {
                if (jVar.mo79292v()) {
                    jVar.mo79294x(C16429k.BeforeAttributeName);
                } else {
                    m98456t(jVar, aVar);
                }
            } else if (g != '/') {
                if (g != '>') {
                    m98456t(jVar, aVar);
                } else if (jVar.mo79292v()) {
                    jVar.mo79288r();
                    jVar.mo79294x(C16429k.Data);
                } else {
                    m98456t(jVar, aVar);
                }
            } else if (jVar.mo79292v()) {
                jVar.mo79294x(C16429k.SelfClosingStartTag);
            } else {
                m98456t(jVar, aVar);
            }
        }
    },
    RawtextLessthanSign {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79067G('/')) {
                jVar.mo79280j();
                jVar.mo79272a(C16429k.RawtextEndTagOpen);
                return;
            }
            jVar.mo79281k('<');
            jVar.mo79294x(C16429k.Rawtext);
        }
    },
    RawtextEndTagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98444q(jVar, aVar, C16429k.RawtextEndTagName, C16429k.Rawtext);
        }
    },
    RawtextEndTagName {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98442l(jVar, aVar, C16429k.Rawtext);
        }
    },
    ScriptDataLessthanSign {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == '!') {
                jVar.mo79282l("<!");
                jVar.mo79294x(C16429k.ScriptDataEscapeStart);
            } else if (g == '/') {
                jVar.mo79280j();
                jVar.mo79294x(C16429k.ScriptDataEndTagOpen);
            } else if (g != 65535) {
                jVar.mo79282l("<");
                aVar.mo79080V();
                jVar.mo79294x(C16429k.ScriptData);
            } else {
                jVar.mo79282l("<");
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    ScriptDataEndTagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98444q(jVar, aVar, C16429k.ScriptDataEndTagName, C16429k.ScriptData);
        }
    },
    ScriptDataEndTagName {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98442l(jVar, aVar, C16429k.ScriptData);
        }
    },
    ScriptDataEscapeStart {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79067G('-')) {
                jVar.mo79281k('-');
                jVar.mo79272a(C16429k.ScriptDataEscapeStartDash);
                return;
            }
            jVar.mo79294x(C16429k.ScriptData);
        }
    },
    ScriptDataEscapeStartDash {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79067G('-')) {
                jVar.mo79281k('-');
                jVar.mo79272a(C16429k.ScriptDataEscapedDashDash);
                return;
            }
            jVar.mo79294x(C16429k.ScriptData);
        }
    },
    ScriptDataEscaped {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79104x()) {
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
                return;
            }
            char v = aVar.mo79102v();
            if (v == 0) {
                jVar.mo79291u(this);
                aVar.mo79082a();
                jVar.mo79281k(65533);
            } else if (v == '-') {
                jVar.mo79281k('-');
                jVar.mo79272a(C16429k.ScriptDataEscapedDash);
            } else if (v != '<') {
                jVar.mo79282l(aVar.mo79097r('-', '<', 0));
            } else {
                jVar.mo79272a(C16429k.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDash {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79104x()) {
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
                return;
            }
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.mo79281k(65533);
                jVar.mo79294x(C16429k.ScriptDataEscaped);
            } else if (g == '-') {
                jVar.mo79281k(g);
                jVar.mo79294x(C16429k.ScriptDataEscapedDashDash);
            } else if (g != '<') {
                jVar.mo79281k(g);
                jVar.mo79294x(C16429k.ScriptDataEscaped);
            } else {
                jVar.mo79294x(C16429k.ScriptDataEscapedLessthanSign);
            }
        }
    },
    ScriptDataEscapedDashDash {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79104x()) {
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
                return;
            }
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.mo79281k(65533);
                jVar.mo79294x(C16429k.ScriptDataEscaped);
            } else if (g == '-') {
                jVar.mo79281k(g);
            } else if (g == '<') {
                jVar.mo79294x(C16429k.ScriptDataEscapedLessthanSign);
            } else if (g != '>') {
                jVar.mo79281k(g);
                jVar.mo79294x(C16429k.ScriptDataEscaped);
            } else {
                jVar.mo79281k(g);
                jVar.mo79294x(C16429k.ScriptData);
            }
        }
    },
    ScriptDataEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79071K()) {
                jVar.mo79280j();
                jVar.f67100h.append(aVar.mo79102v());
                jVar.mo79282l("<");
                jVar.mo79281k(aVar.mo79102v());
                jVar.mo79272a(C16429k.ScriptDataDoubleEscapeStart);
            } else if (aVar.mo79067G('/')) {
                jVar.mo79280j();
                jVar.mo79272a(C16429k.ScriptDataEscapedEndTagOpen);
            } else {
                jVar.mo79281k('<');
                jVar.mo79294x(C16429k.ScriptDataEscaped);
            }
        }
    },
    ScriptDataEscapedEndTagOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79071K()) {
                jVar.mo79279i(false);
                jVar.f67103k.mo79270y(aVar.mo79102v());
                jVar.f67100h.append(aVar.mo79102v());
                jVar.mo79272a(C16429k.ScriptDataEscapedEndTagName);
                return;
            }
            jVar.mo79282l("</");
            jVar.mo79294x(C16429k.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98442l(jVar, aVar, C16429k.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98441k(jVar, aVar, C16429k.ScriptDataDoubleEscaped, C16429k.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char v = aVar.mo79102v();
            if (v == 0) {
                jVar.mo79291u(this);
                aVar.mo79082a();
                jVar.mo79281k(65533);
            } else if (v == '-') {
                jVar.mo79281k(v);
                jVar.mo79272a(C16429k.ScriptDataDoubleEscapedDash);
            } else if (v == '<') {
                jVar.mo79281k(v);
                jVar.mo79272a(C16429k.ScriptDataDoubleEscapedLessthanSign);
            } else if (v != 65535) {
                jVar.mo79282l(aVar.mo79097r('-', '<', 0));
            } else {
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDash {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.mo79281k(65533);
                jVar.mo79294x(C16429k.ScriptDataDoubleEscaped);
            } else if (g == '-') {
                jVar.mo79281k(g);
                jVar.mo79294x(C16429k.ScriptDataDoubleEscapedDashDash);
            } else if (g == '<') {
                jVar.mo79281k(g);
                jVar.mo79294x(C16429k.ScriptDataDoubleEscapedLessthanSign);
            } else if (g != 65535) {
                jVar.mo79281k(g);
                jVar.mo79294x(C16429k.ScriptDataDoubleEscaped);
            } else {
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    ScriptDataDoubleEscapedDashDash {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.mo79281k(65533);
                jVar.mo79294x(C16429k.ScriptDataDoubleEscaped);
            } else if (g == '-') {
                jVar.mo79281k(g);
            } else if (g == '<') {
                jVar.mo79281k(g);
                jVar.mo79294x(C16429k.ScriptDataDoubleEscapedLessthanSign);
            } else if (g == '>') {
                jVar.mo79281k(g);
                jVar.mo79294x(C16429k.ScriptData);
            } else if (g != 65535) {
                jVar.mo79281k(g);
                jVar.mo79294x(C16429k.ScriptDataDoubleEscaped);
            } else {
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79067G('/')) {
                jVar.mo79281k('/');
                jVar.mo79280j();
                jVar.mo79272a(C16429k.ScriptDataDoubleEscapeEnd);
                return;
            }
            jVar.mo79294x(C16429k.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            C16429k.m98441k(jVar, aVar, C16429k.ScriptDataEscaped, C16429k.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName {
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
            r3.mo79288r();
            r3.mo79294x(p382rd.C16429k.f67150a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo79295m(p382rd.C16427j r3, p382rd.C16382a r4) {
            /*
                r2 = this;
                char r0 = r4.mo79086g()
                if (r0 == 0) goto L_0x006d
                r1 = 32
                if (r0 == r1) goto L_0x007d
                r1 = 34
                if (r0 == r1) goto L_0x005a
                r1 = 39
                if (r0 == r1) goto L_0x005a
                r1 = 47
                if (r0 == r1) goto L_0x0054
                r1 = 65535(0xffff, float:9.1834E-41)
                if (r0 == r1) goto L_0x004b
                r1 = 9
                if (r0 == r1) goto L_0x007d
                r1 = 10
                if (r0 == r1) goto L_0x007d
                r1 = 12
                if (r0 == r1) goto L_0x007d
                r1 = 13
                if (r0 == r1) goto L_0x007d
                switch(r0) {
                    case 60: goto L_0x003c;
                    case 61: goto L_0x005a;
                    case 62: goto L_0x0042;
                    default: goto L_0x002e;
                }
            L_0x002e:
                rd.i$i r0 = r3.f67103k
                r0.mo79261I()
                r4.mo79080V()
                rd.k r4 = p382rd.C16429k.AttributeName
                r3.mo79294x(r4)
                goto L_0x007d
            L_0x003c:
                r4.mo79080V()
                r3.mo79291u(r2)
            L_0x0042:
                r3.mo79288r()
                rd.k r4 = p382rd.C16429k.Data
                r3.mo79294x(r4)
                goto L_0x007d
            L_0x004b:
                r3.mo79289s(r2)
                rd.k r4 = p382rd.C16429k.Data
                r3.mo79294x(r4)
                goto L_0x007d
            L_0x0054:
                rd.k r4 = p382rd.C16429k.SelfClosingStartTag
                r3.mo79294x(r4)
                goto L_0x007d
            L_0x005a:
                r3.mo79291u(r2)
                rd.i$i r4 = r3.f67103k
                r4.mo79261I()
                rd.i$i r4 = r3.f67103k
                r4.mo79265t(r0)
                rd.k r4 = p382rd.C16429k.AttributeName
                r3.mo79294x(r4)
                goto L_0x007d
            L_0x006d:
                r4.mo79080V()
                r3.mo79291u(r2)
                rd.i$i r4 = r3.f67103k
                r4.mo79261I()
                rd.k r4 = p382rd.C16429k.AttributeName
                r3.mo79294x(r4)
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p382rd.C16429k.C16431a0.mo79295m(rd.j, rd.a):void");
        }
    },
    AttributeName {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            jVar.f67103k.mo79266u(aVar.mo79098s(C16429k.f67127G0));
            char g = aVar.mo79086g();
            if (g == 9 || g == 10 || g == 12 || g == 13 || g == ' ') {
                jVar.mo79294x(C16429k.AfterAttributeName);
                return;
            }
            if (!(g == '\"' || g == '\'')) {
                if (g == '/') {
                    jVar.mo79294x(C16429k.SelfClosingStartTag);
                    return;
                } else if (g != 65535) {
                    switch (g) {
                        case '<':
                            break;
                        case '=':
                            jVar.mo79294x(C16429k.BeforeAttributeValue);
                            return;
                        case '>':
                            jVar.mo79288r();
                            jVar.mo79294x(C16429k.Data);
                            return;
                        default:
                            jVar.f67103k.mo79265t(g);
                            return;
                    }
                } else {
                    jVar.mo79289s(this);
                    jVar.mo79294x(C16429k.Data);
                    return;
                }
            }
            jVar.mo79291u(this);
            jVar.f67103k.mo79265t(g);
        }
    },
    AfterAttributeName {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67103k.mo79265t(65533);
                jVar.mo79294x(C16429k.AttributeName);
            } else if (g != ' ') {
                if (!(g == '\"' || g == '\'')) {
                    if (g == '/') {
                        jVar.mo79294x(C16429k.SelfClosingStartTag);
                        return;
                    } else if (g == 65535) {
                        jVar.mo79289s(this);
                        jVar.mo79294x(C16429k.Data);
                        return;
                    } else if (g != 9 && g != 10 && g != 12 && g != 13) {
                        switch (g) {
                            case '<':
                                break;
                            case '=':
                                jVar.mo79294x(C16429k.BeforeAttributeValue);
                                return;
                            case '>':
                                jVar.mo79288r();
                                jVar.mo79294x(C16429k.Data);
                                return;
                            default:
                                jVar.f67103k.mo79261I();
                                aVar.mo79080V();
                                jVar.mo79294x(C16429k.AttributeName);
                                return;
                        }
                    } else {
                        return;
                    }
                }
                jVar.mo79291u(this);
                jVar.f67103k.mo79261I();
                jVar.f67103k.mo79265t(g);
                jVar.mo79294x(C16429k.AttributeName);
            }
        }
    },
    BeforeAttributeValue {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67103k.mo79267v(65533);
                jVar.mo79294x(C16429k.AttributeValue_unquoted);
            } else if (g == ' ') {
            } else {
                if (g != '\"') {
                    if (g != '`') {
                        if (g == 65535) {
                            jVar.mo79289s(this);
                            jVar.mo79288r();
                            jVar.mo79294x(C16429k.Data);
                            return;
                        } else if (g != 9 && g != 10 && g != 12 && g != 13) {
                            if (g == '&') {
                                aVar.mo79080V();
                                jVar.mo79294x(C16429k.AttributeValue_unquoted);
                                return;
                            } else if (g != '\'') {
                                switch (g) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        jVar.mo79291u(this);
                                        jVar.mo79288r();
                                        jVar.mo79294x(C16429k.Data);
                                        return;
                                    default:
                                        aVar.mo79080V();
                                        jVar.mo79294x(C16429k.AttributeValue_unquoted);
                                        return;
                                }
                            } else {
                                jVar.mo79294x(C16429k.AttributeValue_singleQuoted);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    jVar.mo79291u(this);
                    jVar.f67103k.mo79267v(g);
                    jVar.mo79294x(C16429k.AttributeValue_unquoted);
                    return;
                }
                jVar.mo79294x(C16429k.AttributeValue_doubleQuoted);
            }
        }
    },
    AttributeValue_doubleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            String h = aVar.mo79087h(false);
            if (h.length() > 0) {
                jVar.f67103k.mo79268w(h);
            } else {
                jVar.f67103k.mo79263L();
            }
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67103k.mo79267v(65533);
            } else if (g == '\"') {
                jVar.mo79294x(C16429k.AfterAttributeValue_quoted);
            } else if (g == '&') {
                int[] e = jVar.mo79275e('\"', true);
                if (e != null) {
                    jVar.f67103k.mo79269x(e);
                } else {
                    jVar.f67103k.mo79267v('&');
                }
            } else if (g != 65535) {
                jVar.f67103k.mo79267v(g);
            } else {
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    AttributeValue_singleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            String h = aVar.mo79087h(true);
            if (h.length() > 0) {
                jVar.f67103k.mo79268w(h);
            } else {
                jVar.f67103k.mo79263L();
            }
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67103k.mo79267v(65533);
            } else if (g == 65535) {
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
            } else if (g == '&') {
                int[] e = jVar.mo79275e('\'', true);
                if (e != null) {
                    jVar.f67103k.mo79269x(e);
                } else {
                    jVar.f67103k.mo79267v('&');
                }
            } else if (g != '\'') {
                jVar.f67103k.mo79267v(g);
            } else {
                jVar.mo79294x(C16429k.AfterAttributeValue_quoted);
            }
        }
    },
    AttributeValue_unquoted {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            String s = aVar.mo79098s(C16429k.f67129H0);
            if (s.length() > 0) {
                jVar.f67103k.mo79268w(s);
            }
            char g = aVar.mo79086g();
            if (g != 0) {
                if (g != ' ') {
                    if (!(g == '\"' || g == '`')) {
                        if (g == 65535) {
                            jVar.mo79289s(this);
                            jVar.mo79294x(C16429k.Data);
                            return;
                        } else if (!(g == 9 || g == 10 || g == 12 || g == 13)) {
                            if (g == '&') {
                                int[] e = jVar.mo79275e('>', true);
                                if (e != null) {
                                    jVar.f67103k.mo79269x(e);
                                    return;
                                } else {
                                    jVar.f67103k.mo79267v('&');
                                    return;
                                }
                            } else if (g != '\'') {
                                switch (g) {
                                    case '<':
                                    case '=':
                                        break;
                                    case '>':
                                        jVar.mo79288r();
                                        jVar.mo79294x(C16429k.Data);
                                        return;
                                    default:
                                        jVar.f67103k.mo79267v(g);
                                        return;
                                }
                            }
                        }
                    }
                    jVar.mo79291u(this);
                    jVar.f67103k.mo79267v(g);
                    return;
                }
                jVar.mo79294x(C16429k.BeforeAttributeName);
                return;
            }
            jVar.mo79291u(this);
            jVar.f67103k.mo79267v(65533);
        }
    },
    AfterAttributeValue_quoted {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 9 || g == 10 || g == 12 || g == 13 || g == ' ') {
                jVar.mo79294x(C16429k.BeforeAttributeName);
            } else if (g == '/') {
                jVar.mo79294x(C16429k.SelfClosingStartTag);
            } else if (g == '>') {
                jVar.mo79288r();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                aVar.mo79080V();
                jVar.mo79291u(this);
                jVar.mo79294x(C16429k.BeforeAttributeName);
            } else {
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    SelfClosingStartTag {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == '>') {
                jVar.f67103k.f67082m = true;
                jVar.mo79288r();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                aVar.mo79080V();
                jVar.mo79291u(this);
                jVar.mo79294x(C16429k.BeforeAttributeName);
            } else {
                jVar.mo79289s(this);
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    BogusComment {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            jVar.f67106n.mo79242u(aVar.mo79095p('>'));
            char v = aVar.mo79102v();
            if (v == '>' || v == 65535) {
                aVar.mo79086g();
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    MarkupDeclarationOpen {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79065E(HelpFormatter.DEFAULT_LONG_OPT_PREFIX)) {
                jVar.mo79277g();
                jVar.mo79294x(C16429k.CommentStart);
            } else if (aVar.mo79066F("DOCTYPE")) {
                jVar.mo79294x(C16429k.Doctype);
            } else if (aVar.mo79065E("[CDATA[")) {
                jVar.mo79280j();
                jVar.mo79294x(C16429k.CdataSection);
            } else {
                jVar.mo79291u(this);
                jVar.mo79276f();
                jVar.mo79294x(C16429k.BogusComment);
            }
        }
    },
    CommentStart {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67106n.mo79240t(65533);
                jVar.mo79294x(C16429k.Comment);
            } else if (g == '-') {
                jVar.mo79294x(C16429k.CommentStartDash);
            } else if (g == '>') {
                jVar.mo79291u(this);
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                aVar.mo79080V();
                jVar.mo79294x(C16429k.Comment);
            } else {
                jVar.mo79289s(this);
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    CommentStartDash {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67106n.mo79240t(65533);
                jVar.mo79294x(C16429k.Comment);
            } else if (g == '-') {
                jVar.mo79294x(C16429k.CommentEnd);
            } else if (g == '>') {
                jVar.mo79291u(this);
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                jVar.f67106n.mo79240t(g);
                jVar.mo79294x(C16429k.Comment);
            } else {
                jVar.mo79289s(this);
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    Comment {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char v = aVar.mo79102v();
            if (v == 0) {
                jVar.mo79291u(this);
                aVar.mo79082a();
                jVar.f67106n.mo79240t(65533);
            } else if (v == '-') {
                jVar.mo79272a(C16429k.CommentEndDash);
            } else if (v != 65535) {
                jVar.f67106n.mo79242u(aVar.mo79097r('-', 0));
            } else {
                jVar.mo79289s(this);
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    CommentEndDash {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67106n.mo79240t('-').mo79240t(65533);
                jVar.mo79294x(C16429k.Comment);
            } else if (g == '-') {
                jVar.mo79294x(C16429k.CommentEnd);
            } else if (g != 65535) {
                jVar.f67106n.mo79240t('-').mo79240t(g);
                jVar.mo79294x(C16429k.Comment);
            } else {
                jVar.mo79289s(this);
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    CommentEnd {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67106n.mo79242u(HelpFormatter.DEFAULT_LONG_OPT_PREFIX).mo79240t(65533);
                jVar.mo79294x(C16429k.Comment);
            } else if (g == '!') {
                jVar.mo79294x(C16429k.CommentEndBang);
            } else if (g == '-') {
                jVar.f67106n.mo79240t('-');
            } else if (g == '>') {
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                jVar.f67106n.mo79242u(HelpFormatter.DEFAULT_LONG_OPT_PREFIX).mo79240t(g);
                jVar.mo79294x(C16429k.Comment);
            } else {
                jVar.mo79289s(this);
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    CommentEndBang {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67106n.mo79242u("--!").mo79240t(65533);
                jVar.mo79294x(C16429k.Comment);
            } else if (g == '-') {
                jVar.f67106n.mo79242u("--!");
                jVar.mo79294x(C16429k.CommentEndDash);
            } else if (g == '>') {
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                jVar.f67106n.mo79242u("--!").mo79240t(g);
                jVar.mo79294x(C16429k.Comment);
            } else {
                jVar.mo79289s(this);
                jVar.mo79286p();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    Doctype {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 9 || g == 10 || g == 12 || g == 13 || g == ' ') {
                jVar.mo79294x(C16429k.BeforeDoctypeName);
                return;
            }
            if (g != '>') {
                if (g != 65535) {
                    jVar.mo79291u(this);
                    jVar.mo79294x(C16429k.BeforeDoctypeName);
                    return;
                }
                jVar.mo79289s(this);
            }
            jVar.mo79291u(this);
            jVar.mo79278h();
            jVar.f67105m.f67072h = true;
            jVar.mo79287q();
            jVar.mo79294x(C16429k.Data);
        }
    },
    BeforeDoctypeName {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79071K()) {
                jVar.mo79278h();
                jVar.mo79294x(C16429k.DoctypeName);
                return;
            }
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.mo79278h();
                jVar.f67105m.f67068d.append(65533);
                jVar.mo79294x(C16429k.DoctypeName);
            } else if (g == ' ') {
            } else {
                if (g == 65535) {
                    jVar.mo79289s(this);
                    jVar.mo79278h();
                    jVar.f67105m.f67072h = true;
                    jVar.mo79287q();
                    jVar.mo79294x(C16429k.Data);
                } else if (g != 9 && g != 10 && g != 12 && g != 13) {
                    jVar.mo79278h();
                    jVar.f67105m.f67068d.append(g);
                    jVar.mo79294x(C16429k.DoctypeName);
                }
            }
        }
    },
    DoctypeName {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79074N()) {
                jVar.f67105m.f67068d.append(aVar.mo79091l());
                return;
            }
            char g = aVar.mo79086g();
            if (g != 0) {
                if (g != ' ') {
                    if (g == '>') {
                        jVar.mo79287q();
                        jVar.mo79294x(C16429k.Data);
                        return;
                    } else if (g == 65535) {
                        jVar.mo79289s(this);
                        jVar.f67105m.f67072h = true;
                        jVar.mo79287q();
                        jVar.mo79294x(C16429k.Data);
                        return;
                    } else if (!(g == 9 || g == 10 || g == 12 || g == 13)) {
                        jVar.f67105m.f67068d.append(g);
                        return;
                    }
                }
                jVar.mo79294x(C16429k.AfterDoctypeName);
                return;
            }
            jVar.mo79291u(this);
            jVar.f67105m.f67068d.append(65533);
        }
    },
    AfterDoctypeName {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            if (aVar.mo79104x()) {
                jVar.mo79289s(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            } else if (aVar.mo79069I(9, 10, 13, 12, ' ')) {
                aVar.mo79082a();
            } else if (aVar.mo79067G('>')) {
                jVar.mo79287q();
                jVar.mo79272a(C16429k.Data);
            } else if (aVar.mo79066F("PUBLIC")) {
                jVar.f67105m.f67069e = "PUBLIC";
                jVar.mo79294x(C16429k.AfterDoctypePublicKeyword);
            } else if (aVar.mo79066F("SYSTEM")) {
                jVar.f67105m.f67069e = "SYSTEM";
                jVar.mo79294x(C16429k.AfterDoctypeSystemKeyword);
            } else {
                jVar.mo79291u(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79272a(C16429k.BogusDoctype);
            }
        }
    },
    AfterDoctypePublicKeyword {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 9 || g == 10 || g == 12 || g == 13 || g == ' ') {
                jVar.mo79294x(C16429k.BeforeDoctypePublicIdentifier);
            } else if (g == '\"') {
                jVar.mo79291u(this);
                jVar.mo79294x(C16429k.DoctypePublicIdentifier_doubleQuoted);
            } else if (g == '\'') {
                jVar.mo79291u(this);
                jVar.mo79294x(C16429k.DoctypePublicIdentifier_singleQuoted);
            } else if (g == '>') {
                jVar.mo79291u(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                jVar.mo79291u(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79294x(C16429k.BogusDoctype);
            } else {
                jVar.mo79289s(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    BeforeDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g != 9 && g != 10 && g != 12 && g != 13 && g != ' ') {
                if (g == '\"') {
                    jVar.mo79294x(C16429k.DoctypePublicIdentifier_doubleQuoted);
                } else if (g == '\'') {
                    jVar.mo79294x(C16429k.DoctypePublicIdentifier_singleQuoted);
                } else if (g == '>') {
                    jVar.mo79291u(this);
                    jVar.f67105m.f67072h = true;
                    jVar.mo79287q();
                    jVar.mo79294x(C16429k.Data);
                } else if (g != 65535) {
                    jVar.mo79291u(this);
                    jVar.f67105m.f67072h = true;
                    jVar.mo79294x(C16429k.BogusDoctype);
                } else {
                    jVar.mo79289s(this);
                    jVar.f67105m.f67072h = true;
                    jVar.mo79287q();
                    jVar.mo79294x(C16429k.Data);
                }
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67105m.f67070f.append(65533);
            } else if (g == '\"') {
                jVar.mo79294x(C16429k.AfterDoctypePublicIdentifier);
            } else if (g == '>') {
                jVar.mo79291u(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                jVar.f67105m.f67070f.append(g);
            } else {
                jVar.mo79289s(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67105m.f67070f.append(65533);
            } else if (g == '\'') {
                jVar.mo79294x(C16429k.AfterDoctypePublicIdentifier);
            } else if (g == '>') {
                jVar.mo79291u(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                jVar.f67105m.f67070f.append(g);
            } else {
                jVar.mo79289s(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    AfterDoctypePublicIdentifier {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 9 || g == 10 || g == 12 || g == 13 || g == ' ') {
                jVar.mo79294x(C16429k.BetweenDoctypePublicAndSystemIdentifiers);
            } else if (g == '\"') {
                jVar.mo79291u(this);
                jVar.mo79294x(C16429k.DoctypeSystemIdentifier_doubleQuoted);
            } else if (g == '\'') {
                jVar.mo79291u(this);
                jVar.mo79294x(C16429k.DoctypeSystemIdentifier_singleQuoted);
            } else if (g == '>') {
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                jVar.mo79291u(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79294x(C16429k.BogusDoctype);
            } else {
                jVar.mo79289s(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g != 9 && g != 10 && g != 12 && g != 13 && g != ' ') {
                if (g == '\"') {
                    jVar.mo79291u(this);
                    jVar.mo79294x(C16429k.DoctypeSystemIdentifier_doubleQuoted);
                } else if (g == '\'') {
                    jVar.mo79291u(this);
                    jVar.mo79294x(C16429k.DoctypeSystemIdentifier_singleQuoted);
                } else if (g == '>') {
                    jVar.mo79287q();
                    jVar.mo79294x(C16429k.Data);
                } else if (g != 65535) {
                    jVar.mo79291u(this);
                    jVar.f67105m.f67072h = true;
                    jVar.mo79294x(C16429k.BogusDoctype);
                } else {
                    jVar.mo79289s(this);
                    jVar.f67105m.f67072h = true;
                    jVar.mo79287q();
                    jVar.mo79294x(C16429k.Data);
                }
            }
        }
    },
    AfterDoctypeSystemKeyword {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 9 || g == 10 || g == 12 || g == 13 || g == ' ') {
                jVar.mo79294x(C16429k.BeforeDoctypeSystemIdentifier);
            } else if (g == '\"') {
                jVar.mo79291u(this);
                jVar.mo79294x(C16429k.DoctypeSystemIdentifier_doubleQuoted);
            } else if (g == '\'') {
                jVar.mo79291u(this);
                jVar.mo79294x(C16429k.DoctypeSystemIdentifier_singleQuoted);
            } else if (g == '>') {
                jVar.mo79291u(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                jVar.mo79291u(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
            } else {
                jVar.mo79289s(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    BeforeDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g != 9 && g != 10 && g != 12 && g != 13 && g != ' ') {
                if (g == '\"') {
                    jVar.mo79294x(C16429k.DoctypeSystemIdentifier_doubleQuoted);
                } else if (g == '\'') {
                    jVar.mo79294x(C16429k.DoctypeSystemIdentifier_singleQuoted);
                } else if (g == '>') {
                    jVar.mo79291u(this);
                    jVar.f67105m.f67072h = true;
                    jVar.mo79287q();
                    jVar.mo79294x(C16429k.Data);
                } else if (g != 65535) {
                    jVar.mo79291u(this);
                    jVar.f67105m.f67072h = true;
                    jVar.mo79294x(C16429k.BogusDoctype);
                } else {
                    jVar.mo79289s(this);
                    jVar.f67105m.f67072h = true;
                    jVar.mo79287q();
                    jVar.mo79294x(C16429k.Data);
                }
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67105m.f67071g.append(65533);
            } else if (g == '\"') {
                jVar.mo79294x(C16429k.AfterDoctypeSystemIdentifier);
            } else if (g == '>') {
                jVar.mo79291u(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                jVar.f67105m.f67071g.append(g);
            } else {
                jVar.mo79289s(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == 0) {
                jVar.mo79291u(this);
                jVar.f67105m.f67071g.append(65533);
            } else if (g == '\'') {
                jVar.mo79294x(C16429k.AfterDoctypeSystemIdentifier);
            } else if (g == '>') {
                jVar.mo79291u(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            } else if (g != 65535) {
                jVar.f67105m.f67071g.append(g);
            } else {
                jVar.mo79289s(this);
                jVar.f67105m.f67072h = true;
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    AfterDoctypeSystemIdentifier {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g != 9 && g != 10 && g != 12 && g != 13 && g != ' ') {
                if (g == '>') {
                    jVar.mo79287q();
                    jVar.mo79294x(C16429k.Data);
                } else if (g != 65535) {
                    jVar.mo79291u(this);
                    jVar.mo79294x(C16429k.BogusDoctype);
                } else {
                    jVar.mo79289s(this);
                    jVar.f67105m.f67072h = true;
                    jVar.mo79287q();
                    jVar.mo79294x(C16429k.Data);
                }
            }
        }
    },
    BogusDoctype {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            char g = aVar.mo79086g();
            if (g == '>') {
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            } else if (g == 65535) {
                jVar.mo79287q();
                jVar.mo79294x(C16429k.Data);
            }
        }
    },
    CdataSection {
        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo79295m(C16427j jVar, C16382a aVar) {
            jVar.f67100h.append(aVar.mo79096q("]]>"));
            if (aVar.mo79065E("]]>") || aVar.mo79104x()) {
                jVar.mo79284n(new C16416i.C16418b(jVar.f67100h.toString()));
                jVar.mo79294x(C16429k.Data);
            }
        }
    };
    

    /* renamed from: G0 */
    static final char[] f67127G0 = null;

    /* renamed from: H0 */
    static final char[] f67129H0 = null;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public static final String f67131I0 = null;

    static {
        f67127G0 = new char[]{9, 10, 12, 13, ' ', '\"', '\'', '/', '<', '=', '>'};
        f67129H0 = new char[]{0, 9, 10, 12, 13, ' ', '\"', '&', '\'', '<', '=', '>', '`'};
        f67131I0 = String.valueOf(65533);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static void m98441k(C16427j jVar, C16382a aVar, C16429k kVar, C16429k kVar2) {
        if (aVar.mo79074N()) {
            String l = aVar.mo79091l();
            jVar.f67100h.append(l);
            jVar.mo79282l(l);
            return;
        }
        char g = aVar.mo79086g();
        if (g == 9 || g == 10 || g == 12 || g == 13 || g == ' ' || g == '/' || g == '>') {
            if (jVar.f67100h.toString().equals("script")) {
                jVar.mo79294x(kVar);
            } else {
                jVar.mo79294x(kVar2);
            }
            jVar.mo79281k(g);
            return;
        }
        aVar.mo79080V();
        jVar.mo79294x(kVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m98442l(C16427j jVar, C16382a aVar, C16429k kVar) {
        if (aVar.mo79074N()) {
            String l = aVar.mo79091l();
            jVar.f67103k.mo79271z(l);
            jVar.f67100h.append(l);
            return;
        }
        boolean z = false;
        boolean z2 = true;
        if (jVar.mo79292v() && !aVar.mo79104x()) {
            char g = aVar.mo79086g();
            if (g == 9 || g == 10 || g == 12 || g == 13 || g == ' ') {
                jVar.mo79294x(BeforeAttributeName);
            } else if (g == '/') {
                jVar.mo79294x(SelfClosingStartTag);
            } else if (g != '>') {
                jVar.f67100h.append(g);
                z = true;
            } else {
                jVar.mo79288r();
                jVar.mo79294x(Data);
            }
            z2 = z;
        }
        if (z2) {
            jVar.mo79282l("</");
            jVar.mo79283m(jVar.f67100h);
            jVar.mo79294x(kVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m98443n(C16427j jVar, C16429k kVar) {
        int[] e = jVar.mo79275e((Character) null, false);
        if (e == null) {
            jVar.mo79281k('&');
        } else {
            jVar.mo79285o(e);
        }
        jVar.mo79294x(kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static void m98444q(C16427j jVar, C16382a aVar, C16429k kVar, C16429k kVar2) {
        if (aVar.mo79071K()) {
            jVar.mo79279i(false);
            jVar.mo79294x(kVar);
            return;
        }
        jVar.mo79282l("</");
        jVar.mo79294x(kVar2);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static void m98445r(C16427j jVar, C16382a aVar, C16429k kVar, C16429k kVar2) {
        char v = aVar.mo79102v();
        if (v == 0) {
            jVar.mo79291u(kVar);
            aVar.mo79082a();
            jVar.mo79281k(65533);
        } else if (v == '<') {
            jVar.mo79272a(kVar2);
        } else if (v != 65535) {
            jVar.mo79282l(aVar.mo79093n());
        } else {
            jVar.mo79284n(new C16416i.C16422f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract void mo79295m(C16427j jVar, C16382a aVar);
}
