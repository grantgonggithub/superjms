package org.superjms.config.rabbitmq;

/**
 * Copyright (C) 2022 SuperJMS (Grant 巩建春)  本软件的所有源码都可以免费的进行学习交流,切勿用于商业用途
 *
 * @ProductName superjms
 * @PackageName org.superjms.config.rabbitmq
 * @ClassName HostItem
 * @Author grant (巩建春 e-mail : nnn987@126.com ;  QQ:406333743;   Tel:+86  15619212255)
 * @Date 2022 /11/23 上午11:53
 * @Description TODO
 */
public class HostItem {
    /**
     * The Name.
     */
    private String _name;
    /**
     * The Ip.
     */
    private String _ip;
    /**
     * The Port.
     */
    private int _port;
    /**
     * The User name.
     */
    private String _userName;
    /**
     * The Pass word.
     */
    private String _passWord;
    /**
     * The No ack msg count.
     */
    /*最大允许未Ack的消息数量*/
    private int _noAckMsgCount;

    /**
     * Instantiates a new Host item.
     */
    public HostItem() {
    }

    /**
     * Instantiates a new Host item.
     *
     * @param _name          the name
     * @param _ip            the ip
     * @param _port          the port
     * @param _userName      the user name
     * @param _passWord      the pass word
     * @param _noAckMsgCount the no ack msg count
     */
    public HostItem(String _name, String _ip, int _port, String _userName, String _passWord, int _noAckMsgCount) {
        this._name = _name;
        this._ip = _ip;
        this._port = _port;
        this._userName = _userName;
        this._passWord = _passWord;
        this._noAckMsgCount = _noAckMsgCount;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String get_name() {
        return _name;
    }

    /**
     * Sets name.
     *
     * @param _name the name
     */
    public void set_name(String _name) {
        this._name = _name;
    }

    /**
     * Gets ip.
     *
     * @return the ip
     */
    public String get_ip() {
        return _ip;
    }

    /**
     * Sets ip.
     *
     * @param _ip the ip
     */
    public void set_ip(String _ip) {
        this._ip = _ip;
    }

    /**
     * Gets port.
     *
     * @return the port
     */
    public int get_port() {
        return _port;
    }

    /**
     * Sets port.
     *
     * @param _port the port
     */
    public void set_port(int _port) {
        this._port = _port;
    }

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String get_userName() {
        return _userName;
    }

    /**
     * Sets user name.
     *
     * @param _userName the user name
     */
    public void set_userName(String _userName) {
        this._userName = _userName;
    }

    /**
     * Gets pass word.
     *
     * @return the pass word
     */
    public String get_passWord() {
        return _passWord;
    }

    /**
     * Sets pass word.
     *
     * @param _passWord the pass word
     */
    public void set_passWord(String _passWord) {
        this._passWord = _passWord;
    }

    /**
     * Gets no ack msg count.
     *
     * @return the no ack msg count
     */
    public int get_noAckMsgCount() {
        return _noAckMsgCount;
    }

    /**
     * Sets no ack msg count.
     *
     * @param _noAckMsgCount the no ack msg count
     */
    public void set_noAckMsgCount(int _noAckMsgCount) {
        this._noAckMsgCount = _noAckMsgCount;
    }
}
