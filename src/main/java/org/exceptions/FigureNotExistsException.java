package org.exceptions;

public class FigureNotExistsException extends RuntimeException {
  public FigureNotExistsException(String message) {super(message + " does not exists");}
}
