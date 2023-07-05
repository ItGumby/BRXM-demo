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
import java.util.Calendar;
import java.util.List;

import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoDocument;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import org.onehippo.cms7.essentials.components.model.Authors;
import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;

@HippoEssentialsGenerated(internalName = "brxm15.2.2:blogpost")
@Node(jcrType = "brxm15.2.2:blogpost")
public class Blogpost extends HippoDocument implements Authors {

    public static final String TITLE = "brxm15.2.2:title";
    public static final String INTRODUCTION = "brxm15.2.2:introduction";
    public static final String CONTENT = "brxm15.2.2:content";
    public static final String PUBLICATION_DATE = "brxm15.2.2:publicationdate";
    public static final String CATEGORIES = "brxm15.2.2:categories";
    public static final String AUTHOR = "brxm15.2.2:author";
    public static final String AUTHOR_NAMES = "brxm15.2.2:authornames";
    public static final String LINK = "brxm15.2.2:link";
    public static final String AUTHORS = "brxm15.2.2:authors";
    public static final String TAGS = "hippostd:tags";

   @HippoEssentialsGenerated(internalName = "brxm15.2.2:publicationdate")
    public Calendar getPublicationDate() {
        return getSingleProperty(PUBLICATION_DATE);
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:authornames")
    public String[] getAuthorNames() {
        return getMultipleProperty(AUTHOR_NAMES);
    }

    public String getAuthor() {
        final String[] authorNames = getAuthorNames();
        if(authorNames !=null && authorNames.length > 0){
            return authorNames[0];
        }
        return null;
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:title")
    public String getTitle() {
        return getSingleProperty(TITLE);
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:content")
    public HippoHtml getContent() {
        return getHippoHtml(CONTENT);
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:introduction")
    public String getIntroduction() {
        return getSingleProperty(INTRODUCTION);
    }

    @HippoEssentialsGenerated(internalName = "brxm15.2.2:categories")
    public String[] getCategories() {
        return getMultipleProperty(CATEGORIES);
    }

    @Override
    @HippoEssentialsGenerated(internalName = "brxm15.2.2:authors")
    public List<Author> getAuthors() {
        return getLinkedBeans(AUTHORS, Author.class);
    }
}