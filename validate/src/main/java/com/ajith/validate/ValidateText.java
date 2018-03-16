package com.ajith.validate;

import android.text.TextUtils;
import android.widget.EditText;

/**
 * Created by ganesa on 16/03/18.
 */

public class ValidateText {

    public static Boolean name(String name, EditText nameView) {
        if (!TextUtils.isEmpty(name)) {
            if (name.matches("[a-zA-Z]+([ '-][a-zA-Z.]+)*")) {
                return true;
            } else {
                nameView.setError("Name is not valid");
                return false;
            }
        } else {
            nameView.setError("Enter a Name");
        }
        return false;
    }

    public static Boolean mail(String mail, EditText mailView) {
        if (!TextUtils.isEmpty(mail)) {
            if (mail.matches("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
                return true;
            } else {
                mailView.setError("Email is not valid");
                return false;
            }
        } else {
            mailView.setError("Enter your email");
        }
        return false;
    }

    public static Boolean password(String passwordString, int min, int max, EditText passwordView) {
        if (!TextUtils.isEmpty(passwordString)) {
            if (min <= passwordString.length() && passwordString.length() <= max) {
                return true;
            } else {
                String s = "Password Must between " + min + " to " + max + " characters";
                passwordView.setError(s);
                return false;
            }
        } else {
            passwordView.setError("Enter password");

        }
        return false;
    }

    public static Boolean mobile(String phoneString, EditText mobile) {

        if (!TextUtils.isEmpty(phoneString)) {
            if (phoneString.length() == 10) {
                return true;
            } else {
                mobile.setError("Mobile number is not valid");
                return false;
            }
        } else {
            mobile.setError("Enter a mobile number");
        }
        return false;
    }

    public static Boolean pincode(String pinString, EditText pincode) {

        if (!TextUtils.isEmpty(pinString)) {


            if (pinString.length() == 6) {
                return true;
            } else {
                pincode.setError("Pin code is not valid");
                return false;
            }
        } else {
            pincode.setError("Enter your pin code");
        }
        return false;
    }


}


