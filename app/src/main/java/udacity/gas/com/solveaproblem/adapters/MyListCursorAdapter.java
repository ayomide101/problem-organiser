package udacity.gas.com.solveaproblem.adapters;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import udacity.gas.com.solveaproblem.R;

/**
 * Created by skyfishjy on 10/31/14.
 */
public class MyListCursorAdapter extends CursorRecyclerViewAdapter<MyListCursorAdapter.ViewHolder> {

	public MyListCursorAdapter(Context context, Cursor cursor) {
		super(context, cursor);
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.d, parent, false);
		ViewHolder vh = new ViewHolder(itemView);
		return vh;
	}

	@Override
	public void onBindViewHolder(ViewHolder viewHolder, Cursor cursor) {
		MyListItem myListItem = MyListItem.fromCursor(cursor);
		viewHolder.mTextView.setText(myListItem.getName());
	}

	public static class ViewHolder extends RecyclerView.ViewHolder {
		public TextView mTextView;
		public ViewHolder(View view) {
			super(view);
			mTextView = (TextView) view.findViewById(R.id.text);
		}
	}
}