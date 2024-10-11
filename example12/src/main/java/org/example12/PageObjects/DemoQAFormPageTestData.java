package org.example12.PageObjects;

import org.example12.Enums.DemoQAEnums;
import org.example12.constants.FrameworkPathConstants;

import static org.example12.ConfigLoaders.JsonUtils.getValue;

public class DemoQAFormPageTestData {
    public static final String firstNameTestData = getValue(DemoQAEnums.FIRST_NAME, FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String lastNameTestData = getValue(DemoQAEnums.LAST_NAME, FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String emailTestData = getValue(DemoQAEnums.EMAIL, FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String phoneNumberTestData = getValue(DemoQAEnums.PHONE_NUMBER, FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String currentAddressTestData = getValue(DemoQAEnums.CURRENT_ADDRESS, FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String dateOfBirthTestData = getValue(DemoQAEnums.DATE_OF_BIRTH, FrameworkPathConstants.TEST_DATA_FILE_PATH);
    public static final String subjectTestData = getValue(DemoQAEnums.SUBJECT, FrameworkPathConstants.TEST_DATA_FILE_PATH);

}
