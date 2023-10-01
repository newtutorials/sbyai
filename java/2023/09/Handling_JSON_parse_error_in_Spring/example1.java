@ExceptionHandler(HttpMessageNotReadableException.class)
@ResponseBody
public ResponseEntity<String> handleJsonParseException(HttpMessageNotReadableException ex) {
    // Custom error handling logic
    return new ResponseEntity<>("Invalid JSON format", HttpStatus.BAD_REQUEST);
}
