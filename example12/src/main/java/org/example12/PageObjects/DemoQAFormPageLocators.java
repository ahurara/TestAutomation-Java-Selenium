package org.example12.PageObjects;

import org.example12.Enums.DemoQAEnums;
import org.example12.constants.FrameworkPathConstants;

import static org.example12.ConfigLoaders.JsonUtils.getValue;

public class DemoQAFormPageLocators {
    public static final String firstNameLocator = getValue(DemoQAEnums.FIRST_NAME, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String lastNameLocator = getValue(DemoQAEnums.LAST_NAME, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String emailLocator = getValue(DemoQAEnums.EMAIL, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String phoneNumberLocator = getValue(DemoQAEnums.PHONE_NUMBER, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String currentAddressLocator = getValue(DemoQAEnums.CURRENT_ADDRESS, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String dateOfBirthLocator = getValue(DemoQAEnums.DATE_OF_BIRTH, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String uploadPictureLocator = getValue(DemoQAEnums.UPLOAD_PICTURE, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String subjectLocator = getValue(DemoQAEnums.SUBJECT, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String sportsLocator = getValue(DemoQAEnums.SPORTS, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String selectStateLocator = getValue(DemoQAEnums.SELECT_STATE, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String selectCityLocator = getValue(DemoQAEnums.SELECT_CITY, FrameworkPathConstants.LOCATORS_FILE_PATH);
    public static final String submitBtnLocator = getValue(DemoQAEnums.SUBMIT_BTN, FrameworkPathConstants.LOCATORS_FILE_PATH);
}
