package org.example12.CustomExceptions;

public class JsonFileUsageException extends FrameworkException {

  public JsonFileUsageException(String message) {
    super(message);
  }

  public JsonFileUsageException(String message, Throwable t) {
    super(message, t);
  }
}