package com.capstone.giba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HostRegistrationActivity extends AppCompatActivity {

    private final String digitRegex = "[0-9]+";
    private final String letterRegex = "[a-zA-Z]+";
    private EditText mEinEditText;
    private EditText mEmailEditText;
    private EditText mPasswordEditText;
    private EditText mFirstNameEditText;
    private EditText mLastNameEditText;
    private EditText mAddressEditText;
    private EditText mPhoneNumberEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mEinEditText = findViewById(R.id.editTextEin);
        mEmailEditText = findViewById(R.id.editTextEmail);
        mPasswordEditText = findViewById(R.id.editTextPassword);
        mFirstNameEditText = findViewById(R.id.editTextFirstName);
        mLastNameEditText = findViewById(R.id.editTextLastName);
        mAddressEditText = findViewById(R.id.editTextAddress);
        mPhoneNumberEditText = findViewById(R.id.editTextPhoneNumber);
    }

    // Validate Organization EIN
    private boolean validateEin() {
        String inputEin = mEinEditText.getEditableText().toString().trim();

        if (inputEin.length() != 9) {
            mEinEditText.setError("EIN must be 9 numbers.");
            return false;
        }
        else if (!inputEin.matches(digitRegex)) {
            mEinEditText.setError("EIN may only contain digits.");
            return false;
        }
        else if (inputEin.isEmpty()) {
            mEinEditText.setError("Field must not be empty.");
            return false;
        }
        else {
            return true;
        }
    } // End validateEin

    // Validate Host Email
    private boolean validateEmail() {
        String inputEmail = mEmailEditText.getEditableText().toString().trim();

        if (inputEmail.isEmpty()) {
            mEmailEditText.setError("Field must not be empty.");
            return false;
        }
        else {
            return true;
        }
    } // end validateEmail

    // Validate Host Password
    private boolean validatePassword() {
        String inputPassword = mPasswordEditText.getEditableText().toString().trim();

        if (inputPassword.isEmpty()) {
            mPasswordEditText.setError("Field must not be empty.");
            return false;
        }
        else {
            return true;
        }
    } // end validatePassword

    // Validate Host First Name
    private boolean validateFirstName() {
        String inputFirstName = mFirstNameEditText.getEditableText().toString().trim();

        if (inputFirstName.isEmpty()) {
            mFirstNameEditText.setError("Field must not be empty.");
            return false;
        } else if (!inputFirstName.matches(letterRegex)) {
            mFirstNameEditText.setError("Field must only contain letters.");
            return false;
        } else {
            return true;
        }
    } // end validateFirstName

    // Validate Host Last Name
    private boolean validateLastName() {
        String inputLastName = mLastNameEditText.getEditableText().toString().trim();

        if (inputLastName.isEmpty()) {
            mLastNameEditText.setError("Field must not be empty.");
            return false;
        }
        else if (!inputLastName.matches(letterRegex)) {
            mLastNameEditText.setError("Field must only contain letters.");
            return false;
        }
        else {
            return true;
        }
    } // end validateLastName

    // Validate Host Address
    private boolean validateAddress() {
        String inputAddress = mAddressEditText.getEditableText().toString().trim();

        if (inputAddress.isEmpty()) {
            mAddressEditText.setError("Field must not be empty.");
            return false;
        }
        else {
            return true;
        }
    } // end validateAddress

    // Validate Phone Number
    private boolean validatePhoneNumber() {
        String inputPhoneNumber = mPhoneNumberEditText.getEditableText().toString().trim();

        if (inputPhoneNumber.isEmpty()) {
            mPhoneNumberEditText.setError("Field must not be empty.");
            return false;
        }
        else {
            return true;
        }
    } // end validatePhoneNumber

    // Confirm User Input
    public void confirmInput(View v) {
        if (!validateAddress() | !validateEin() | !validateEmail() | !validateFirstName()
                | !validateLastName() | !validatePassword() | !validatePhoneNumber()) {
            return;
        }
    } // end confirmInput
}
