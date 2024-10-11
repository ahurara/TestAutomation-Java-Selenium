package org.example12.constants;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.File;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FrameworkPathConstants {

    public static final String PROJECT_PATH = System.getProperty("user.dir");

    public static final String TEST_RESOURCES_DIR = PROJECT_PATH + File.separator + "src/test/resources";

    public static final String LOCATORS_FILE_PATH =
            TEST_RESOURCES_DIR + File.separator + "locators.json";

    public static final String TEST_DATA_FILE_PATH =
            TEST_RESOURCES_DIR + File.separator + "testData.json";

}