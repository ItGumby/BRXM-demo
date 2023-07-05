package org.example.beans;

/*
 * Copyright 2014-2023 Bloomreach
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.List;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.onehippo.cms7.essentials.components.model.AuthorEntry;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

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

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:image")
    public HippoGalleryImageSet getImage() {
        return getLinkedBean(IMAGE, HippoGalleryImageSet.class);
    }

  	@HippoEssentialsGenerated(internalName = "brxm15.2.2:accounts")
	  public List<Account> getAccounts() {
		    return getChildBeansByName(ACCOUNTS, Account.class);
	  }
}
