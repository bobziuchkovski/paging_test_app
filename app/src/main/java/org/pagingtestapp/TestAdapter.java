package org.pagingtestapp;

import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

public class TestAdapter extends PagingDataAdapter<String, TestAdapter.StringViewHolder> {
    public TestAdapter() {
        super(new StringDiffCallback());
    }

    @NonNull
    @Override
    public StringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StringViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(@NonNull StringViewHolder holder, int position) {
        String item = getItem(position);
        holder.textView.setText(item);
    }

    public static class StringViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public StringViewHolder(TextView v) {
            super(v);
            textView = v;
        }
    }

    public static class StringDiffCallback extends DiffUtil.ItemCallback<String> {
        @Override
        public boolean areItemsTheSame(@NonNull String oldItem, @NonNull String newItem) {
            return oldItem.equals(newItem);
        }

        @Override
        public boolean areContentsTheSame(@NonNull String oldItem, @NonNull String newItem) {
            return oldItem.equals(newItem);
        }
    }
}