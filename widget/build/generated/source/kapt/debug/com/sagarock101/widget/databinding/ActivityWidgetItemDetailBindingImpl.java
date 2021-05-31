package com.sagarock101.widget.databinding;
import com.sagarock101.widget.R;
import com.sagarock101.widget.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityWidgetItemDetailBindingImpl extends ActivityWidgetItemDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar, 5);
        sViewsWithIds.put(R.id.collapsing_toolbar, 6);
        sViewsWithIds.put(R.id.iv_gradient, 7);
        sViewsWithIds.put(R.id.toolbar, 8);
        sViewsWithIds.put(R.id.iv_back, 9);
        sViewsWithIds.put(R.id.nsv_container, 10);
        sViewsWithIds.put(R.id.cl_container, 11);
        sViewsWithIds.put(R.id.cv_content, 12);
        sViewsWithIds.put(R.id.btn_read_full_story, 13);
        sViewsWithIds.put(R.id.ll_fab, 14);
        sViewsWithIds.put(R.id.fabSave, 15);
        sViewsWithIds.put(R.id.fabShare, 16);
        sViewsWithIds.put(R.id.fabAdd, 17);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityWidgetItemDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private ActivityWidgetItemDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[5]
            , (android.widget.Button) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[12]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[17]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[15]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[16]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[14]
            , (androidx.core.widget.NestedScrollView) bindings[10]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.colParent.setTag(null);
        this.ivNewsImg.setTag(null);
        this.tvContent.setTag(null);
        this.tvDesc.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        java.lang.String articleContent = null;
        java.lang.String utilsTruncateExtraArticleContent = null;
        java.lang.String articleTitle = null;
        java.lang.String articleDescription = null;
        java.lang.String articleUrlToImage = null;
        com.sagarock101.database.model.Articles article = mArticle;

        if ((dirtyFlags & 0x3L) != 0) {



                if (article != null) {
                    // read article.content
                    articleContent = article.getContent();
                    // read article.title
                    articleTitle = article.getTitle();
                    // read article.description
                    articleDescription = article.getDescription();
                    // read article.urlToImage
                    articleUrlToImage = article.getUrlToImage();
                }


                // read Utils.truncateExtra(article.content)
                utilsTruncateExtraArticleContent = com.sagarock101.core.utils.Utils.truncateExtra(articleContent);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.sagarock101.widget.WidgetBindingsKt.setImage(this.ivNewsImg, articleUrlToImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvContent, utilsTruncateExtraArticleContent);
            com.sagarock101.widget.WidgetBindingsKt.bindTextLikeNewsText(this.tvDesc, articleDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, articleTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): article
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}