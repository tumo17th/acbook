package com.acbook.rest.response;

import java.util.ArrayList;
import java.util.List;

public class ACBookResponse {

    private Boolean sucessFlg;

    private List<String> messages = new ArrayList<>();

    // Constructor /////////////////////////////////////////////////////////////////////////////////////////////////////
    public ACBookResponse() {
    }

    public ACBookResponse(Boolean sucessFlg, List<String> messages) {
        this.sucessFlg = sucessFlg;
        this.messages = messages;
    }

    // Getter & Setter /////////////////////////////////////////////////////////////////////////////////////////////////
    public Boolean getSucessFlg() {
        return sucessFlg;
    }
    public void setSucessFlg(Boolean sucessFlg) {
        this.sucessFlg = sucessFlg;
    }
    public List<String> getMessages() {
        return messages;
    }
    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
