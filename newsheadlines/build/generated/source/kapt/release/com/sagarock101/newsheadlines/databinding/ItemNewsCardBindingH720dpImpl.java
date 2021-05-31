package com.sagarock101.newsheadlines.databinding;
import com.sagarock101.newsheadlines.R;
import com.sagarock101.newsheadlines.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemNewsCardBindingH720dpImpl extends ItemNewsCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cl_news_card, 4);
        sViewsWithIds.put(R.id.view_alpha_layer, 5);
        sViewsWithIds.put(R.id.iv_selector, 6);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemNewsCardBindingH720dpImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemNewsCardBindingH720dpImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[5]
            );
        this.ivNewsImg.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.tvNewsSource.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.article == variableId) {
            setArticle((com.sagarock101.database.model.Articles) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.sagarock101.newsheadlines.viewmodel.NewsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArticle(@Nullable com.sagarock101.database.model.Articles Article) {
        this.mArticle = Article;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.article);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.sagarock101.newsheadlines.viewmodel.NewsViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String articleUrlToImage = null;
        java.sql.Timestamp articlePublishedAt = null;
        java.lang.String articleTitle = null;
        com.sagarock101.database.model.Articles article = mArticle;
        com.sagarock101.database.model.Source articleSource = null;
        java.lang.String articleSourceName = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (article != null) {
                    // read article.urlToImage
                    articleUrlToImage = article.getUrlToImage();
                    // read article.publishedAt
                    articlePublishedAt = article.getPublishedAt();
                    // read article.title
                    articleTitle = article.getTitle();
                    // read article.source
                    articleSource = article.getSource();
                }


                if (articleSource != null) {
                    // read article.source.name
                    articleSourceName = articleSource.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.sagarock101.newsheadlines.binding.NewsHeadlinesBndingKt.setImage(this.ivNewsImg, articleUrlToImage);
            com.sagarock101.newsheadlines.binding.NewsHeadlinesBndingKt.bindSourceAndTime(this.tvNewsSource, articleSourceName, articlePublishedAt);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, articleTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): article
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}