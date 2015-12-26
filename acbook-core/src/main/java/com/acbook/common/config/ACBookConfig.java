package com.acbook.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ACBookConfig {

    @Value("${daoType}")
    private String daoType;

    /**
     * Get Configured DaoType
     * @return DaoType (Moc, InnerDB, OuterDB)
     */
    public String getDaoType() {
        return daoType;
    }

    /**
     * Set Configured DaoType
     * @param DaoType (Moc, InnerDB, OuterDB)
     */
    public void setDaoType(String daoType) {
        this.daoType = daoType;
    }

}
