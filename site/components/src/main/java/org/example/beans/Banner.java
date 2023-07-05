package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.example.beans.Pictures;

@HippoEssentialsGenerated(internalName = "brxm15.2.2:bannerdocument")
@Node(jcrType = "brxm15.2.2:bannerdocument")
public class Banner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "brxm15.2.2:title")
    public String getTitle() {
        return getSingleProperty("brxm15.2.2:title");
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:content")
    public HippoHtml getContent() {
        return getHippoHtml("brxm15.2.2:content");
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:link")
    public HippoBean getLink() {
        return getLinkedBean("brxm15.2.2:link", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:image")
    public Pictures getImage() {
        return getLinkedBean("brxm15.2.2:image", Pictures.class);
    }
}
