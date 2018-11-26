package project.cn.edu.tongji.sse.nowfitness.presenter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import project.cn.edu.tongji.sse.nowfitness.R;
import project.cn.edu.tongji.sse.nowfitness.view.MomentsView;

/**
 * Created by a on 2018/11/23.
 */

public class MomentsPresenter {
    private RecyclerView momentsRecyclerView;
    private MomentsView momentsView;
    private List<String> mMomentsLab;

    public void setMomentsRecyerView(RecyclerView recyclerView){
        this.momentsRecyclerView=recyclerView;
    }

    public void likeOrDislike(){

    }
    public MomentsPresenter(MomentsView momentsView){
        this.momentsView = momentsView;
        mMomentsLab = new ArrayList<>();
    }

    public void initView(){
        momentsView.initView();
        setAdapter();
    }
    private void setAdapter(){
        momentsRecyclerView.setAdapter(new MomentsRecyclerAdapter());
    }


    public class MomentsRecyclerAdapter extends RecyclerView.Adapter<MomentsView.MomentsViewHolder > {

        private static final int IMAGE_TYPE = 0;
        private static final int NO_IMAGE_TYPE = 1;

        private Context mContext;

        public MomentsRecyclerAdapter(){
            init();
        }
        private void init(){
            mMomentsLab.add("OMFFFF");
            mMomentsLab.add("OMFFFFf");
            mMomentsLab.add("OMFFFF");
            mMomentsLab.add("OMFFFF");
            mMomentsLab.add("OMFFFFf");
            mMomentsLab.add("OMFFFF");
            mMomentsLab.add("OMFFFF");
            mMomentsLab.add("OMFFFFf");
            mMomentsLab.add("OMFFFFf");
            mMomentsLab.add("OMFFFFf");
            mMomentsLab.add("OMFFFFf");
            mMomentsLab.add("OMFFFFf");
        }
        @NonNull
        @Override
        public MomentsView.MomentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
                View itemView = inflater.inflate(R.layout.moments_item, parent, false);
            return momentsView.new MomentsViewHolder(itemView);
        }
        @Override
        public void onBindViewHolder(@NonNull MomentsView.MomentsViewHolder holder, int position) {
           holder.onBindMomentsData(mMomentsLab.get(position));
        }
        @Override
        public int getItemCount() {
            return mMomentsLab.size();
        }

        @Override
        public int getItemViewType(int position) {
            if (position % 4 == 0) {
                return IMAGE_TYPE;
            }
            return NO_IMAGE_TYPE;
        }

    }


}