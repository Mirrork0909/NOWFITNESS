package project.cn.edu.tongji.sse.nowfitness.data;

import android.net.Uri;

import org.json.JSONObject;

import io.reactivex.Single;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import project.cn.edu.tongji.sse.nowfitness.data.network.ApiInterface;
import project.cn.edu.tongji.sse.nowfitness.model.CommentsDetailModel;
import project.cn.edu.tongji.sse.nowfitness.model.UserInfoModel;
import retrofit2.http.GET;

public interface APIRepository {

    Single verifyInfo(RequestBody userName, RequestBody passWord);

    Single applyInfo(RequestBody userName,RequestBody passWord);

    Single queryUserInfo(String userName);

    Single postUserAvatar(MultipartBody.Part file,RequestBody body);

    Single getStarsInfo (int userId,int pageNum);

    Single getNeighborInfo(int userId, int pageNum);

    //omf
    Single getCommentsInfo(int momentsId);
    //omf
    Single makeNewCommentInfo(RequestBody body);

    Single makeReply(RequestBody body);

    Single putUserInfo(UserInfoModel userInfoObject);

    Single postMoment(RequestBody userId,RequestBody content,MultipartBody.Part file);

    Single postMomentWithoutFile(RequestBody userId,RequestBody content);

    Single deleteComment(int commentsId);

    Single postLikeInfo(int momentsId,int likesId);

    Single delLikeInfo(int momentsId,int likesId);

    Single postFollowInfo(int userId,int followId);

    Single deleteFollowInfo(int userId,int followId);
}