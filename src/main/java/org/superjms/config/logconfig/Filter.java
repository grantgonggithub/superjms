package org.superjms.config.logconfig;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.logconfig
 * @ClassName Filter
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:43
 * @Description TODO
 */
public class Filter {
    /**
     * The Filter group.
     */
    private String _filterGroup;
    /**
     * The Filter api name.
     */
    private String _filterApiName;
    /**
     * The Filter service name.
     */
    private String _filterServiceName;
    /**
     * The Filter words.
     */
    private String _filterWords;
    /**
     * The Log level.
     */
    private String _logLevel;
    /**
     * The Max size.
     */
    private int _maxSize;

    /**
     * Instantiates a new Filter.
     */
    public Filter() {
    }

    /**
     * Instantiates a new Filter.
     *
     * @param _filterGroup       the filter group
     * @param _filterApiName     the filter api name
     * @param _filterServiceName the filter service name
     * @param _filterWords       the filter words
     * @param _logLevel          the log level
     * @param _maxSize           the max size
     */
    public Filter(String _filterGroup, String _filterApiName, String _filterServiceName, String _filterWords, String _logLevel, int _maxSize) {
        this._filterGroup = _filterGroup;
        this._filterApiName = _filterApiName;
        this._filterServiceName = _filterServiceName;
        this._filterWords = _filterWords;
        this._logLevel = _logLevel;
        this._maxSize = _maxSize;
    }

    /**
     * Gets filter group.
     *
     * @return the filter group
     */
    public String get_filterGroup() {
        return _filterGroup;
    }

    /**
     * Sets filter group.
     *
     * @param _filterGroup the filter group
     */
    public void set_filterGroup(String _filterGroup) {
        this._filterGroup = _filterGroup;
    }

    /**
     * Gets filter api name.
     *
     * @return the filter api name
     */
    public String get_filterApiName() {
        return _filterApiName;
    }

    /**
     * Sets filter api name.
     *
     * @param _filterApiName the filter api name
     */
    public void set_filterApiName(String _filterApiName) {
        this._filterApiName = _filterApiName;
    }

    /**
     * Gets filter service name.
     *
     * @return the filter service name
     */
    public String get_filterServiceName() {
        return _filterServiceName;
    }

    /**
     * Sets filter service name.
     *
     * @param _filterServiceName the filter service name
     */
    public void set_filterServiceName(String _filterServiceName) {
        this._filterServiceName = _filterServiceName;
    }

    /**
     * Gets filter words.
     *
     * @return the filter words
     */
    public String get_filterWords() {
        return _filterWords;
    }

    /**
     * Sets filter words.
     *
     * @param _filterWords the filter words
     */
    public void set_filterWords(String _filterWords) {
        this._filterWords = _filterWords;
    }

    /**
     * Gets log level.
     *
     * @return the log level
     */
    public String get_logLevel() {
        return _logLevel;
    }

    /**
     * Sets log level.
     *
     * @param _logLevel the log level
     */
    public void set_logLevel(String _logLevel) {
        this._logLevel = _logLevel;
    }

    /**
     * Gets max size.
     *
     * @return the max size
     */
    public int get_maxSize() {
        return _maxSize;
    }

    /**
     * Sets max size.
     *
     * @param _maxSize the max size
     */
    public void set_maxSize(int _maxSize) {
        this._maxSize = _maxSize;
    }
}
