package org.superjms.config.database;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.database
 * @ClassName DataBase
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:40
 * @Description TODO
 */
public class DataBase {
    /**
     * The Ref file.
     */
    private String _refFile;
    /**
     * The Db file.
     */
    /*数据库文件引用路径*/
    private String _dbFile;

    /**
     * Instantiates a new Data base.
     */
    public DataBase() {
    }

    /**
     * Instantiates a new Data base.
     *
     * @param _refFile the ref file
     * @param _dbFile  the db file
     */
    public DataBase(String _refFile, String _dbFile) {
        this._refFile = _refFile;
        this._dbFile = _dbFile;
    }

    /**
     * Gets ref file.
     *
     * @return the ref file
     */
    public String get_refFile() {
        return _refFile;
    }

    /**
     * Sets ref file.
     *
     * @param _refFile the ref file
     */
    public void set_refFile(String _refFile) {
        this._refFile = _refFile;
    }

    /**
     * Gets db file.
     *
     * @return the db file
     */
    public String get_dbFile() {
        return _dbFile;
    }

    /**
     * Sets db file.
     *
     * @param _dbFile the db file
     */
    public void set_dbFile(String _dbFile) {
        this._dbFile = _dbFile;
    }
}
