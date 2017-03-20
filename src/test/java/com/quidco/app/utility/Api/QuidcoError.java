package com.quidco.app.utility.Api;

import java.util.List;

/**
 * Created by ashishmohindroo on 3/20/17.
 */
public class QuidcoError {
    public QuidcoError(List<ErrorMessage> errors) {
        this.errors = errors;
    }

    public List<ErrorMessage> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorMessage> errors) {
        this.errors = errors;
    }

    private List<ErrorMessage> errors;

}
