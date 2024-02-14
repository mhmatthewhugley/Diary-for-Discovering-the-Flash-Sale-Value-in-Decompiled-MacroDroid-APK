package p382rd;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.p353io.FilenameUtils;
import org.apache.commons.p353io.IOUtils;
import p364pd.C16171b;
import p373qd.C16282a;
import p373qd.C16283b;
import p373qd.C16288f;
import p373qd.C16292g;
import p373qd.C16293h;
import p373qd.C16301k;
import p382rd.C16416i;

/* renamed from: rd.c */
/* compiled from: HtmlTreeBuilderState */
enum C16384c {
    Initial {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (C16384c.m98278m(iVar)) {
                return true;
            }
            if (iVar.mo79228j()) {
                bVar.mo79148Z(iVar.mo79220b());
            } else if (iVar.mo79229k()) {
                C16416i.C16421e c = iVar.mo79221c();
                C16292g gVar = new C16292g(bVar.f67192h.mo79196d(c.mo79244t()), c.mo79247v(), c.mo79248w());
                gVar.mo78852a0(c.mo79246u());
                bVar.mo79118G().mo78862Y(gVar);
                bVar.mo79300g(gVar, iVar);
                if (c.mo79249x()) {
                    bVar.mo79118G().mo78837Q0(C16288f.C16291b.quirks);
                }
                bVar.mo79144U0(C16384c.BeforeHtml);
            } else {
                bVar.mo79144U0(C16384c.BeforeHtml);
                return bVar.mo79158i(iVar);
            }
            return true;
        }
    },
    BeforeHtml {
        /* renamed from: q */
        private boolean m98304q(C16416i iVar, C16383b bVar) {
            bVar.mo79156g0("html");
            bVar.mo79144U0(C16384c.BeforeHead);
            return bVar.mo79158i(iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (iVar.mo79229k()) {
                bVar.mo79183y(this);
                return false;
            } else if (iVar.mo79228j()) {
                bVar.mo79148Z(iVar.mo79220b());
                return true;
            } else if (C16384c.m98278m(iVar)) {
                bVar.mo79147Y(iVar.mo79219a());
                return true;
            } else if (iVar.mo79232n() && iVar.mo79223e().mo79262J().equals("html")) {
                bVar.mo79145V(iVar.mo79223e());
                bVar.mo79144U0(C16384c.BeforeHead);
                return true;
            } else if (iVar.mo79231m() && C16171b.m97073d(iVar.mo79222d().mo79262J(), C16410z.f67011e)) {
                return m98304q(iVar, bVar);
            } else {
                if (!iVar.mo79231m()) {
                    return m98304q(iVar, bVar);
                }
                bVar.mo79183y(this);
                return false;
            }
        }
    },
    BeforeHead {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (C16384c.m98278m(iVar)) {
                bVar.mo79147Y(iVar.mo79219a());
                return true;
            } else if (iVar.mo79228j()) {
                bVar.mo79148Z(iVar.mo79220b());
                return true;
            } else if (iVar.mo79229k()) {
                bVar.mo79183y(this);
                return false;
            } else if (iVar.mo79232n() && iVar.mo79223e().mo79262J().equals("html")) {
                return C16384c.InBody.mo79187n(iVar, bVar);
            } else {
                if (iVar.mo79232n() && iVar.mo79223e().mo79262J().equals("head")) {
                    bVar.mo79140R0(bVar.mo79145V(iVar.mo79223e()));
                    bVar.mo79144U0(C16384c.InHead);
                    return true;
                } else if (iVar.mo79231m() && C16171b.m97073d(iVar.mo79222d().mo79262J(), C16410z.f67011e)) {
                    bVar.mo79303k("head");
                    return bVar.mo79158i(iVar);
                } else if (iVar.mo79231m()) {
                    bVar.mo79183y(this);
                    return false;
                } else {
                    bVar.mo79303k("head");
                    return bVar.mo79158i(iVar);
                }
            }
        }
    },
    InHead {
        /* renamed from: q */
        private boolean m98307q(C16416i iVar, C16497l lVar) {
            lVar.mo79302j("head");
            return lVar.mo79158i(iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (C16384c.m98278m(iVar)) {
                bVar.mo79147Y(iVar.mo79219a());
                return true;
            }
            int i = C16401q.f66994a[iVar.f67061a.ordinal()];
            if (i == 1) {
                bVar.mo79148Z(iVar.mo79220b());
            } else if (i == 2) {
                bVar.mo79183y(this);
                return false;
            } else if (i == 3) {
                C16416i.C16424h e = iVar.mo79223e();
                String J = e.mo79262J();
                if (J.equals("html")) {
                    return C16384c.InBody.mo79187n(iVar, bVar);
                }
                if (C16171b.m97073d(J, C16410z.f67007a)) {
                    C16293h a0 = bVar.mo79149a0(e);
                    if (J.equals("base") && a0.mo78912s("href")) {
                        bVar.mo79167p0(a0);
                    }
                } else if (J.equals("meta")) {
                    bVar.mo79149a0(e);
                } else if (J.equals("title")) {
                    C16384c.m98276k(e, bVar);
                } else if (C16171b.m97073d(J, C16410z.f67008b)) {
                    C16384c.m98275j(e, bVar);
                } else if (J.equals("noscript")) {
                    bVar.mo79145V(e);
                    bVar.mo79144U0(C16384c.InHeadNoscript);
                } else if (J.equals("script")) {
                    bVar.f67187c.mo79294x(C16429k.ScriptData);
                    bVar.mo79165o0();
                    bVar.mo79144U0(C16384c.f66992s);
                    bVar.mo79145V(e);
                } else if (J.equals("head")) {
                    bVar.mo79183y(this);
                    return false;
                } else if (!J.equals("template")) {
                    return m98307q(iVar, bVar);
                } else {
                    bVar.mo79145V(e);
                    bVar.mo79153d0();
                    bVar.mo79185z(false);
                    C16384c cVar = C16384c.InTemplate;
                    bVar.mo79144U0(cVar);
                    bVar.mo79115E0(cVar);
                }
            } else if (i != 4) {
                return m98307q(iVar, bVar);
            } else {
                String J2 = iVar.mo79222d().mo79262J();
                if (J2.equals("head")) {
                    bVar.mo79178v0();
                    bVar.mo79144U0(C16384c.AfterHead);
                } else if (C16171b.m97073d(J2, C16410z.f67009c)) {
                    return m98307q(iVar, bVar);
                } else {
                    if (!J2.equals("template")) {
                        bVar.mo79183y(this);
                        return false;
                    } else if (!bVar.mo79171r0(J2)) {
                        bVar.mo79183y(this);
                    } else {
                        bVar.mo79112D(true);
                        if (!J2.equals(bVar.mo79296a().mo78885z0())) {
                            bVar.mo79183y(this);
                        }
                        bVar.mo79182x0(J2);
                        bVar.mo79170r();
                        bVar.mo79186z0();
                        bVar.mo79134O0();
                    }
                }
            }
            return true;
        }
    },
    InHeadNoscript {
        /* renamed from: q */
        private boolean m98309q(C16416i iVar, C16383b bVar) {
            bVar.mo79183y(this);
            bVar.mo79147Y(new C16416i.C16419c().mo79238t(iVar.toString()));
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (iVar.mo79229k()) {
                bVar.mo79183y(this);
                return true;
            } else if (iVar.mo79232n() && iVar.mo79223e().mo79262J().equals("html")) {
                return bVar.mo79109B0(iVar, C16384c.InBody);
            } else {
                if (iVar.mo79231m() && iVar.mo79222d().mo79262J().equals("noscript")) {
                    bVar.mo79178v0();
                    bVar.mo79144U0(C16384c.InHead);
                    return true;
                } else if (C16384c.m98278m(iVar) || iVar.mo79228j() || (iVar.mo79232n() && C16171b.m97073d(iVar.mo79223e().mo79262J(), C16410z.f67012f))) {
                    return bVar.mo79109B0(iVar, C16384c.InHead);
                } else {
                    if (iVar.mo79231m() && iVar.mo79222d().mo79262J().equals("br")) {
                        return m98309q(iVar, bVar);
                    }
                    if ((!iVar.mo79232n() || !C16171b.m97073d(iVar.mo79223e().mo79262J(), C16410z.f67003I)) && !iVar.mo79231m()) {
                        return m98309q(iVar, bVar);
                    }
                    bVar.mo79183y(this);
                    return false;
                }
            }
        }
    },
    AfterHead {
        /* renamed from: q */
        private boolean m98311q(C16416i iVar, C16383b bVar) {
            bVar.mo79303k("body");
            bVar.mo79185z(true);
            return bVar.mo79158i(iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (C16384c.m98278m(iVar)) {
                bVar.mo79147Y(iVar.mo79219a());
                return true;
            } else if (iVar.mo79228j()) {
                bVar.mo79148Z(iVar.mo79220b());
                return true;
            } else if (iVar.mo79229k()) {
                bVar.mo79183y(this);
                return true;
            } else if (iVar.mo79232n()) {
                C16416i.C16424h e = iVar.mo79223e();
                String J = e.mo79262J();
                if (J.equals("html")) {
                    return bVar.mo79109B0(iVar, C16384c.InBody);
                }
                if (J.equals("body")) {
                    bVar.mo79145V(e);
                    bVar.mo79185z(false);
                    bVar.mo79144U0(C16384c.InBody);
                    return true;
                } else if (J.equals("frameset")) {
                    bVar.mo79145V(e);
                    bVar.mo79144U0(C16384c.InFrameset);
                    return true;
                } else if (C16171b.m97073d(J, C16410z.f67013g)) {
                    bVar.mo79183y(this);
                    C16293h J2 = bVar.mo79124J();
                    bVar.mo79111C0(J2);
                    bVar.mo79109B0(iVar, C16384c.InHead);
                    bVar.mo79123I0(J2);
                    return true;
                } else if (J.equals("head")) {
                    bVar.mo79183y(this);
                    return false;
                } else {
                    m98311q(iVar, bVar);
                    return true;
                }
            } else if (iVar.mo79231m()) {
                String J3 = iVar.mo79222d().mo79262J();
                if (C16171b.m97073d(J3, C16410z.f67010d)) {
                    m98311q(iVar, bVar);
                    return true;
                } else if (J3.equals("template")) {
                    bVar.mo79109B0(iVar, C16384c.InHead);
                    return true;
                } else {
                    bVar.mo79183y(this);
                    return false;
                }
            } else {
                m98311q(iVar, bVar);
                return true;
            }
        }
    },
    InBody {
        /* renamed from: r */
        private boolean m98313r(C16416i iVar, C16383b bVar) {
            C16416i.C16423g d = iVar.mo79222d();
            String J = d.mo79262J();
            J.hashCode();
            char c = 65535;
            switch (J.hashCode()) {
                case -1321546630:
                    if (J.equals("template")) {
                        c = 0;
                        break;
                    }
                    break;
                case 112:
                    if (J.equals("p")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3152:
                    if (J.equals("br")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3200:
                    if (J.equals("dd")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3216:
                    if (J.equals("dt")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3273:
                    if (J.equals("h1")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3274:
                    if (J.equals("h2")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3275:
                    if (J.equals("h3")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3276:
                    if (J.equals("h4")) {
                        c = 8;
                        break;
                    }
                    break;
                case 3277:
                    if (J.equals("h5")) {
                        c = 9;
                        break;
                    }
                    break;
                case 3278:
                    if (J.equals("h6")) {
                        c = 10;
                        break;
                    }
                    break;
                case 3453:
                    if (J.equals("li")) {
                        c = 11;
                        break;
                    }
                    break;
                case 3029410:
                    if (J.equals("body")) {
                        c = 12;
                        break;
                    }
                    break;
                case 3148996:
                    if (J.equals("form")) {
                        c = 13;
                        break;
                    }
                    break;
                case 3213227:
                    if (J.equals("html")) {
                        c = 14;
                        break;
                    }
                    break;
                case 3536714:
                    if (J.equals("span")) {
                        c = 15;
                        break;
                    }
                    break;
                case 1869063452:
                    if (J.equals("sarcasm")) {
                        c = 16;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    bVar.mo79109B0(iVar, C16384c.InHead);
                    break;
                case 1:
                    if (bVar.mo79129M(J)) {
                        bVar.mo79110C(J);
                        if (!bVar.mo79297b(J)) {
                            bVar.mo79183y(this);
                        }
                        bVar.mo79182x0(J);
                        break;
                    } else {
                        bVar.mo79183y(this);
                        bVar.mo79303k(J);
                        return bVar.mo79158i(d);
                    }
                case 2:
                    bVar.mo79183y(this);
                    bVar.mo79303k("br");
                    return false;
                case 3:
                case 4:
                    if (bVar.mo79133O(J)) {
                        bVar.mo79110C(J);
                        if (!bVar.mo79297b(J)) {
                            bVar.mo79183y(this);
                        }
                        bVar.mo79182x0(J);
                        break;
                    } else {
                        bVar.mo79183y(this);
                        return false;
                    }
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    String[] strArr = C16410z.f67015i;
                    if (bVar.mo79137Q(strArr)) {
                        bVar.mo79110C(J);
                        if (!bVar.mo79297b(J)) {
                            bVar.mo79183y(this);
                        }
                        bVar.mo79184y0(strArr);
                        break;
                    } else {
                        bVar.mo79183y(this);
                        return false;
                    }
                case 11:
                    if (bVar.mo79131N(J)) {
                        bVar.mo79110C(J);
                        if (!bVar.mo79297b(J)) {
                            bVar.mo79183y(this);
                        }
                        bVar.mo79182x0(J);
                        break;
                    } else {
                        bVar.mo79183y(this);
                        return false;
                    }
                case 12:
                    if (bVar.mo79133O("body")) {
                        mo79188q(iVar, bVar);
                        bVar.mo79144U0(C16384c.AfterBody);
                        break;
                    } else {
                        bVar.mo79183y(this);
                        return false;
                    }
                case 13:
                    if (bVar.mo79171r0("template")) {
                        if (bVar.mo79133O(J)) {
                            bVar.mo79108B();
                            if (!bVar.mo79297b(J)) {
                                bVar.mo79183y(this);
                            }
                            bVar.mo79182x0(J);
                            break;
                        } else {
                            bVar.mo79183y(this);
                            return false;
                        }
                    } else {
                        C16301k H = bVar.mo79120H();
                        bVar.mo79136P0((C16301k) null);
                        if (H != null && bVar.mo79133O(J)) {
                            bVar.mo79108B();
                            if (!bVar.mo79297b(J)) {
                                bVar.mo79183y(this);
                            }
                            bVar.mo79123I0(H);
                            break;
                        } else {
                            bVar.mo79183y(this);
                            return false;
                        }
                    }
                case 14:
                    if (bVar.mo79302j("body")) {
                        return bVar.mo79158i(d);
                    }
                    break;
                case 15:
                case 16:
                    return mo79188q(iVar, bVar);
                default:
                    if (C16171b.m97073d(J, C16410z.f67023q)) {
                        return m98314t(iVar, bVar);
                    }
                    if (C16171b.m97073d(J, C16410z.f67022p)) {
                        if (bVar.mo79133O(J)) {
                            bVar.mo79108B();
                            if (!bVar.mo79297b(J)) {
                                bVar.mo79183y(this);
                            }
                            bVar.mo79182x0(J);
                            break;
                        } else {
                            bVar.mo79183y(this);
                            return false;
                        }
                    } else if (C16171b.m97073d(J, C16410z.f67018l)) {
                        if (!bVar.mo79133O("name")) {
                            if (bVar.mo79133O(J)) {
                                bVar.mo79108B();
                                if (!bVar.mo79297b(J)) {
                                    bVar.mo79183y(this);
                                }
                                bVar.mo79182x0(J);
                                bVar.mo79170r();
                                break;
                            } else {
                                bVar.mo79183y(this);
                                return false;
                            }
                        }
                    } else {
                        return mo79188q(iVar, bVar);
                    }
                    break;
            }
            return true;
        }

        /* renamed from: t */
        private boolean m98314t(C16416i iVar, C16383b bVar) {
            C16383b bVar2 = bVar;
            String J = iVar.mo79222d().mo79262J();
            ArrayList<C16293h> L = bVar.mo79128L();
            boolean z = false;
            int i = 0;
            while (i < 8) {
                C16293h E = bVar2.mo79114E(J);
                if (E == null) {
                    return mo79188q(iVar, bVar);
                }
                if (!bVar2.mo79173t0(E)) {
                    bVar2.mo79183y(this);
                    bVar2.mo79121H0(E);
                    return true;
                } else if (!bVar2.mo79133O(E.mo78885z0())) {
                    bVar2.mo79183y(this);
                    return z;
                } else {
                    if (bVar.mo79296a() != E) {
                        bVar2.mo79183y(this);
                    }
                    int size = L.size();
                    int i2 = -1;
                    C16293h hVar = null;
                    C16293h hVar2 = null;
                    int i3 = 1;
                    boolean z2 = false;
                    while (true) {
                        if (i3 >= size || i3 >= 64) {
                            break;
                        }
                        C16293h hVar3 = L.get(i3);
                        if (hVar3 != E) {
                            if (z2 && bVar2.mo79163m0(hVar3)) {
                                hVar = hVar3;
                                break;
                            }
                        } else {
                            hVar2 = L.get(i3 - 1);
                            i2 = bVar2.mo79107A0(hVar3);
                            z2 = true;
                        }
                        i3++;
                    }
                    if (hVar == null) {
                        bVar2.mo79182x0(E.mo78885z0());
                        bVar2.mo79121H0(E);
                        return true;
                    }
                    C16293h hVar4 = hVar;
                    C16293h hVar5 = hVar4;
                    for (int i4 = 0; i4 < 3; i4++) {
                        if (bVar2.mo79173t0(hVar4)) {
                            hVar4 = bVar2.mo79166p(hVar4);
                        }
                        if (!bVar2.mo79161k0(hVar4)) {
                            bVar2.mo79123I0(hVar4);
                        } else if (hVar4 == E) {
                            break;
                        } else {
                            C16293h hVar6 = new C16293h(bVar2.mo79305n(hVar4.mo78819y(), C16413f.f67037d), bVar.mo79116F());
                            bVar2.mo79127K0(hVar4, hVar6);
                            bVar2.mo79130M0(hVar4, hVar6);
                            if (hVar5 == hVar) {
                                i2 = bVar2.mo79107A0(hVar6) + 1;
                            }
                            if (hVar5.mo78857G() != null) {
                                hVar5.mo78899L();
                            }
                            hVar6.mo78862Y(hVar5);
                            hVar4 = hVar6;
                            hVar5 = hVar4;
                        }
                    }
                    if (hVar2 != null) {
                        if (C16171b.m97073d(hVar2.mo78885z0(), C16410z.f67024r)) {
                            if (hVar5.mo78857G() != null) {
                                hVar5.mo78899L();
                            }
                            bVar2.mo79152c0(hVar5);
                        } else {
                            if (hVar5.mo78857G() != null) {
                                hVar5.mo78899L();
                            }
                            hVar2.mo78862Y(hVar5);
                        }
                    }
                    C16293h hVar7 = new C16293h(E.mo78858G0(), bVar.mo79116F());
                    hVar7.mo78867e().mo78800k(E.mo78867e());
                    hVar7.mo78863Z(hVar.mo78911l());
                    hVar.mo78862Y(hVar7);
                    bVar2.mo79121H0(E);
                    bVar2.mo79117F0(hVar7, i2);
                    bVar2.mo79123I0(E);
                    bVar2.mo79155f0(hVar, hVar7);
                    i++;
                    z = false;
                }
            }
            return true;
        }

        /* renamed from: v */
        private boolean m98315v(C16416i iVar, C16383b bVar) {
            C16293h I;
            C16301k H;
            C16383b bVar2 = bVar;
            C16416i.C16424h e = iVar.mo79223e();
            String J = e.mo79262J();
            J.hashCode();
            char c = 65535;
            switch (J.hashCode()) {
                case -1644953643:
                    if (J.equals("frameset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1377687758:
                    if (J.equals("button")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1191214428:
                    if (J.equals("iframe")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1134665583:
                    if (J.equals("keygen")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1010136971:
                    if (J.equals("option")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1003243718:
                    if (J.equals("textarea")) {
                        c = 5;
                        break;
                    }
                    break;
                case -906021636:
                    if (J.equals("select")) {
                        c = 6;
                        break;
                    }
                    break;
                case -891985998:
                    if (J.equals("strike")) {
                        c = 7;
                        break;
                    }
                    break;
                case -891980137:
                    if (J.equals("strong")) {
                        c = 8;
                        break;
                    }
                    break;
                case -80773204:
                    if (J.equals("optgroup")) {
                        c = 9;
                        break;
                    }
                    break;
                case 97:
                    if (J.equals("a")) {
                        c = 10;
                        break;
                    }
                    break;
                case 98:
                    if (J.equals("b")) {
                        c = 11;
                        break;
                    }
                    break;
                case 105:
                    if (J.equals("i")) {
                        c = 12;
                        break;
                    }
                    break;
                case 115:
                    if (J.equals("s")) {
                        c = 13;
                        break;
                    }
                    break;
                case 117:
                    if (J.equals("u")) {
                        c = 14;
                        break;
                    }
                    break;
                case 3152:
                    if (J.equals("br")) {
                        c = 15;
                        break;
                    }
                    break;
                case 3200:
                    if (J.equals("dd")) {
                        c = 16;
                        break;
                    }
                    break;
                case 3216:
                    if (J.equals("dt")) {
                        c = 17;
                        break;
                    }
                    break;
                case 3240:
                    if (J.equals("em")) {
                        c = 18;
                        break;
                    }
                    break;
                case 3273:
                    if (J.equals("h1")) {
                        c = 19;
                        break;
                    }
                    break;
                case 3274:
                    if (J.equals("h2")) {
                        c = 20;
                        break;
                    }
                    break;
                case 3275:
                    if (J.equals("h3")) {
                        c = 21;
                        break;
                    }
                    break;
                case 3276:
                    if (J.equals("h4")) {
                        c = 22;
                        break;
                    }
                    break;
                case 3277:
                    if (J.equals("h5")) {
                        c = 23;
                        break;
                    }
                    break;
                case 3278:
                    if (J.equals("h6")) {
                        c = 24;
                        break;
                    }
                    break;
                case 3338:
                    if (J.equals("hr")) {
                        c = 25;
                        break;
                    }
                    break;
                case 3453:
                    if (J.equals("li")) {
                        c = 26;
                        break;
                    }
                    break;
                case 3646:
                    if (J.equals("rp")) {
                        c = 27;
                        break;
                    }
                    break;
                case 3650:
                    if (J.equals("rt")) {
                        c = 28;
                        break;
                    }
                    break;
                case 3712:
                    if (J.equals("tt")) {
                        c = 29;
                        break;
                    }
                    break;
                case 97536:
                    if (J.equals("big")) {
                        c = 30;
                        break;
                    }
                    break;
                case 104387:
                    if (J.equals("img")) {
                        c = 31;
                        break;
                    }
                    break;
                case 111267:
                    if (J.equals("pre")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 114276:
                    if (J.equals("svg")) {
                        c = '!';
                        break;
                    }
                    break;
                case 117511:
                    if (J.equals("wbr")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 118811:
                    if (J.equals("xmp")) {
                        c = '#';
                        break;
                    }
                    break;
                case 3002509:
                    if (J.equals("area")) {
                        c = '$';
                        break;
                    }
                    break;
                case 3029410:
                    if (J.equals("body")) {
                        c = '%';
                        break;
                    }
                    break;
                case 3059181:
                    if (J.equals("code")) {
                        c = '&';
                        break;
                    }
                    break;
                case 3148879:
                    if (J.equals("font")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 3148996:
                    if (J.equals("form")) {
                        c = '(';
                        break;
                    }
                    break;
                case 3213227:
                    if (J.equals("html")) {
                        c = ')';
                        break;
                    }
                    break;
                case 3344136:
                    if (J.equals("math")) {
                        c = '*';
                        break;
                    }
                    break;
                case 3386833:
                    if (J.equals("nobr")) {
                        c = '+';
                        break;
                    }
                    break;
                case 3536714:
                    if (J.equals("span")) {
                        c = ',';
                        break;
                    }
                    break;
                case 96620249:
                    if (J.equals("embed")) {
                        c = '-';
                        break;
                    }
                    break;
                case 100313435:
                    if (J.equals("image")) {
                        c = FilenameUtils.EXTENSION_SEPARATOR;
                        break;
                    }
                    break;
                case 100358090:
                    if (J.equals("input")) {
                        c = '/';
                        break;
                    }
                    break;
                case 109548807:
                    if (J.equals("small")) {
                        c = '0';
                        break;
                    }
                    break;
                case 110115790:
                    if (J.equals("table")) {
                        c = '1';
                        break;
                    }
                    break;
                case 181975684:
                    if (J.equals("listing")) {
                        c = '2';
                        break;
                    }
                    break;
                case 1973234167:
                    if (J.equals("plaintext")) {
                        c = '3';
                        break;
                    }
                    break;
                case 2091304424:
                    if (J.equals("isindex")) {
                        c = '4';
                        break;
                    }
                    break;
                case 2115613112:
                    if (J.equals("noembed")) {
                        c = '5';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    C16383b bVar3 = bVar;
                    bVar3.mo79183y(this);
                    ArrayList<C16293h> L = bVar.mo79128L();
                    if (L.size() == 1) {
                        return false;
                    }
                    if ((L.size() > 2 && !L.get(1).mo78885z0().equals("body")) || !bVar.mo79106A()) {
                        return false;
                    }
                    C16293h hVar = L.get(1);
                    if (hVar.mo78857G() != null) {
                        hVar.mo78899L();
                    }
                    while (L.size() > 1) {
                        L.remove(L.size() - 1);
                    }
                    bVar3.mo79145V(e);
                    bVar3.mo79144U0(C16384c.InFrameset);
                    return true;
                case 1:
                    C16383b bVar4 = bVar;
                    if (bVar4.mo79129M("button")) {
                        bVar4.mo79183y(this);
                        bVar4.mo79302j("button");
                        bVar4.mo79158i(e);
                        return true;
                    }
                    bVar.mo79119G0();
                    bVar4.mo79145V(e);
                    bVar4.mo79185z(false);
                    return true;
                case 2:
                    C16383b bVar5 = bVar;
                    bVar5.mo79185z(false);
                    C16384c.m98275j(e, bVar5);
                    break;
                case 3:
                case 15:
                case 31:
                case '\"':
                case '$':
                case '-':
                    C16383b bVar6 = bVar;
                    bVar.mo79119G0();
                    bVar6.mo79149a0(e);
                    bVar6.mo79185z(false);
                    break;
                case 4:
                case 9:
                    C16383b bVar7 = bVar;
                    if (bVar7.mo79297b("option")) {
                        bVar7.mo79302j("option");
                    }
                    bVar.mo79119G0();
                    bVar7.mo79145V(e);
                    break;
                case 5:
                    C16383b bVar8 = bVar;
                    bVar8.mo79145V(e);
                    if (!e.mo79258F()) {
                        bVar8.f67187c.mo79294x(C16429k.Rcdata);
                        bVar.mo79165o0();
                        bVar8.mo79185z(false);
                        bVar8.mo79144U0(C16384c.f66992s);
                        break;
                    }
                    break;
                case 6:
                    C16383b bVar9 = bVar;
                    bVar.mo79119G0();
                    bVar9.mo79145V(e);
                    bVar9.mo79185z(false);
                    if (!e.f67082m) {
                        C16384c S0 = bVar.mo79141S0();
                        if (!S0.equals(C16384c.InTable) && !S0.equals(C16384c.InCaption) && !S0.equals(C16384c.InTableBody) && !S0.equals(C16384c.InRow) && !S0.equals(C16384c.InCell)) {
                            bVar9.mo79144U0(C16384c.InSelect);
                            break;
                        } else {
                            bVar9.mo79144U0(C16384c.InSelectInTable);
                            break;
                        }
                    }
                    break;
                case 7:
                case 8:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                case 29:
                case 30:
                case '&':
                case '\'':
                case '0':
                    C16383b bVar10 = bVar;
                    bVar.mo79119G0();
                    bVar10.mo79113D0(bVar10.mo79145V(e));
                    break;
                case 10:
                    String str = "a";
                    C16383b bVar11 = bVar;
                    if (bVar11.mo79114E(str) != null) {
                        bVar11.mo79183y(this);
                        bVar11.mo79302j(str);
                        C16293h I2 = bVar11.mo79122I(str);
                        if (I2 != null) {
                            bVar11.mo79121H0(I2);
                            bVar11.mo79123I0(I2);
                        }
                    }
                    bVar.mo79119G0();
                    bVar11.mo79113D0(bVar11.mo79145V(e));
                    break;
                case 16:
                case 17:
                    C16383b bVar12 = bVar;
                    bVar12.mo79185z(false);
                    ArrayList<C16293h> L2 = bVar.mo79128L();
                    int size = L2.size() - 1;
                    int i = size >= 24 ? size - 24 : 0;
                    while (true) {
                        if (size >= i) {
                            C16293h hVar2 = L2.get(size);
                            if (C16171b.m97073d(hVar2.mo78885z0(), C16410z.f67017k)) {
                                bVar12.mo79302j(hVar2.mo78885z0());
                            } else if (!bVar12.mo79163m0(hVar2) || C16171b.m97073d(hVar2.mo78885z0(), C16410z.f67016j)) {
                                size--;
                            }
                        }
                    }
                    if (bVar12.mo79129M("p")) {
                        bVar12.mo79302j("p");
                    }
                    bVar12.mo79145V(e);
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    C16383b bVar13 = bVar;
                    if (bVar13.mo79129M("p")) {
                        bVar13.mo79302j("p");
                    }
                    if (C16171b.m97073d(bVar.mo79296a().mo78885z0(), C16410z.f67015i)) {
                        bVar13.mo79183y(this);
                        bVar.mo79178v0();
                    }
                    bVar13.mo79145V(e);
                    break;
                case 25:
                    C16383b bVar14 = bVar;
                    if (bVar14.mo79129M("p")) {
                        bVar14.mo79302j("p");
                    }
                    bVar14.mo79149a0(e);
                    bVar14.mo79185z(false);
                    break;
                case 26:
                    C16383b bVar15 = bVar;
                    bVar15.mo79185z(false);
                    ArrayList<C16293h> L3 = bVar.mo79128L();
                    int size2 = L3.size() - 1;
                    while (true) {
                        if (size2 > 0) {
                            C16293h hVar3 = L3.get(size2);
                            if (hVar3.mo78885z0().equals("li")) {
                                bVar15.mo79302j("li");
                            } else if (!bVar15.mo79163m0(hVar3) || C16171b.m97073d(hVar3.mo78885z0(), C16410z.f67016j)) {
                                size2--;
                            }
                        }
                    }
                    if (bVar15.mo79129M("p")) {
                        bVar15.mo79302j("p");
                    }
                    bVar15.mo79145V(e);
                    break;
                case 27:
                case 28:
                    C16383b bVar16 = bVar;
                    if (bVar16.mo79133O("ruby")) {
                        bVar.mo79108B();
                        if (!bVar16.mo79297b("ruby")) {
                            bVar16.mo79183y(this);
                            bVar16.mo79180w0("ruby");
                        }
                        bVar16.mo79145V(e);
                        break;
                    }
                    break;
                case ' ':
                case '2':
                    C16383b bVar17 = bVar;
                    if (bVar17.mo79129M("p")) {
                        bVar17.mo79302j("p");
                    }
                    bVar17.mo79145V(e);
                    bVar17.f67186b.mo79065E(IOUtils.LINE_SEPARATOR_UNIX);
                    bVar17.mo79185z(false);
                    break;
                case '!':
                    bVar.mo79119G0();
                    bVar.mo79145V(e);
                    break;
                case '#':
                    C16383b bVar18 = bVar;
                    if (bVar18.mo79129M("p")) {
                        bVar18.mo79302j("p");
                    }
                    bVar.mo79119G0();
                    bVar18.mo79185z(false);
                    C16384c.m98275j(e, bVar18);
                    break;
                case '%':
                    C16383b bVar19 = bVar;
                    bVar19.mo79183y(this);
                    ArrayList<C16293h> L4 = bVar.mo79128L();
                    if (L4.size() == 1) {
                        return false;
                    }
                    if ((L4.size() <= 2 || L4.get(1).mo78885z0().equals("body")) && !bVar19.mo79171r0("template")) {
                        bVar19.mo79185z(false);
                        if (e.mo79257E() && (I = bVar19.mo79122I("body")) != null) {
                            Iterator<C16282a> it = e.f67083n.iterator();
                            while (it.hasNext()) {
                                C16282a next = it.next();
                                if (!I.mo78912s(next.getKey())) {
                                    I.mo78867e().mo78791S(next);
                                }
                            }
                            break;
                        }
                    } else {
                        return false;
                    }
                    break;
                case '(':
                    C16383b bVar20 = bVar;
                    if (bVar.mo79120H() == null || bVar20.mo79171r0("template")) {
                        if (bVar20.mo79129M("p")) {
                            bVar20.mo79179w("p");
                        }
                        bVar20.mo79150b0(e, true, true);
                        break;
                    } else {
                        bVar20.mo79183y(this);
                        return false;
                    }
                    break;
                case ')':
                    C16383b bVar21 = bVar;
                    bVar21.mo79183y(this);
                    if (!bVar21.mo79171r0("template")) {
                        if (bVar.mo79128L().size() > 0) {
                            C16293h hVar4 = bVar.mo79128L().get(0);
                            if (e.mo79257E()) {
                                Iterator<C16282a> it2 = e.f67083n.iterator();
                                while (it2.hasNext()) {
                                    C16282a next2 = it2.next();
                                    if (!hVar4.mo78912s(next2.getKey())) {
                                        hVar4.mo78867e().mo78791S(next2);
                                    }
                                }
                                break;
                            }
                        }
                    } else {
                        return false;
                    }
                    break;
                case '*':
                    bVar.mo79119G0();
                    bVar.mo79145V(e);
                    break;
                case '+':
                    C16383b bVar22 = bVar;
                    bVar.mo79119G0();
                    if (bVar22.mo79133O("nobr")) {
                        bVar22.mo79183y(this);
                        bVar22.mo79302j("nobr");
                        bVar.mo79119G0();
                    }
                    bVar22.mo79113D0(bVar22.mo79145V(e));
                    break;
                case ',':
                    bVar.mo79119G0();
                    bVar.mo79145V(e);
                    break;
                case '.':
                    C16383b bVar23 = bVar;
                    if (bVar23.mo79122I("svg") != null) {
                        bVar23.mo79145V(e);
                        break;
                    } else {
                        return bVar23.mo79158i(e.mo79260H("img"));
                    }
                case '/':
                    C16383b bVar24 = bVar;
                    bVar.mo79119G0();
                    if (!bVar24.mo79149a0(e).mo78823c("type").equalsIgnoreCase("hidden")) {
                        bVar24.mo79185z(false);
                        break;
                    }
                    break;
                case '1':
                    C16383b bVar25 = bVar;
                    if (bVar.mo79118G().mo78836P0() != C16288f.C16291b.quirks && bVar25.mo79129M("p")) {
                        bVar25.mo79302j("p");
                    }
                    bVar25.mo79145V(e);
                    bVar25.mo79185z(false);
                    bVar25.mo79144U0(C16384c.InTable);
                    break;
                case '3':
                    C16383b bVar26 = bVar;
                    if (bVar26.mo79129M("p")) {
                        bVar26.mo79302j("p");
                    }
                    bVar26.mo79145V(e);
                    bVar26.f67187c.mo79294x(C16429k.PLAINTEXT);
                    break;
                case '4':
                    C16383b bVar27 = bVar;
                    bVar27.mo79183y(this);
                    if (bVar.mo79120H() == null) {
                        bVar27.mo79303k("form");
                        if (e.mo79256D("action") && (H = bVar.mo79120H()) != null && e.mo79256D("action")) {
                            H.mo78867e().mo78790R("action", e.f67083n.mo78803s("action"));
                        }
                        bVar27.mo79303k("hr");
                        bVar27.mo79303k("label");
                        bVar27.mo79158i(new C16416i.C16419c().mo79238t(e.mo79256D("prompt") ? e.f67083n.mo78803s("prompt") : "This is a searchable index. Enter search keywords: "));
                        C16283b bVar28 = new C16283b();
                        if (e.mo79257E()) {
                            Iterator<C16282a> it3 = e.f67083n.iterator();
                            while (it3.hasNext()) {
                                C16282a next3 = it3.next();
                                if (!C16171b.m97073d(next3.getKey(), C16410z.f67020n)) {
                                    bVar28.mo78791S(next3);
                                }
                            }
                        }
                        bVar28.mo78790R("name", "isindex");
                        bVar27.mo79162l("input", bVar28);
                        bVar27.mo79302j("label");
                        bVar27.mo79303k("hr");
                        bVar27.mo79302j("form");
                        break;
                    } else {
                        return false;
                    }
                case '5':
                    C16384c.m98275j(e, bVar);
                    break;
                default:
                    if (C16415h.m98336k(J)) {
                        C16383b bVar29 = bVar;
                        if (!C16171b.m97073d(J, C16410z.f67014h)) {
                            if (!C16171b.m97073d(J, C16410z.f67013g)) {
                                if (!C16171b.m97073d(J, C16410z.f67018l)) {
                                    if (!C16171b.m97073d(J, C16410z.f67019m)) {
                                        if (!C16171b.m97073d(J, C16410z.f67021o)) {
                                            bVar.mo79119G0();
                                            bVar29.mo79145V(e);
                                            break;
                                        } else {
                                            bVar29.mo79183y(this);
                                            return false;
                                        }
                                    } else {
                                        bVar29.mo79149a0(e);
                                    }
                                } else {
                                    bVar.mo79119G0();
                                    bVar29.mo79145V(e);
                                    bVar.mo79153d0();
                                    bVar29.mo79185z(false);
                                }
                            } else {
                                return bVar29.mo79109B0(iVar, C16384c.InHead);
                            }
                        } else {
                            if (bVar29.mo79129M("p")) {
                                bVar29.mo79302j("p");
                            }
                            bVar29.mo79145V(e);
                        }
                    } else {
                        bVar.mo79145V(e);
                    }
                    break;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            switch (C16401q.f66994a[iVar.f67061a.ordinal()]) {
                case 1:
                    bVar.mo79148Z(iVar.mo79220b());
                    return true;
                case 2:
                    bVar.mo79183y(this);
                    return false;
                case 3:
                    return m98315v(iVar, bVar);
                case 4:
                    return m98313r(iVar, bVar);
                case 5:
                    C16416i.C16419c a = iVar.mo79219a();
                    if (a.mo79239u().equals(C16384c.f66983P)) {
                        bVar.mo79183y(this);
                        return false;
                    } else if (!bVar.mo79106A() || !C16384c.m98278m(a)) {
                        bVar.mo79119G0();
                        bVar.mo79147Y(a);
                        bVar.mo79185z(false);
                        return true;
                    } else {
                        bVar.mo79119G0();
                        bVar.mo79147Y(a);
                        return true;
                    }
                case 6:
                    if (bVar.mo79142T0() > 0) {
                        return bVar.mo79109B0(iVar, C16384c.InTemplate);
                    }
                    return true;
                default:
                    return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo79188q(C16416i iVar, C16383b bVar) {
            String str = iVar.mo79222d().f67074e;
            ArrayList<C16293h> L = bVar.mo79128L();
            if (bVar.mo79122I(str) == null) {
                bVar.mo79183y(this);
                return false;
            }
            int size = L.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C16293h hVar = L.get(size);
                if (hVar.mo78885z0().equals(str)) {
                    bVar.mo79110C(str);
                    if (!bVar.mo79297b(str)) {
                        bVar.mo79183y(this);
                    }
                    bVar.mo79182x0(str);
                } else if (bVar.mo79163m0(hVar)) {
                    bVar.mo79183y(this);
                    return false;
                } else {
                    size--;
                }
            }
            return true;
        }
    },
    f66992s {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (iVar.mo79227i()) {
                bVar.mo79147Y(iVar.mo79219a());
                return true;
            } else if (iVar.mo79230l()) {
                bVar.mo79183y(this);
                bVar.mo79178v0();
                bVar.mo79144U0(bVar.mo79176u0());
                return bVar.mo79158i(iVar);
            } else if (!iVar.mo79231m()) {
                return true;
            } else {
                bVar.mo79178v0();
                bVar.mo79144U0(bVar.mo79176u0());
                return true;
            }
        }
    },
    InTable {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (iVar.mo79227i() && C16171b.m97073d(bVar.mo79296a().mo78885z0(), C16410z.f66995A)) {
                bVar.mo79169q0();
                bVar.mo79165o0();
                bVar.mo79144U0(C16384c.InTableText);
                return bVar.mo79158i(iVar);
            } else if (iVar.mo79228j()) {
                bVar.mo79148Z(iVar.mo79220b());
                return true;
            } else if (iVar.mo79229k()) {
                bVar.mo79183y(this);
                return false;
            } else if (iVar.mo79232n()) {
                C16416i.C16424h e = iVar.mo79223e();
                String J = e.mo79262J();
                if (J.equals("caption")) {
                    bVar.mo79175u();
                    bVar.mo79153d0();
                    bVar.mo79145V(e);
                    bVar.mo79144U0(C16384c.InCaption);
                } else if (J.equals("colgroup")) {
                    bVar.mo79175u();
                    bVar.mo79145V(e);
                    bVar.mo79144U0(C16384c.InColumnGroup);
                } else if (J.equals("col")) {
                    bVar.mo79175u();
                    bVar.mo79303k("colgroup");
                    return bVar.mo79158i(iVar);
                } else if (C16171b.m97073d(J, C16410z.f67025s)) {
                    bVar.mo79175u();
                    bVar.mo79145V(e);
                    bVar.mo79144U0(C16384c.InTableBody);
                } else if (C16171b.m97073d(J, C16410z.f67026t)) {
                    bVar.mo79175u();
                    bVar.mo79303k("tbody");
                    return bVar.mo79158i(iVar);
                } else if (J.equals("table")) {
                    bVar.mo79183y(this);
                    if (!bVar.mo79143U(J)) {
                        return false;
                    }
                    bVar.mo79182x0(J);
                    if (bVar.mo79134O0()) {
                        return bVar.mo79158i(iVar);
                    }
                    bVar.mo79145V(e);
                    return true;
                } else if (C16171b.m97073d(J, C16410z.f67027u)) {
                    return bVar.mo79109B0(iVar, C16384c.InHead);
                } else {
                    if (J.equals("input")) {
                        if (!e.mo79257E() || !e.f67083n.mo78803s("type").equalsIgnoreCase("hidden")) {
                            return mo79189q(iVar, bVar);
                        }
                        bVar.mo79149a0(e);
                    } else if (!J.equals("form")) {
                        return mo79189q(iVar, bVar);
                    } else {
                        bVar.mo79183y(this);
                        if (bVar.mo79120H() != null || bVar.mo79171r0("template")) {
                            return false;
                        }
                        bVar.mo79150b0(e, false, false);
                    }
                }
                return true;
            } else if (iVar.mo79231m()) {
                String J2 = iVar.mo79222d().mo79262J();
                if (J2.equals("table")) {
                    if (!bVar.mo79143U(J2)) {
                        bVar.mo79183y(this);
                        return false;
                    }
                    bVar.mo79182x0("table");
                    bVar.mo79134O0();
                } else if (C16171b.m97073d(J2, C16410z.f67032z)) {
                    bVar.mo79183y(this);
                    return false;
                } else if (!J2.equals("template")) {
                    return mo79189q(iVar, bVar);
                } else {
                    bVar.mo79109B0(iVar, C16384c.InHead);
                }
                return true;
            } else if (!iVar.mo79230l()) {
                return mo79189q(iVar, bVar);
            } else {
                if (bVar.mo79297b("html")) {
                    bVar.mo79183y(this);
                }
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public boolean mo79189q(C16416i iVar, C16383b bVar) {
            bVar.mo79183y(this);
            bVar.mo79138Q0(true);
            bVar.mo79109B0(iVar, C16384c.InBody);
            bVar.mo79138Q0(false);
            return true;
        }
    },
    InTableText {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (iVar.f67061a == C16416i.C16426j.Character) {
                C16416i.C16419c a = iVar.mo79219a();
                if (a.mo79239u().equals(C16384c.f66983P)) {
                    bVar.mo79183y(this);
                    return false;
                }
                bVar.mo79126K().add(a.mo79239u());
                return true;
            }
            if (bVar.mo79126K().size() > 0) {
                for (String next : bVar.mo79126K()) {
                    if (!C16384c.m98277l(next)) {
                        bVar.mo79183y(this);
                        if (C16171b.m97073d(bVar.mo79296a().mo78885z0(), C16410z.f66995A)) {
                            bVar.mo79138Q0(true);
                            bVar.mo79109B0(new C16416i.C16419c().mo79238t(next), C16384c.InBody);
                            bVar.mo79138Q0(false);
                        } else {
                            bVar.mo79109B0(new C16416i.C16419c().mo79238t(next), C16384c.InBody);
                        }
                    } else {
                        bVar.mo79147Y(new C16416i.C16419c().mo79238t(next));
                    }
                }
                bVar.mo79169q0();
            }
            bVar.mo79144U0(bVar.mo79176u0());
            return bVar.mo79158i(iVar);
        }
    },
    InCaption {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (!iVar.mo79231m() || !iVar.mo79222d().mo79262J().equals("caption")) {
                if ((iVar.mo79232n() && C16171b.m97073d(iVar.mo79223e().mo79262J(), C16410z.f67031y)) || (iVar.mo79231m() && iVar.mo79222d().mo79262J().equals("table"))) {
                    bVar.mo79183y(this);
                    if (bVar.mo79302j("caption")) {
                        return bVar.mo79158i(iVar);
                    }
                    return true;
                } else if (!iVar.mo79231m() || !C16171b.m97073d(iVar.mo79222d().mo79262J(), C16410z.f67004J)) {
                    return bVar.mo79109B0(iVar, C16384c.InBody);
                } else {
                    bVar.mo79183y(this);
                    return false;
                }
            } else if (!bVar.mo79143U(iVar.mo79222d().mo79262J())) {
                bVar.mo79183y(this);
                return false;
            } else {
                bVar.mo79108B();
                if (!bVar.mo79297b("caption")) {
                    bVar.mo79183y(this);
                }
                bVar.mo79182x0("caption");
                bVar.mo79170r();
                bVar.mo79144U0(C16384c.InTable);
                return true;
            }
        }
    },
    InColumnGroup {
        /* renamed from: q */
        private boolean m98282q(C16416i iVar, C16383b bVar) {
            if (!bVar.mo79297b("colgroup")) {
                bVar.mo79183y(this);
                return false;
            }
            bVar.mo79178v0();
            bVar.mo79144U0(C16384c.InTable);
            bVar.mo79158i(iVar);
            return true;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
            if (r3.equals("html") == false) goto L_0x0087;
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo79187n(p382rd.C16416i r10, p382rd.C16383b r11) {
            /*
                r9 = this;
                boolean r0 = p382rd.C16384c.m98278m(r10)
                r1 = 1
                if (r0 == 0) goto L_0x000f
                rd.i$c r10 = r10.mo79219a()
                r11.mo79147Y(r10)
                return r1
            L_0x000f:
                int[] r0 = p382rd.C16384c.C16401q.f66994a
                rd.i$j r2 = r10.f67061a
                int r2 = r2.ordinal()
                r0 = r0[r2]
                if (r0 == r1) goto L_0x00c0
                r2 = 2
                if (r0 == r2) goto L_0x00bc
                r3 = 3
                java.lang.String r4 = "html"
                r5 = 0
                java.lang.String r6 = "template"
                if (r0 == r3) goto L_0x0074
                r2 = 4
                if (r0 == r2) goto L_0x003d
                r2 = 6
                if (r0 == r2) goto L_0x0031
                boolean r10 = r9.m98282q(r10, r11)
                return r10
            L_0x0031:
                boolean r0 = r11.mo79297b(r4)
                if (r0 == 0) goto L_0x0038
                return r1
            L_0x0038:
                boolean r10 = r9.m98282q(r10, r11)
                return r10
            L_0x003d:
                rd.i$g r0 = r10.mo79222d()
                java.lang.String r0 = r0.mo79262J()
                r0.hashCode()
                boolean r2 = r0.equals(r6)
                if (r2 != 0) goto L_0x006e
                java.lang.String r2 = "colgroup"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x005b
                boolean r10 = r9.m98282q(r10, r11)
                return r10
            L_0x005b:
                boolean r10 = r11.mo79297b(r0)
                if (r10 != 0) goto L_0x0065
                r11.mo79183y(r9)
                return r5
            L_0x0065:
                r11.mo79178v0()
                rd.c r10 = p382rd.C16384c.InTable
                r11.mo79144U0(r10)
                goto L_0x00c7
            L_0x006e:
                rd.c r0 = p382rd.C16384c.InHead
                r11.mo79109B0(r10, r0)
                goto L_0x00c7
            L_0x0074:
                rd.i$h r0 = r10.mo79223e()
                java.lang.String r3 = r0.mo79262J()
                r3.hashCode()
                r7 = -1
                int r8 = r3.hashCode()
                switch(r8) {
                    case -1321546630: goto L_0x009b;
                    case 98688: goto L_0x0090;
                    case 3213227: goto L_0x0089;
                    default: goto L_0x0087;
                }
            L_0x0087:
                r2 = -1
                goto L_0x00a3
            L_0x0089:
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L_0x00a3
                goto L_0x0087
            L_0x0090:
                java.lang.String r2 = "col"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L_0x0099
                goto L_0x0087
            L_0x0099:
                r2 = 1
                goto L_0x00a3
            L_0x009b:
                boolean r2 = r3.equals(r6)
                if (r2 != 0) goto L_0x00a2
                goto L_0x0087
            L_0x00a2:
                r2 = 0
            L_0x00a3:
                switch(r2) {
                    case 0: goto L_0x00b6;
                    case 1: goto L_0x00b2;
                    case 2: goto L_0x00ab;
                    default: goto L_0x00a6;
                }
            L_0x00a6:
                boolean r10 = r9.m98282q(r10, r11)
                return r10
            L_0x00ab:
                rd.c r0 = p382rd.C16384c.InBody
                boolean r10 = r11.mo79109B0(r10, r0)
                return r10
            L_0x00b2:
                r11.mo79149a0(r0)
                goto L_0x00c7
            L_0x00b6:
                rd.c r0 = p382rd.C16384c.InHead
                r11.mo79109B0(r10, r0)
                goto L_0x00c7
            L_0x00bc:
                r11.mo79183y(r9)
                goto L_0x00c7
            L_0x00c0:
                rd.i$d r10 = r10.mo79220b()
                r11.mo79148Z(r10)
            L_0x00c7:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p382rd.C16384c.C16387c.mo79187n(rd.i, rd.b):boolean");
        }
    },
    InTableBody {
        /* renamed from: q */
        private boolean m98284q(C16416i iVar, C16383b bVar) {
            return bVar.mo79109B0(iVar, C16384c.InTable);
        }

        /* renamed from: r */
        private boolean m98285r(C16416i iVar, C16383b bVar) {
            if (bVar.mo79143U("tbody") || bVar.mo79143U("thead") || bVar.mo79133O("tfoot")) {
                bVar.mo79172t();
                bVar.mo79302j(bVar.mo79296a().mo78885z0());
                return bVar.mo79158i(iVar);
            }
            bVar.mo79183y(this);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            int i = C16401q.f66994a[iVar.f67061a.ordinal()];
            if (i == 3) {
                C16416i.C16424h e = iVar.mo79223e();
                String J = e.mo79262J();
                if (J.equals("tr")) {
                    bVar.mo79172t();
                    bVar.mo79145V(e);
                    bVar.mo79144U0(C16384c.InRow);
                    return true;
                } else if (C16171b.m97073d(J, C16410z.f67028v)) {
                    bVar.mo79183y(this);
                    bVar.mo79303k("tr");
                    return bVar.mo79158i(e);
                } else if (C16171b.m97073d(J, C16410z.f66996B)) {
                    return m98285r(iVar, bVar);
                } else {
                    return m98284q(iVar, bVar);
                }
            } else if (i != 4) {
                return m98284q(iVar, bVar);
            } else {
                String J2 = iVar.mo79222d().mo79262J();
                if (C16171b.m97073d(J2, C16410z.f67002H)) {
                    if (!bVar.mo79143U(J2)) {
                        bVar.mo79183y(this);
                        return false;
                    }
                    bVar.mo79172t();
                    bVar.mo79178v0();
                    bVar.mo79144U0(C16384c.InTable);
                    return true;
                } else if (J2.equals("table")) {
                    return m98285r(iVar, bVar);
                } else {
                    if (!C16171b.m97073d(J2, C16410z.f66997C)) {
                        return m98284q(iVar, bVar);
                    }
                    bVar.mo79183y(this);
                    return false;
                }
            }
        }
    },
    InRow {
        /* renamed from: q */
        private boolean m98287q(C16416i iVar, C16383b bVar) {
            return bVar.mo79109B0(iVar, C16384c.InTable);
        }

        /* renamed from: r */
        private boolean m98288r(C16416i iVar, C16497l lVar) {
            if (lVar.mo79302j("tr")) {
                return lVar.mo79158i(iVar);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (iVar.mo79232n()) {
                C16416i.C16424h e = iVar.mo79223e();
                String J = e.mo79262J();
                if (C16171b.m97073d(J, C16410z.f67028v)) {
                    bVar.mo79177v();
                    bVar.mo79145V(e);
                    bVar.mo79144U0(C16384c.InCell);
                    bVar.mo79153d0();
                    return true;
                } else if (C16171b.m97073d(J, C16410z.f66998D)) {
                    return m98288r(iVar, bVar);
                } else {
                    return m98287q(iVar, bVar);
                }
            } else if (!iVar.mo79231m()) {
                return m98287q(iVar, bVar);
            } else {
                String J2 = iVar.mo79222d().mo79262J();
                if (J2.equals("tr")) {
                    if (!bVar.mo79143U(J2)) {
                        bVar.mo79183y(this);
                        return false;
                    }
                    bVar.mo79177v();
                    bVar.mo79178v0();
                    bVar.mo79144U0(C16384c.InTableBody);
                    return true;
                } else if (J2.equals("table")) {
                    return m98288r(iVar, bVar);
                } else {
                    if (C16171b.m97073d(J2, C16410z.f67025s)) {
                        if (!bVar.mo79143U(J2) || !bVar.mo79143U("tr")) {
                            bVar.mo79183y(this);
                            return false;
                        }
                        bVar.mo79177v();
                        bVar.mo79178v0();
                        bVar.mo79144U0(C16384c.InTableBody);
                        return true;
                    } else if (!C16171b.m97073d(J2, C16410z.f66999E)) {
                        return m98287q(iVar, bVar);
                    } else {
                        bVar.mo79183y(this);
                        return false;
                    }
                }
            }
        }
    },
    InCell {
        /* renamed from: q */
        private boolean m98290q(C16416i iVar, C16383b bVar) {
            return bVar.mo79109B0(iVar, C16384c.InBody);
        }

        /* renamed from: r */
        private void m98291r(C16383b bVar) {
            if (bVar.mo79143U("td")) {
                bVar.mo79302j("td");
            } else {
                bVar.mo79302j("th");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (iVar.mo79231m()) {
                String J = iVar.mo79222d().mo79262J();
                if (C16171b.m97073d(J, C16410z.f67028v)) {
                    if (!bVar.mo79143U(J)) {
                        bVar.mo79183y(this);
                        bVar.mo79144U0(C16384c.InRow);
                        return false;
                    }
                    bVar.mo79108B();
                    if (!bVar.mo79297b(J)) {
                        bVar.mo79183y(this);
                    }
                    bVar.mo79182x0(J);
                    bVar.mo79170r();
                    bVar.mo79144U0(C16384c.InRow);
                    return true;
                } else if (C16171b.m97073d(J, C16410z.f67029w)) {
                    bVar.mo79183y(this);
                    return false;
                } else if (!C16171b.m97073d(J, C16410z.f67030x)) {
                    return m98290q(iVar, bVar);
                } else {
                    if (!bVar.mo79143U(J)) {
                        bVar.mo79183y(this);
                        return false;
                    }
                    m98291r(bVar);
                    return bVar.mo79158i(iVar);
                }
            } else if (!iVar.mo79232n() || !C16171b.m97073d(iVar.mo79223e().mo79262J(), C16410z.f67031y)) {
                return m98290q(iVar, bVar);
            } else {
                if (bVar.mo79143U("td") || bVar.mo79143U("th")) {
                    m98291r(bVar);
                    return bVar.mo79158i(iVar);
                }
                bVar.mo79183y(this);
                return false;
            }
        }
    },
    InSelect {
        /* renamed from: q */
        private boolean m98293q(C16416i iVar, C16383b bVar) {
            bVar.mo79183y(this);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            switch (C16401q.f66994a[iVar.f67061a.ordinal()]) {
                case 1:
                    bVar.mo79148Z(iVar.mo79220b());
                    break;
                case 2:
                    bVar.mo79183y(this);
                    return false;
                case 3:
                    C16416i.C16424h e = iVar.mo79223e();
                    String J = e.mo79262J();
                    if (J.equals("html")) {
                        return bVar.mo79109B0(e, C16384c.InBody);
                    }
                    if (J.equals("option")) {
                        if (bVar.mo79297b("option")) {
                            bVar.mo79302j("option");
                        }
                        bVar.mo79145V(e);
                        break;
                    } else if (J.equals("optgroup")) {
                        if (bVar.mo79297b("option")) {
                            bVar.mo79302j("option");
                        }
                        if (bVar.mo79297b("optgroup")) {
                            bVar.mo79302j("optgroup");
                        }
                        bVar.mo79145V(e);
                        break;
                    } else if (J.equals("select")) {
                        bVar.mo79183y(this);
                        return bVar.mo79302j("select");
                    } else if (C16171b.m97073d(J, C16410z.f67000F)) {
                        bVar.mo79183y(this);
                        if (!bVar.mo79139R("select")) {
                            return false;
                        }
                        bVar.mo79302j("select");
                        return bVar.mo79158i(e);
                    } else if (J.equals("script") || J.equals("template")) {
                        return bVar.mo79109B0(iVar, C16384c.InHead);
                    } else {
                        return m98293q(iVar, bVar);
                    }
                    break;
                case 4:
                    String J2 = iVar.mo79222d().mo79262J();
                    J2.hashCode();
                    char c = 65535;
                    switch (J2.hashCode()) {
                        case -1321546630:
                            if (J2.equals("template")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1010136971:
                            if (J2.equals("option")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (J2.equals("select")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -80773204:
                            if (J2.equals("optgroup")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            return bVar.mo79109B0(iVar, C16384c.InHead);
                        case 1:
                            if (!bVar.mo79297b("option")) {
                                bVar.mo79183y(this);
                                break;
                            } else {
                                bVar.mo79178v0();
                                break;
                            }
                        case 2:
                            if (bVar.mo79139R(J2)) {
                                bVar.mo79182x0(J2);
                                bVar.mo79134O0();
                                break;
                            } else {
                                bVar.mo79183y(this);
                                return false;
                            }
                        case 3:
                            if (bVar.mo79297b("option") && bVar.mo79166p(bVar.mo79296a()) != null && bVar.mo79166p(bVar.mo79296a()).mo78885z0().equals("optgroup")) {
                                bVar.mo79302j("option");
                            }
                            if (!bVar.mo79297b("optgroup")) {
                                bVar.mo79183y(this);
                                break;
                            } else {
                                bVar.mo79178v0();
                                break;
                            }
                        default:
                            return m98293q(iVar, bVar);
                    }
                case 5:
                    C16416i.C16419c a = iVar.mo79219a();
                    if (!a.mo79239u().equals(C16384c.f66983P)) {
                        bVar.mo79147Y(a);
                        break;
                    } else {
                        bVar.mo79183y(this);
                        return false;
                    }
                case 6:
                    if (!bVar.mo79297b("html")) {
                        bVar.mo79183y(this);
                        break;
                    }
                    break;
                default:
                    return m98293q(iVar, bVar);
            }
            return true;
        }
    },
    InSelectInTable {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (iVar.mo79232n() && C16171b.m97073d(iVar.mo79223e().mo79262J(), C16410z.f67001G)) {
                bVar.mo79183y(this);
                bVar.mo79182x0("select");
                bVar.mo79134O0();
                return bVar.mo79158i(iVar);
            } else if (!iVar.mo79231m() || !C16171b.m97073d(iVar.mo79222d().mo79262J(), C16410z.f67001G)) {
                return bVar.mo79109B0(iVar, C16384c.InSelect);
            } else {
                bVar.mo79183y(this);
                if (!bVar.mo79143U(iVar.mo79222d().mo79262J())) {
                    return false;
                }
                bVar.mo79182x0("select");
                bVar.mo79134O0();
                return bVar.mo79158i(iVar);
            }
        }
    },
    InTemplate {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            switch (C16401q.f66994a[iVar.f67061a.ordinal()]) {
                case 1:
                case 2:
                case 5:
                    bVar.mo79109B0(iVar, C16384c.InBody);
                    break;
                case 3:
                    String J = iVar.mo79223e().mo79262J();
                    if (C16171b.m97073d(J, C16410z.f67005K)) {
                        bVar.mo79109B0(iVar, C16384c.InHead);
                        break;
                    } else if (C16171b.m97073d(J, C16410z.f67006L)) {
                        bVar.mo79186z0();
                        C16384c cVar = C16384c.InTable;
                        bVar.mo79115E0(cVar);
                        bVar.mo79144U0(cVar);
                        return bVar.mo79158i(iVar);
                    } else if (J.equals("col")) {
                        bVar.mo79186z0();
                        C16384c cVar2 = C16384c.InColumnGroup;
                        bVar.mo79115E0(cVar2);
                        bVar.mo79144U0(cVar2);
                        return bVar.mo79158i(iVar);
                    } else if (J.equals("tr")) {
                        bVar.mo79186z0();
                        C16384c cVar3 = C16384c.InTableBody;
                        bVar.mo79115E0(cVar3);
                        bVar.mo79144U0(cVar3);
                        return bVar.mo79158i(iVar);
                    } else if (J.equals("td") || J.equals("th")) {
                        bVar.mo79186z0();
                        C16384c cVar4 = C16384c.InRow;
                        bVar.mo79115E0(cVar4);
                        bVar.mo79144U0(cVar4);
                        return bVar.mo79158i(iVar);
                    } else {
                        bVar.mo79186z0();
                        C16384c cVar5 = C16384c.InBody;
                        bVar.mo79115E0(cVar5);
                        bVar.mo79144U0(cVar5);
                        return bVar.mo79158i(iVar);
                    }
                case 4:
                    if (iVar.mo79222d().mo79262J().equals("template")) {
                        bVar.mo79109B0(iVar, C16384c.InHead);
                        break;
                    } else {
                        bVar.mo79183y(this);
                        return false;
                    }
                case 6:
                    if (!bVar.mo79171r0("template")) {
                        return true;
                    }
                    bVar.mo79183y(this);
                    bVar.mo79182x0("template");
                    bVar.mo79170r();
                    bVar.mo79186z0();
                    bVar.mo79134O0();
                    if (bVar.mo79141S0() == C16384c.InTemplate || bVar.mo79142T0() >= 12) {
                        return true;
                    }
                    return bVar.mo79158i(iVar);
            }
            return true;
        }
    },
    AfterBody {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (C16384c.m98278m(iVar)) {
                bVar.mo79147Y(iVar.mo79219a());
                return true;
            } else if (iVar.mo79228j()) {
                bVar.mo79148Z(iVar.mo79220b());
                return true;
            } else if (iVar.mo79229k()) {
                bVar.mo79183y(this);
                return false;
            } else if (iVar.mo79232n() && iVar.mo79223e().mo79262J().equals("html")) {
                return bVar.mo79109B0(iVar, C16384c.InBody);
            } else {
                if (!iVar.mo79231m() || !iVar.mo79222d().mo79262J().equals("html")) {
                    if (iVar.mo79230l()) {
                        return true;
                    }
                    bVar.mo79183y(this);
                    bVar.mo79132N0();
                    return bVar.mo79158i(iVar);
                } else if (bVar.mo79160j0()) {
                    bVar.mo79183y(this);
                    return false;
                } else {
                    if (bVar.mo79171r0("html")) {
                        bVar.mo79182x0("html");
                    }
                    bVar.mo79144U0(C16384c.AfterAfterBody);
                    return true;
                }
            }
        }
    },
    InFrameset {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (C16384c.m98278m(iVar)) {
                bVar.mo79147Y(iVar.mo79219a());
            } else if (iVar.mo79228j()) {
                bVar.mo79148Z(iVar.mo79220b());
            } else if (iVar.mo79229k()) {
                bVar.mo79183y(this);
                return false;
            } else if (iVar.mo79232n()) {
                C16416i.C16424h e = iVar.mo79223e();
                String J = e.mo79262J();
                J.hashCode();
                char c = 65535;
                switch (J.hashCode()) {
                    case -1644953643:
                        if (J.equals("frameset")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3213227:
                        if (J.equals("html")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 97692013:
                        if (J.equals(TypedValues.Attributes.S_FRAME)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (J.equals("noframes")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        bVar.mo79145V(e);
                        break;
                    case 1:
                        return bVar.mo79109B0(e, C16384c.InBody);
                    case 2:
                        bVar.mo79149a0(e);
                        break;
                    case 3:
                        return bVar.mo79109B0(e, C16384c.InHead);
                    default:
                        bVar.mo79183y(this);
                        return false;
                }
            } else if (!iVar.mo79231m() || !iVar.mo79222d().mo79262J().equals("frameset")) {
                if (!iVar.mo79230l()) {
                    bVar.mo79183y(this);
                    return false;
                } else if (!bVar.mo79297b("html")) {
                    bVar.mo79183y(this);
                }
            } else if (bVar.mo79297b("html")) {
                bVar.mo79183y(this);
                return false;
            } else {
                bVar.mo79178v0();
                if (!bVar.mo79160j0() && !bVar.mo79297b("frameset")) {
                    bVar.mo79144U0(C16384c.AfterFrameset);
                }
            }
            return true;
        }
    },
    AfterFrameset {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (C16384c.m98278m(iVar)) {
                bVar.mo79147Y(iVar.mo79219a());
                return true;
            } else if (iVar.mo79228j()) {
                bVar.mo79148Z(iVar.mo79220b());
                return true;
            } else if (iVar.mo79229k()) {
                bVar.mo79183y(this);
                return false;
            } else if (iVar.mo79232n() && iVar.mo79223e().mo79262J().equals("html")) {
                return bVar.mo79109B0(iVar, C16384c.InBody);
            } else {
                if (iVar.mo79231m() && iVar.mo79222d().mo79262J().equals("html")) {
                    bVar.mo79144U0(C16384c.AfterAfterFrameset);
                    return true;
                } else if (iVar.mo79232n() && iVar.mo79223e().mo79262J().equals("noframes")) {
                    return bVar.mo79109B0(iVar, C16384c.InHead);
                } else {
                    if (iVar.mo79230l()) {
                        return true;
                    }
                    bVar.mo79183y(this);
                    return false;
                }
            }
        }
    },
    AfterAfterBody {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (iVar.mo79228j()) {
                bVar.mo79148Z(iVar.mo79220b());
                return true;
            } else if (iVar.mo79229k() || (iVar.mo79232n() && iVar.mo79223e().mo79262J().equals("html"))) {
                return bVar.mo79109B0(iVar, C16384c.InBody);
            } else {
                if (C16384c.m98278m(iVar)) {
                    bVar.mo79147Y(iVar.mo79219a());
                    return true;
                } else if (iVar.mo79230l()) {
                    return true;
                } else {
                    bVar.mo79183y(this);
                    bVar.mo79132N0();
                    return bVar.mo79158i(iVar);
                }
            }
        }
    },
    AfterAfterFrameset {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            if (iVar.mo79228j()) {
                bVar.mo79148Z(iVar.mo79220b());
                return true;
            } else if (iVar.mo79229k() || C16384c.m98278m(iVar) || (iVar.mo79232n() && iVar.mo79223e().mo79262J().equals("html"))) {
                return bVar.mo79109B0(iVar, C16384c.InBody);
            } else {
                if (iVar.mo79230l()) {
                    return true;
                }
                if (iVar.mo79232n() && iVar.mo79223e().mo79262J().equals("noframes")) {
                    return bVar.mo79109B0(iVar, C16384c.InHead);
                }
                bVar.mo79183y(this);
                return false;
            }
        }
    },
    ForeignContent {
        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo79187n(C16416i iVar, C16383b bVar) {
            return true;
        }
    };
    
    /* access modifiers changed from: private */

    /* renamed from: P */
    public static final String f66983P = null;

    /* renamed from: rd.c$q */
    /* compiled from: HtmlTreeBuilderState */
    static /* synthetic */ class C16401q {

        /* renamed from: a */
        static final /* synthetic */ int[] f66994a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                rd.i$j[] r0 = p382rd.C16416i.C16426j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f66994a = r0
                rd.i$j r1 = p382rd.C16416i.C16426j.Comment     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f66994a     // Catch:{ NoSuchFieldError -> 0x001d }
                rd.i$j r1 = p382rd.C16416i.C16426j.Doctype     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f66994a     // Catch:{ NoSuchFieldError -> 0x0028 }
                rd.i$j r1 = p382rd.C16416i.C16426j.StartTag     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f66994a     // Catch:{ NoSuchFieldError -> 0x0033 }
                rd.i$j r1 = p382rd.C16416i.C16426j.EndTag     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f66994a     // Catch:{ NoSuchFieldError -> 0x003e }
                rd.i$j r1 = p382rd.C16416i.C16426j.Character     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f66994a     // Catch:{ NoSuchFieldError -> 0x0049 }
                rd.i$j r1 = p382rd.C16416i.C16426j.EOF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p382rd.C16384c.C16401q.<clinit>():void");
        }
    }

    /* renamed from: rd.c$z */
    /* compiled from: HtmlTreeBuilderState */
    static final class C16410z {

        /* renamed from: A */
        static final String[] f66995A = null;

        /* renamed from: B */
        static final String[] f66996B = null;

        /* renamed from: C */
        static final String[] f66997C = null;

        /* renamed from: D */
        static final String[] f66998D = null;

        /* renamed from: E */
        static final String[] f66999E = null;

        /* renamed from: F */
        static final String[] f67000F = null;

        /* renamed from: G */
        static final String[] f67001G = null;

        /* renamed from: H */
        static final String[] f67002H = null;

        /* renamed from: I */
        static final String[] f67003I = null;

        /* renamed from: J */
        static final String[] f67004J = null;

        /* renamed from: K */
        static final String[] f67005K = null;

        /* renamed from: L */
        static final String[] f67006L = null;

        /* renamed from: a */
        static final String[] f67007a = null;

        /* renamed from: b */
        static final String[] f67008b = null;

        /* renamed from: c */
        static final String[] f67009c = null;

        /* renamed from: d */
        static final String[] f67010d = null;

        /* renamed from: e */
        static final String[] f67011e = null;

        /* renamed from: f */
        static final String[] f67012f = null;

        /* renamed from: g */
        static final String[] f67013g = null;

        /* renamed from: h */
        static final String[] f67014h = null;

        /* renamed from: i */
        static final String[] f67015i = null;

        /* renamed from: j */
        static final String[] f67016j = null;

        /* renamed from: k */
        static final String[] f67017k = null;

        /* renamed from: l */
        static final String[] f67018l = null;

        /* renamed from: m */
        static final String[] f67019m = null;

        /* renamed from: n */
        static final String[] f67020n = null;

        /* renamed from: o */
        static final String[] f67021o = null;

        /* renamed from: p */
        static final String[] f67022p = null;

        /* renamed from: q */
        static final String[] f67023q = null;

        /* renamed from: r */
        static final String[] f67024r = null;

        /* renamed from: s */
        static final String[] f67025s = null;

        /* renamed from: t */
        static final String[] f67026t = null;

        /* renamed from: u */
        static final String[] f67027u = null;

        /* renamed from: v */
        static final String[] f67028v = null;

        /* renamed from: w */
        static final String[] f67029w = null;

        /* renamed from: x */
        static final String[] f67030x = null;

        /* renamed from: y */
        static final String[] f67031y = null;

        /* renamed from: z */
        static final String[] f67032z = null;

        static {
            f67007a = new String[]{"base", "basefont", "bgsound", "command", "link"};
            f67008b = new String[]{"noframes", "style"};
            f67009c = new String[]{"body", "br", "html"};
            f67010d = new String[]{"body", "br", "html"};
            f67011e = new String[]{"body", "br", "head", "html"};
            f67012f = new String[]{"basefont", "bgsound", "link", "meta", "noframes", "style"};
            f67013g = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
            f67014h = new String[]{"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
            f67015i = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            f67016j = new String[]{"address", "div", "p"};
            f67017k = new String[]{"dd", "dt"};
            f67018l = new String[]{"applet", "marquee", "object"};
            f67019m = new String[]{"param", "source", "track"};
            f67020n = new String[]{"action", "name", "prompt"};
            f67021o = new String[]{"caption", "col", "colgroup", TypedValues.Attributes.S_FRAME, "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f67022p = new String[]{"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
            f67023q = new String[]{"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
            f67024r = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            f67025s = new String[]{"tbody", "tfoot", "thead"};
            f67026t = new String[]{"td", "th", "tr"};
            f67027u = new String[]{"script", "style", "template"};
            f67028v = new String[]{"td", "th"};
            f67029w = new String[]{"body", "caption", "col", "colgroup", "html"};
            f67030x = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            f67031y = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f67032z = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f66995A = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            f66996B = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
            f66997C = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
            f66998D = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
            f66999E = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"};
            f67000F = new String[]{"input", "keygen", "textarea"};
            f67001G = new String[]{"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f67002H = new String[]{"tbody", "tfoot", "thead"};
            f67003I = new String[]{"head", "noscript"};
            f67004J = new String[]{"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            f67005K = new String[]{"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
            f67006L = new String[]{"caption", "colgroup", "tbody", "tfoot", "thead"};
        }
    }

    static {
        f66983P = String.valueOf(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static void m98275j(C16416i.C16424h hVar, C16383b bVar) {
        bVar.f67187c.mo79294x(C16429k.Rawtext);
        bVar.mo79165o0();
        bVar.mo79144U0(f66992s);
        bVar.mo79145V(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static void m98276k(C16416i.C16424h hVar, C16383b bVar) {
        bVar.f67187c.mo79294x(C16429k.Rcdata);
        bVar.mo79165o0();
        bVar.mo79144U0(f66992s);
        bVar.mo79145V(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m98277l(String str) {
        return C16171b.m97075f(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m98278m(C16416i iVar) {
        if (iVar.mo79227i()) {
            return C16171b.m97075f(iVar.mo79219a().mo79239u());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract boolean mo79187n(C16416i iVar, C16383b bVar);
}
