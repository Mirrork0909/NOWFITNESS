package project.cn.edu.tongji.sse.nowfitness.greendao.db;

import java.util.List;

import project.cn.edu.tongji.sse.nowfitness.model.IndiInfoModel;
import project.cn.edu.tongji.sse.nowfitness.model.IndiRelationModel;

public class DaoMethod {


    //查询成功时返回List<IndiInfoModel>
    //当查询为空时,List的size为0
    //该表针对每个ID,只有一条记录,所以读取时,先判断是否为空,若不为空,直接get(0)获取
    public static List<IndiInfoModel> queryForIndiInfo(int id){
        return DaoManager.getDaoInstance().getDaoSession().getIndiInfoModelDao()
                .queryBuilder().where(IndiInfoModelDao.Properties.Id.eq(id)).list();
    }

    public static boolean updateIndiInfo(IndiInfoModel infoModel){
        try{
            DaoManager.getDaoInstance().getDaoSession().getIndiInfoModelDao()
                    .update(infoModel);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }




    public static List<IndiRelationModel> queryForStarRelation(int id){
        return DaoManager.getDaoInstance().getDaoSession().getIndiRelationModelDao()
                    .queryBuilder()
                    .where(IndiRelationModelDao.Properties.FollowId.eq(id))
                    .list();
    }


    public static List<IndiRelationModel> queryForFollowRelation(int id){
        return DaoManager.getDaoInstance().getDaoSession().getIndiRelationModelDao()
                .queryBuilder()
                .where(IndiRelationModelDao.Properties.StarId.eq(id))
                .list();
    }

    //清除掉关系表中的记录
    public static boolean removeRelation(Long id){
        try{
            DaoManager.getDaoInstance().getDaoSession().getIndiRelationModelDao()
                    .deleteByKey(id);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}