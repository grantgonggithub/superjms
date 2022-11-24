package org.superjms.config.logconfig;

import java.util.List;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.logconfig
 * @ClassName LogConfig
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:43
 * @Description TODO
 */
public class LogConfig {
    /**
     * The Log location.
     */
    private String _logLocation;
    /**
     * The Show console.
     */
    private int _showConsole;
    /**
     * The Log last error.
     */
    private int _logLastError;
    /**
     * The Log level.
     */
    /*日志过滤级别*/
    private String _logLevel;
    /**
     * The Filter.
     */
    private List<Filter> _filter;

    /**
     * Instantiates a new Log config.
     */
    public LogConfig() {
    }

    /**
     * Instantiates a new Log config.
     *
     * @param _logLocation  the log location
     * @param _showConsole  the show console
     * @param _logLastError the log last error
     * @param _logLevel     the log level
     * @param _filter       the filter
     */
    public LogConfig(String _logLocation, int _showConsole, int _logLastError, String _logLevel, List<Filter> _filter) {
        this._logLocation = _logLocation;
        this._showConsole = _showConsole;
        this._logLastError = _logLastError;
        this._logLevel = _logLevel;
        this._filter = _filter;
    }

    /**
     * Gets log location.
     *
     * @return the log location
     */
    public String get_logLocation() {
        return _logLocation;
    }

    /**
     * Sets log location.
     *
     * @param _logLocation the log location
     */
    public void set_logLocation(String _logLocation) {
        this._logLocation = _logLocation;
    }

    /**
     * Gets show console.
     *
     * @return the show console
     */
    public int get_showConsole() {
        return _showConsole;
    }

    /**
     * Sets show console.
     *
     * @param _showConsole the show console
     */
    public void set_showConsole(int _showConsole) {
        this._showConsole = _showConsole;
    }

    /**
     * Gets log last error.
     *
     * @return the log last error
     */
    public int get_logLastError() {
        return _logLastError;
    }

    /**
     * Sets log last error.
     *
     * @param _logLastError the log last error
     */
    public void set_logLastError(int _logLastError) {
        this._logLastError = _logLastError;
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
     * Gets filter.
     *
     * @return the filter
     */
    public List<Filter> get_filter() {
        return _filter;
    }

    /**
     * Sets filter.
     *
     * @param _filter the filter
     */
    public void set_filter(List<Filter> _filter) {
        this._filter = _filter;
    }
}
