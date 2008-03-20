/*
 * Copyright 2000-2005 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */
package sun.applet.resources;

import java.util.ListResourceBundle;

public class MsgAppletViewer_sv extends ListResourceBundle {

    public Object[][] getContents() {
        return new Object[][] {
            {"textframe.button.dismiss", "St\u00e4ng"},
            {"appletviewer.tool.title", "Applet Viewer: {0}"},
            {"appletviewer.menu.applet", "Applet"},
            {"appletviewer.menuitem.restart", "Starta om"},
            {"appletviewer.menuitem.reload", "L\u00e4s in igen"},
            {"appletviewer.menuitem.stop", "Stoppa"},
            {"appletviewer.menuitem.save", "Spara ..."},
            {"appletviewer.menuitem.start", "Starta"},
            {"appletviewer.menuitem.clone", "Klona ..."},
            {"appletviewer.menuitem.tag", "Tagga ..."},
            {"appletviewer.menuitem.info", "Info ..."},
            {"appletviewer.menuitem.edit", "Redigera"},
            {"appletviewer.menuitem.encoding", "Teckenkodning"},
            {"appletviewer.menuitem.print", "Skriv ut ..."},
            {"appletviewer.menuitem.props", "Egenskaper ..."},
            {"appletviewer.menuitem.close", "St\u00e4ng"},
            {"appletviewer.menuitem.quit", "Avsluta"},
            {"appletviewer.label.hello", "Hall\u00e5 ..."},
            {"appletviewer.status.start", "startar applet ..."},
            {"appletviewer.appletsave.filedialogtitle","Ordna appletar seriellt i filen"},
            {"appletviewer.appletsave.err1", "serialiserar en {0} till {1}"},
            {"appletviewer.appletsave.err2", "i appletSave: {0}"},
            {"appletviewer.applettag", "Visad tagg"},
            {"appletviewer.applettag.textframe", "HTML-tagg f\u00f6r applet"},
            {"appletviewer.appletinfo.applet", "-- ingen applet-info --"},
            {"appletviewer.appletinfo.param", "-- ingen parameterinfo --"},
            {"appletviewer.appletinfo.textframe", "Applet-info"},
            {"appletviewer.appletprint.fail", "Utskrift misslyckades."},
            {"appletviewer.appletprint.finish", "Utskriften \u00e4r klar."},
            {"appletviewer.appletprint.cancel", "Utskriften avbr\u00f6ts."},
            {"appletviewer.appletencoding", "Teckenkodning: {0}"},
            {"appletviewer.parse.warning.requiresname", "Varning: Taggen <param name=... value=...> kr\u00e4ver ett namnattribut."},
            {"appletviewer.parse.warning.paramoutside", "Varning: Taggen <param> utanf\u00f6r <applet> ... </applet>."},
            {"appletviewer.parse.warning.applet.requirescode", "Varning: <applet> Taggen kr\u00e4ver kodattribut."},
            {"appletviewer.parse.warning.applet.requiresheight", "Varning: <applet> Taggen kr\u00e4ver h\u00f6jdattribut."},
            {"appletviewer.parse.warning.applet.requireswidth", "Varning: <applet> Taggen kr\u00e4ver breddattribut."},
            {"appletviewer.parse.warning.object.requirescode", "Varning: <object> Taggen kr\u00e4ver kodattribut."},
            {"appletviewer.parse.warning.object.requiresheight", "Varning: <object> Taggen kr\u00e4ver h\u00f6jdattribut."},
            {"appletviewer.parse.warning.object.requireswidth", "Varning: <object> koden kr\u00e4ver breddattribut."},
            {"appletviewer.parse.warning.embed.requirescode", "Varning: <embed> koden kr\u00e4ver programkodattribut."},
            {"appletviewer.parse.warning.embed.requiresheight", "Varning: <embed> koden kr\u00e4ver h\u00f6jdattribut."},
            {"appletviewer.parse.warning.embed.requireswidth", "Varning: <embed> koden kr\u00e4ver breddattribut."},
            {"appletviewer.parse.warning.appnotLongersupported", "Varning: Taggen <app> st\u00f6ds inte l\u00e4ngre, anv\u00e4nd <applet> ist\u00e4llet:"},
            {"appletviewer.usage", "Syntax: appletviewer <alternativ> url(s)\n\nd\u00e4r <alternativ> omfattar:\n  -debug                  Starta applet-granskaren i Java-fels\u00f6karen\n  -encoding <kodning>    Ange teckenkodningen som anv\u00e4nds av HTML-filer\n  -J<k\u00f6rtidsflagga>        Skicka argumentet till Java-tolken\n\nAlternativet -J \u00e4r inte ett standardalternativ och kan \u00e4ndras utan f\u00f6reg\u00e5ende meddelande."},
            {"appletviewer.main.err.unsupportedopt", "Alternativet st\u00f6ds inte: {0}"},
            {"appletviewer.main.err.unrecognizedarg", "Ok\u00e4nt argument: {0}"},
            {"appletviewer.main.err.dupoption", "Alternativet \u00e4r duplicerat: {0}"},
            {"appletviewer.main.err.inputfile", "Inga indatafiler har angetts."},
            {"appletviewer.main.err.badurl", "Felaktig URL: {0} ( {1} )"},
            {"appletviewer.main.err.io", "I/O-undantag vid l\u00e4sning: {0}"},
            {"appletviewer.main.err.readablefile", "Kontrollera att {0} \u00e4r en l\u00e4sbar fil."},
            {"appletviewer.main.err.correcturl", "\u00c4r {0} r\u00e4tt URL?"},
            {"appletviewer.main.prop.store", "Anv\u00e4ndarspecifika egenskaper f\u00f6r AppletViewer"},
            {"appletviewer.main.err.prop.cantread", "Det g\u00e5r inte att l\u00e4sa filen med anv\u00e4ndaregenskaper: {0}"},
            {"appletviewer.main.err.prop.cantsave", "Det g\u00e5r inte att spara filen med anv\u00e4ndaregenskaper: {0}"},
            {"appletviewer.main.warn.nosecmgr", "Varning: avaktiverar s\u00e4kerheten."},
            {"appletviewer.main.debug.cantfinddebug", "Det g\u00e5r inte att hitta fels\u00f6karen!"},
            {"appletviewer.main.debug.cantfindmain", "Det g\u00e5r inte att hitta huvudmetod i fels\u00f6karen!"},
            {"appletviewer.main.debug.exceptionindebug", "Undantagsavbrott i fels\u00f6karen!"},
            {"appletviewer.main.debug.cantaccess", "Det g\u00e5r inte att h\u00e4mta fels\u00f6karen!"},
            {"appletviewer.main.nosecmgr", "Varning: SecurityManager har inte installerats!"},
            {"appletviewer.main.warning", "Varning: Inga appletar startades. Kontrollera att indata inneh\u00e5ller en <applet>-tagg."},
            {"appletviewer.main.warn.prop.overwrite", "Varning: Skriver tillf\u00e4lligt \u00f6ver systemegenskap p\u00e5 anv\u00e4ndarens beg\u00e4ran: nyckel: {0} gammalt v\u00e4rde: {1} nytt v\u00e4rde: {2}"},
            {"appletviewer.main.warn.cantreadprops", "Varning: Det g\u00e5r inte att l\u00e4sa egenskapsfilen till AppletViewer: {0} Anv\u00e4nder standardv\u00e4rden."},
            {"appletioexception.loadclass.throw.interrupted", "klassinl\u00e4sning avbr\u00f6ts: {0}"},
            {"appletioexception.loadclass.throw.notloaded", "klassen har inte l\u00e4sts in: {0}"},
            {"appletclassloader.loadcode.verbose", "\u00d6ppnar str\u00f6m till: {0} f\u00f6r att f\u00e5 {1}"},
            {"appletclassloader.filenotfound", "Fil saknas vid s\u00f6kning efter: {0}"},
            {"appletclassloader.fileformat", "Filformatundantag vid inl\u00e4sning: {0}"},
            {"appletclassloader.fileioexception", "I/O-undantag vid inl\u00e4sning: {0}"},
            {"appletclassloader.fileexception", "{0}-undantag vid inl\u00e4sning: {1}"},
            {"appletclassloader.filedeath", "{0} avslutades vid inl\u00e4sning: {1}"},
            {"appletclassloader.fileerror", "{0} fel vid inl\u00e4sning: {1}"},
            {"appletclassloader.findclass.verbose.findclass", "{0} s\u00f6k klass {1}"},
            {"appletclassloader.findclass.verbose.openstream", "\u00d6ppnar str\u00f6m till: {0} f\u00f6r att f\u00e5 {1}"},
            {"appletclassloader.getresource.verbose.forname", "AppletClassLoader.getResource f\u00f6r namnet {0}"},
            {"appletclassloader.getresource.verbose.found", "Hittade resursen {0} som en systemresurs"},
            {"appletclassloader.getresourceasstream.verbose", "Hittade resursen {0} som en systemresurs"},
            {"appletpanel.runloader.err", "Antingen objekt- eller kodparameter!"},
            {"appletpanel.runloader.exception", "undantag vid avserialisering {0}"},
            {"appletpanel.destroyed", "Appleten f\u00f6rst\u00f6rd."},
            {"appletpanel.loaded", "Appleten \u00e4r inl\u00e4st."},
            {"appletpanel.started", "Appleten har startat."},
            {"appletpanel.inited", "Appleten har initierats."},
            {"appletpanel.stopped", "Appleten har stoppats."},
            {"appletpanel.disposed", "Appleten har sl\u00e4ngts."},
            {"appletpanel.nocode", "Taggen APPLET saknar parametern CODE."},
            {"appletpanel.notfound", "inl\u00e4sning: klassen {0} finns inte."},
            {"appletpanel.nocreate", "inl\u00e4sning: kan inte skapa instans av {0}."},
            {"appletpanel.noconstruct", "inl\u00e4sning: {0} \u00e4r inte allm\u00e4n eller har ingen allm\u00e4n konstruktor."},
            {"appletpanel.death", "avslutad"},
            {"appletpanel.exception", "undantag: {0}."},
            {"appletpanel.exception2", "undantag: {0}: {1}."},
            {"appletpanel.error", "fel: {0}."},
            {"appletpanel.error2", "fel: {0}: {1}."},
            {"appletpanel.notloaded", "Init: appleten har inte l\u00e4sts in."},
            {"appletpanel.notinited", "Start: appleten har inte initierats."},
            {"appletpanel.notstarted", "Stopp: appleten har inte startats."},
            {"appletpanel.notstopped", "Destruktion: appleten har inte stoppats."},
            {"appletpanel.notdestroyed", "Sl\u00e4ng: appleten har inte f\u00f6rst\u00f6rts."},
            {"appletpanel.notdisposed", "Inl\u00e4sning: appletten har inte sl\u00e4ngts."},
            {"appletpanel.bail", "Avbruten: avaktiverar."},
            {"appletpanel.filenotfound", "Fil saknas vid s\u00f6kning efter: {0}"},
            {"appletpanel.fileformat", "Filformatundantag vid inl\u00e4sning: {0}"},
            {"appletpanel.fileioexception", "I/O-undantag vid inl\u00e4sning: {0}"},
            {"appletpanel.fileexception", "{0}-undantag vid inl\u00e4sning: {1}"},
            {"appletpanel.filedeath", "{0} avslutades vid inl\u00e4sning: {1}"},
            {"appletpanel.fileerror", "{0} fel vid inl\u00e4sning: {1}"},
            {"appletpanel.badattribute.exception", "Html-tolkning: felaktigt v\u00e4rde f\u00f6r h\u00f6jd-breddattribut"},
            {"appletillegalargumentexception.objectinputstream", "AppletObjectInputStream kr\u00e4ver inl\u00e4sare som inte \u00e4r tom"},
            {"appletprops.title", "Egenskaper f\u00f6r AppletViewer"},
            {"appletprops.label.http.server", "Proxy-server f\u00f6r HTTP:"},
            {"appletprops.label.http.proxy", "HTTP-proxyns port:"},
            {"appletprops.label.network", "N\u00e4tverks\u00e5tkomst:"},
            {"appletprops.choice.network.item.none", "Inget"},
            {"appletprops.choice.network.item.applethost", "Applet-v\u00e4rd"},
            {"appletprops.choice.network.item.unrestricted", "Obegr\u00e4nsad"},
            {"appletprops.label.class", "Klass\u00e5tkomst:"},
            {"appletprops.choice.class.item.restricted", "Begr\u00e4nsad"},
            {"appletprops.choice.class.item.unrestricted", "Obegr\u00e4nsad"},
            {"appletprops.label.unsignedapplet", "Till\u00e5t osignerade appletar:"},
            {"appletprops.choice.unsignedapplet.no", "Nej"},
            {"appletprops.choice.unsignedapplet.yes", "Ja"},
            {"appletprops.button.apply", "Utf\u00f6r"},
            {"appletprops.button.cancel", "Avbryt"},
            {"appletprops.button.reset", "\u00c5terst\u00e4ll"},
            {"appletprops.apply.exception", "Kunde inte spara egenskaperna: {0}"},
            /* 4066432 */
            {"appletprops.title.invalidproxy", "Ogiltig inmatning"},
            {"appletprops.label.invalidproxy", "Proxyporten m\u00e5ste anges som ett positivt heltal"},
            {"appletprops.button.ok", "OK"},
            /* end 4066432 */
            {"appletprops.prop.store", "Anv\u00e4ndarspecifika egenskaper f\u00f6r AppletViewer"},
            {"appletsecurityexception.checkcreateclassloader", "S\u00e4kerhetsundantag: klassinl\u00e4sare"},
            {"appletsecurityexception.checkaccess.thread", "S\u00e4kerhetsundantag: tr\u00e5d"},
            {"appletsecurityexception.checkaccess.threadgroup", "S\u00e4kerhetsundantag: tr\u00e5dgruppen {0}"},
            {"appletsecurityexception.checkexit", "S\u00e4kerhetsundantag: exit-punkten {0}"},
            {"appletsecurityexception.checkexec", "S\u00e4kerhetsundantag: programfilen {0}"},
            {"appletsecurityexception.checklink", "S\u00e4kerhetsundantag: l\u00e4nken {0}"},
            {"appletsecurityexception.checkpropsaccess", "S\u00e4kerhetsundantag: egenskaperna"},
            {"appletsecurityexception.checkpropsaccess.key", "S\u00e4kerhetsundantag: egenskaps\u00e5tkomsten {0}"},
            {"appletsecurityexception.checkread.exception1", "S\u00e4kerhetsundantag: {0}, {1}"},
            {"appletsecurityexception.checkread.exception2", "S\u00e4kerhetsundantag: file.read: {0}"},
            {"appletsecurityexception.checkread", "S\u00e4kerhetsundantag: file.read: {0} == {1}"},
            {"appletsecurityexception.checkwrite.exception", "S\u00e4kerhetsundantag: {0}, {1}"},
            {"appletsecurityexception.checkwrite", "S\u00e4kerhetsundantag: file.write: {0} == {1}"},
            {"appletsecurityexception.checkread.fd", "S\u00e4kerhetsundantag: fd.read"},
            {"appletsecurityexception.checkwrite.fd", "S\u00e4kerhetsundantag: fd.write"},
            {"appletsecurityexception.checklisten", "S\u00e4kerhetsundantag: socket.listen: {0}"},
            {"appletsecurityexception.checkaccept", "S\u00e4kerhetsundantag: socket.accept: {0}:{1}"},
            {"appletsecurityexception.checkconnect.networknone", "S\u00e4kerhetsundantag: socket.connect: {0}->{1}"},
            {"appletsecurityexception.checkconnect.networkhost1", "S\u00e4kerhetsundantag: Kan inte koppla upp till {0} som kommer fr\u00e5n {1}."},
            {"appletsecurityexception.checkconnect.networkhost2", "S\u00e4kerhetsundantag: Kan inte \u00f6vers\u00e4tta adressen f\u00f6r v\u00e4rdsystemet {0} eller for {1}. "},
            {"appletsecurityexception.checkconnect.networkhost3", "S\u00e4kerhetsundantag: Kan inte \u00f6vers\u00e4tta adressen f\u00f6r v\u00e4rdsystemet {0}. Kontrollera egenskapen trustProxy."},
            {"appletsecurityexception.checkconnect", "S\u00e4kerhetsundantag: uppkoppling: {0}->{1}"},
            {"appletsecurityexception.checkpackageaccess", "S\u00e4kerhetsundantag: f\u00e5r inte \u00e5tkomst till paketet: {0}"},
            {"appletsecurityexception.checkpackagedefinition", "S\u00e4kerhetsundantag: kan inte definiera paketet: {0}"},
            {"appletsecurityexception.cannotsetfactory", "S\u00e4kerhetsundantag: kan inte st\u00e4lla in factory"},
            {"appletsecurityexception.checkmemberaccess", "S\u00e4kerhetsundantag: kontrollera medlems\u00e5tkomst"},
            {"appletsecurityexception.checkgetprintjob", "S\u00e4kerhetsundantag: getPrintJob"},
            {"appletsecurityexception.checksystemclipboardaccess", "S\u00e4kerhetsundantag: getSystemClipboard"},
            {"appletsecurityexception.checkawteventqueueaccess", "S\u00e4kerhetsundantag: getEventQueue"},
            {"appletsecurityexception.checksecurityaccess", "S\u00e4kerhetsundantag: s\u00e4kerhetsbearbetning: {0}"},
            {"appletsecurityexception.getsecuritycontext.unknown", "Ok\u00e4nd typ av klassinl\u00e4sare. Kan inte leta efter getContext"},
            {"appletsecurityexception.checkread.unknown", "Ok\u00e4nd typ av klassinl\u00e4sare. Kan inte leta efter checking read {0}"},
            {"appletsecurityexception.checkconnect.unknown", "Ok\u00e4nd typ av klassinl\u00e4sare. Kan inte leta efter checking connect"},
        };
    }
}