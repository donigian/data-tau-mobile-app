/**
 * Created by arm on 9/29/17.
 */
package com.tau.data.datatau;

import java.util.ArrayList;
import java.util.List;

import com.tau.data.datatau.model.NewsArticle;

/**
 * Created by sohammondal on 26/10/16.
 */

public class NewsStore {
    private static List<NewsArticle> newsArticles = new ArrayList<>();

    public static List<NewsArticle> getNewsArticles() {
        return newsArticles;
    }

    public static void setNewsArticles(List<NewsArticle> newsArticles) {
        NewsStore.newsArticles = newsArticles;
    }
}
