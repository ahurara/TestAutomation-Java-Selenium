package org.example12.ConfigLoaders;

import com.jayway.jsonpath.JsonPath;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.example12.CustomExceptions.InvalidPathException;
import org.example12.Enums.DemoQAEnums;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class JsonUtils {

  private static Map < String, String > map;

  public static String getValue(DemoQAEnums key, String filePath) {
    try {
      return JsonPath.read(new File(filePath), key.toString().toLowerCase());
    } catch (IOException e) {
      throw new InvalidPathException("Can't read file, check the config.json");
    }
  }


}