package project.cn.edu.tongji.sse.nowfitness.greendao.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import project.cn.edu.tongji.sse.nowfitness.model.IndiInfoModel;
import project.cn.edu.tongji.sse.nowfitness.model.IndiRelationModel;
import project.cn.edu.tongji.sse.nowfitness.model.UserInfoModel;
import project.cn.edu.tongji.sse.nowfitness.model.StepModel;
import project.cn.edu.tongji.sse.nowfitness.model.Token;

import project.cn.edu.tongji.sse.nowfitness.greendao.db.IndiInfoModelDao;
import project.cn.edu.tongji.sse.nowfitness.greendao.db.IndiRelationModelDao;
import project.cn.edu.tongji.sse.nowfitness.greendao.db.UserInfoModelDao;
import project.cn.edu.tongji.sse.nowfitness.greendao.db.StepModelDao;
import project.cn.edu.tongji.sse.nowfitness.greendao.db.TokenDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig indiInfoModelDaoConfig;
    private final DaoConfig indiRelationModelDaoConfig;
    private final DaoConfig userInfoModelDaoConfig;
    private final DaoConfig stepModelDaoConfig;
    private final DaoConfig tokenDaoConfig;

    private final IndiInfoModelDao indiInfoModelDao;
    private final IndiRelationModelDao indiRelationModelDao;
    private final UserInfoModelDao userInfoModelDao;
    private final StepModelDao stepModelDao;
    private final TokenDao tokenDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        indiInfoModelDaoConfig = daoConfigMap.get(IndiInfoModelDao.class).clone();
        indiInfoModelDaoConfig.initIdentityScope(type);

        indiRelationModelDaoConfig = daoConfigMap.get(IndiRelationModelDao.class).clone();
        indiRelationModelDaoConfig.initIdentityScope(type);

        userInfoModelDaoConfig = daoConfigMap.get(UserInfoModelDao.class).clone();
        userInfoModelDaoConfig.initIdentityScope(type);

        stepModelDaoConfig = daoConfigMap.get(StepModelDao.class).clone();
        stepModelDaoConfig.initIdentityScope(type);

        tokenDaoConfig = daoConfigMap.get(TokenDao.class).clone();
        tokenDaoConfig.initIdentityScope(type);

        indiInfoModelDao = new IndiInfoModelDao(indiInfoModelDaoConfig, this);
        indiRelationModelDao = new IndiRelationModelDao(indiRelationModelDaoConfig, this);
        userInfoModelDao = new UserInfoModelDao(userInfoModelDaoConfig, this);
        stepModelDao = new StepModelDao(stepModelDaoConfig, this);
        tokenDao = new TokenDao(tokenDaoConfig, this);

        registerDao(IndiInfoModel.class, indiInfoModelDao);
        registerDao(IndiRelationModel.class, indiRelationModelDao);
        registerDao(UserInfoModel.class, userInfoModelDao);
        registerDao(StepModel.class, stepModelDao);
        registerDao(Token.class, tokenDao);
    }
    
    public void clear() {
        indiInfoModelDaoConfig.clearIdentityScope();
        indiRelationModelDaoConfig.clearIdentityScope();
        userInfoModelDaoConfig.clearIdentityScope();
        stepModelDaoConfig.clearIdentityScope();
        tokenDaoConfig.clearIdentityScope();
    }

    public IndiInfoModelDao getIndiInfoModelDao() {
        return indiInfoModelDao;
    }

    public IndiRelationModelDao getIndiRelationModelDao() {
        return indiRelationModelDao;
    }

    public UserInfoModelDao getUserInfoModelDao() {
        return userInfoModelDao;
    }

    public StepModelDao getStepModelDao() {
        return stepModelDao;
    }

    public TokenDao getTokenDao() {
        return tokenDao;
    }

}
