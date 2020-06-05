package io.github.terickson87.mvvm.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import io.github.terickson87.mvvm.R;
import io.github.terickson87.mvvm.models.NicePlace;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private static final String TAG = "RecyclerAdapter";
    private List<NicePlace> mNicePlaces = new ArrayList<>();
    private Context mContext;

    public RecyclerAdapter(Context context, List<NicePlace> nicePlaces) {
        super();
        mContext = context;
        mNicePlaces = nicePlaces;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_nice_place_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called on position " + position);
        NicePlace nicePlace = mNicePlaces.get(position);

        String title = nicePlace.getTitle();
        holder.mLnpiTextView.setText(title);

        String iconUrl = nicePlace.getImageUrl();
        Context context = holder.mLnpiImageView.getContext();
        Picasso.with(context).load(iconUrl).into(holder.mLnpiImageView);

        holder.mLnpiCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "OnClick: clicked on: " + title);
                Toast.makeText(mContext, title, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mNicePlaces.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView mLnpiImageView;
        TextView mLnpiTextView;
        CardView mLnpiCardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mLnpiImageView = itemView.findViewById(R.id.lnpi_image);
            mLnpiTextView = itemView.findViewById(R.id.lnpi_text);
            mLnpiCardView = itemView.findViewById(R.id.lnpi_cardview);

        }
    }
}
