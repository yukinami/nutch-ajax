package org.apache.nutch.parse.s2jh;

import org.apache.nutch.parse.HTMLMetaTags;
import org.apache.nutch.parse.Parse;
import org.apache.nutch.storage.WebPage;
import org.w3c.dom.DocumentFragment;

/**
 * @author snowblink on 16/9/21.
 */
public class NoOpHtmlParseFilter extends AbstractHtmlParseFilter {

    @Override
    protected String getUrlFilterRegex() {
        return null;
    }

    @Override
    protected boolean isParseDataFetchLoadedInternal(String url, String html) {
        return true;
    }

    @Override
    protected boolean isContentMatchedForParse(String url, String html) {
        return true;
    }

    @Override
    public Parse filterInternal(String url, WebPage page, Parse parse, HTMLMetaTags metaTags, DocumentFragment doc) throws Exception {
        return parse;
    }
}
