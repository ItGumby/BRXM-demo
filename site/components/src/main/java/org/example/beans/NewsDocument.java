package org.example.beans;

import java.util.Calendar;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.example.beans.Pictures;

@HippoEssentialsGenerated(internalName = "brxm15.2.2:newsdocument")
@Node(jcrType = "brxm15.2.2:newsdocument")
public class NewsDocument extends HippoDocument {
    /** 
     * The document type of the news document.
     */
    public static final String DOCUMENT_TYPE = "brxm15.2.2:newsdocument";
    private static final String TITLE = "brxm15.2.2:title";
    private static final String DATE = "brxm15.2.2:date";
    private static final String INTRODUCTION = "brxm15.2.2:introduction";
    private static final String IMAGE = "brxm15.2.2:image";
    private static final String CONTENT = "brxm15.2.2:content";
    private static final String LOCATION = "brxm15.2.2:location";
    private static final String AUTHOR = "brxm15.2.2:author";
    private static final String SOURCE = "brxm15.2.2:source";

    /** 
     * Get the title of the document.
     * @return the title
     */
    @HippoEssentialsGenerated(internalName = "brxm15.2.2:title")
    public String getTitle() {
        return getSingleProperty(TITLE);
    }

    /** 
     * Get the date of the document.
     * @return the date
     */
    @HippoEssentialsGenerated(internalName = "brxm15.2.2:date")
    public Calendar getDate() {
        return getSingleProperty(DATE);
    }

    /** 
     * Get the introduction of the document.
     * @return the introduction
     */
    @HippoEssentialsGenerated(internalName = "brxm15.2.2:introduction")
    public String getIntroduction() {
        return getSingleProperty(INTRODUCTION);
    }

    /** 
     * Get the main content of the document.
     * @return the content
     */
    @HippoEssentialsGenerated(internalName = "brxm15.2.2:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    /** 
     * Get the location of the document.
     * @return the location
     */
    @HippoEssentialsGenerated(internalName = "brxm15.2.2:location")
    public String getLocation() {
        return getSingleProperty(LOCATION);
    }

    /** 
     * Get the author of the document.
     * @return the author
     */
    @HippoEssentialsGenerated(internalName = "brxm15.2.2:author")
    public String getAuthor() {
        return getSingleProperty(AUTHOR);
    }

    /** 
     * Get the source of the document.
     * @return the source
     */
    @HippoEssentialsGenerated(internalName = "brxm15.2.2:source")
    public String getSource() {
        return getSingleProperty(SOURCE);
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:image")
    public Pictures getImage() {
        return getLinkedBean("brxm15.2.2:image", Pictures.class);
    }
}
