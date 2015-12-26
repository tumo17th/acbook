package com.acbook.service;

/**
 * Marker Interface of Service of ACBook
 * ACBook専用の、Service用マーカーインターフェース
 * 
 * @author tumo
 */
public interface IService {
    /**
     * Initialize Service class.
     *  >> Inject instance of Dao class.
     */
    void initialize();
}
