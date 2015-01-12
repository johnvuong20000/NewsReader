package com.usabusi.newsreader;
//https://gist.github.com/buddhists/d58f9f2e8744a65bb158
//https://developer.android.com/samples/SwipeRefreshListFragment/src/com.example.android.swiperefreshlistfragment/SwipeRefreshListFragment.html

//import android.app.ListFragment;
        import android.content.Context;
        import android.os.Bundle;
        import android.support.v4.view.ViewCompat;
        import android.support.v4.widget.SwipeRefreshLayout;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ListView;
import android.support.v4.app.ListFragment;


/**
 * Created by Jeff on 6/30/14.
 * Taken from Android Samples SwipeRefreshListFragment
 * https://developer.android.com/samples/SwipeRefreshListFragment/src/com.example.android.swiperefreshlistfragment/SwipeRefreshListFragment.html
 */
public class SwipeRefreshListFragment extends ListFragment {
    @SuppressWarnings("UnusedDeclaration")
    private static final String TAG = SwipeRefreshListFragment.class.getSimpleName();

    private SwipeRefreshLayout mSwipeRefreshLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create the list fragment's content view by calling the super method
        final View listFragmentView = super.onCreateView(inflater, container, savedInstanceState);

        //http://stackoverflow.com/questions/8215308/using-context-in-fragment
        // Now create a SwipeRefreshLayout to wrap the fragment's content view
        if (container==null)
            mSwipeRefreshLayout = new ListFragmentSwipeRefreshLayout(getActivity().getApplicationContext());
         else
            mSwipeRefreshLayout = new ListFragmentSwipeRefreshLayout(container.getContext());

        // Add the list fragment's content view to the SwipeRefreshLayout, making sure that it fills
        // the SwipeRefreshLayout
        assert listFragmentView != null;
        mSwipeRefreshLayout.addView(listFragmentView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        // Make sure that the SwipeRefreshLayout will fill the fragment
        mSwipeRefreshLayout.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT));

        // Now return the SwipeRefreshLayout as this fragment's content view
        return mSwipeRefreshLayout;
    }

    /**
     * Set the SwipeRefreshLayout.OnRefreshListener to listen for initiated refreshes.
     *
     * @see android.support.v4.widget.SwipeRefreshLayout#setOnRefreshListener(android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener)
     */
    public void setOnRefreshListener(SwipeRefreshLayout.OnRefreshListener listener) {
        mSwipeRefreshLayout.setOnRefreshListener(listener);
    }

    /**
     * Returns whether the SwipeRefreshLayout} is currently refreshing or not.
     *
     * @see android.support.v4.widget.SwipeRefreshLayout#isRefreshing()
     */
    public boolean isRefreshing() {
        return mSwipeRefreshLayout.isRefreshing();
    }

    /**
     * Set whether the SwipeRefreshLayout} should be displaying that it is refreshing or not.
     *
     * @see android.support.v4.widget.SwipeRefreshLayout#setRefreshing(boolean)
     */
    public void setRefreshing(boolean refreshing) {
        mSwipeRefreshLayout.setRefreshing(refreshing);
    }

    /**
     * Set the color scheme for the SwipeRefreshLayout.
     *
     * @see android.support.v4.widget.SwipeRefreshLayout#setColorScheme(int, int, int, int)
     */
    public void setColorScheme(int colorRes1, int colorRes2, int colorRes3, int colorRes4) {
        mSwipeRefreshLayout.setColorScheme(colorRes1, colorRes2, colorRes3, colorRes4);
    }

    /**
     * @return the fragment's SwipeRefreshLayout widget.
     */
    public SwipeRefreshLayout getSwipeRefreshLayout() {
        return mSwipeRefreshLayout;
    }

    /**
     * Sub-class of SwipeRefreshLayout for use in this ListFragment. The reason that this is needed
     * is because SwipeRefreshLayout only supports a single child, which it expects to be the one
     * which triggers refreshes. In our case the layout's child is the content view returned from
     * ListFragment#onCreateView(LayoutInflater, ViewGroup, Bundle) which is a ViewGroup.
     *
     * To enable 'swipe-to-refresh' support via the ListView we need to override the default
     * behavior and properly signal when a gesture is possible. This is done by overriding
     * canChildScrollUp().
     */
    private class ListFragmentSwipeRefreshLayout extends SwipeRefreshLayout {

        public ListFragmentSwipeRefreshLayout(Context context) {
            super(context);
        }

        /**
         * As mentioned above, we need to override this method to properly signal when a
         * 'swipe-to-refresh' is possible.
         *
         * @return true if the ListView is visible and can scroll up.
         */
        @Override
        public boolean canChildScrollUp() {
            final ListView listView = getListView();
            View emptyView = null;

            if (listView != null) {
                emptyView = listView.getEmptyView();
            }

            if ( listView != null && listView.getVisibility() == VISIBLE ) {
                return ViewCompat.canScrollVertically(listView, -1);
            } else if(emptyView != null && emptyView.getVisibility() == VISIBLE) {
                return ViewCompat.canScrollVertically(emptyView, -1);
            } else {
                return false;
            }
        }
    }


    /**
     * Utility method to check whether a {@link ListView} can scroll up from it's current position.
     * Handles platform version differences, providing backwards compatible functionality where
     * needed.
     */
    private static boolean canListViewScrollUp(ListView listView) {
        if (android.os.Build.VERSION.SDK_INT >= 14) {
            // For ICS and above we can call canScrollVertically() to determine this
            return ViewCompat.canScrollVertically(listView, -1);
        } else {
            // Pre-ICS we need to manually check the first visible item and the child view's top
            // value
            return listView.getChildCount() > 0 &&
                    (listView.getFirstVisiblePosition() > 0
                            || listView.getChildAt(0).getTop() < listView.getPaddingTop());
        }
    }
}