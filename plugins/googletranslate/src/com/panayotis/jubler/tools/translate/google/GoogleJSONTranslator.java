/*
 *
 * This file is part of Jubler.
 *
 * Jubler is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 2.
 *
 *
 * Jubler is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Jubler; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 */
package com.panayotis.jubler.tools.translate.google;

import com.panayotis.jubler.plugins.Plugin;
import com.panayotis.jubler.tools.translate.AvailTranslators;
import static com.panayotis.jubler.i18n.I18N._;

import com.panayotis.jubler.tools.translate.GenericWebTranslator;
import com.panayotis.jubler.tools.translate.Language;

import java.net.MalformedURLException;
import java.util.Vector;

/**
 *
 * @author teras
 */
public class GoogleJSONTranslator extends GenericWebTranslator implements Plugin {

    private static Vector<Language> lang;


    static {
        lang = new Vector<Language>();
        lang.add(new Language("sq", _("Albanian")));
        lang.add(new Language("ar", _("Arabic")));
        lang.add(new Language("bg", _("Bulgarian")));
        lang.add(new Language("ca", _("Catalan")));
        lang.add(new Language("zh-CN", _("Chinese (Simplified)")));
        lang.add(new Language("zh-TW", _("Chinese (Traditional)")));
        lang.add(new Language("hr", _("Croatian")));
        lang.add(new Language("cs", _("Czech")));
        lang.add(new Language("da", _("Danish")));
        lang.add(new Language("nl", _("Dutch")));
        lang.add(new Language("en", _("English")));
        lang.add(new Language("et", _("Estonian")));
        lang.add(new Language("tl", _("Filipino")));
        lang.add(new Language("fi", _("Finnish")));
        lang.add(new Language("fr", _("French")));
        lang.add(new Language("gl", _("Galician")));
        lang.add(new Language("de", _("German")));
        lang.add(new Language("el", _("Greek")));
        lang.add(new Language("hi", _("Hindi")));
        lang.add(new Language("hu", _("Hungarian")));
        lang.add(new Language("id", _("Indonesian")));
        lang.add(new Language("it", _("Italian")));
        lang.add(new Language("ja", _("Japanese")));
        lang.add(new Language("ko", _("Korean")));
        lang.add(new Language("lv", _("Latvian")));
        lang.add(new Language("lt", _("Lithuanian")));
        lang.add(new Language("mt", _("Maltese")));
        lang.add(new Language("no", _("Norwegian")));
        lang.add(new Language("pl", _("Polish")));
        lang.add(new Language("pt", _("Portuguese")));
        lang.add(new Language("ro", _("Romanian")));
        lang.add(new Language("ru", _("Russian")));
        lang.add(new Language("sr", _("Serbian")));
        lang.add(new Language("sk", _("Slovak")));
        lang.add(new Language("sl", _("Slovenian")));
        lang.add(new Language("es", _("Spanish")));
        lang.add(new Language("sv", _("Swedish")));
        lang.add(new Language("th", _("Thai")));
        lang.add(new Language("tr", _("Turkish")));
        lang.add(new Language("uk", _("Ukrainian")));
        lang.add(new Language("vi", _("Vietnamese")));
    }

    public GoogleJSONTranslator() {
        super();
        setSubtitleBlock(10);
    }

    protected Vector<Language> getLanguages() {
        return lang;
    }

    public String getDefinition() {
        return _("Google translate") + " (JSON)";
    }

    public String getDefaultSourceLanguage() {
        return _("English");
    }

    public String getDefaultDestinationLanguage() {
        return _("French");
    }

    protected String getTranslationURL(String from_language, String to_language) throws MalformedURLException {
        return "http://ajax.googleapis.com/ajax/services/language/translate?v=1.0&langpair=" + findLanguage(from_language) + "%7C" + findLanguage(to_language);
    }

    protected String retrieveSubData(String line) {
        int from = line.indexOf("translatedText");
        if (from >= 0) {
            from += "translatedText\":\"".length();
            int to = line.indexOf("\"},", from);
            return line.substring(from, to);
        }
        return null;
    }

    protected String getQueryTag() {
        return "&q";
    }

    protected boolean isProtocolPOST() {
        return false;
    }

    protected String makeIDTag(int id) {
        return "S" + id + ".";
    }

    protected String getNewLineTag() {
        return "\n";
    }

    protected boolean isIDTag(String data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    protected int getIDTagFromData(String data) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String[] getAffectionList() {
        return new String[]{"com.panayotis.jubler.tools.translate.AvailTranslators"};
    }

    public void postInit(Object o) {
        if (o instanceof AvailTranslators) {
            AvailTranslators av = (AvailTranslators) o;
            av.add(this);
        }
    }
}