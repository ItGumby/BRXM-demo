package org.example.beans;

import java.util.List;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.onehippo.cms7.essentials.components.model.AuthorEntry;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.example.beans.Pictures;

@HippoEssentialsGenerated(internalName = "brxm15.2.2:author")
@Node(jcrType = "brxm15.2.2:author")
public class Author extends HippoDocument implements AuthorEntry {
    public static final String ROLE = "brxm15.2.2:role";
    public static final String ACCOUNTS = "brxm15.2.2:accounts";
    public static final String FULL_NAME = "brxm15.2.2:fullname";
    public static final String IMAGE = "brxm15.2.2:image";
    public static final String CONTENT = "brxm15.2.2:content";

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:fullname")
    public String getFullName() {
        return getSingleProperty(FULL_NAME);
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:role")
    public String getRole() {
        return getSingleProperty(ROLE);
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:accounts")
    public List<Account> getAccounts() {
        return getChildBeansByName(ACCOUNTS, Account.class);
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:image")
    public Pictures getImage() {
        return getLinkedBean("brxm15.2.2:image", Pictures.class);
    }
}
