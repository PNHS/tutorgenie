package com.quickconnect.tutorgenie.view.api;

/**
 * Created by rahulsale on 11/8/17.
 */

public interface SingUpView {

    void signUpSuccess();
    void registrationCodeError(String codeErrorMessage);
    void handleNetworkError(String networkError);

}
