public ResponseEntity<String> handleRequest() {
    ResponseEntity<String> responseEntity = createResource();
    
    if (responseEntity.getStatusCode() == HttpStatus.CREATED) {
        // Resource created successfully
        String responseMessage = responseEntity.getBody();
        // ...
    }
    else {
        // Handle other status codes
        // ...
    }
}
