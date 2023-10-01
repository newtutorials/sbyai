public ResponseEntity<String> createResource() {
    // Perform resource creation logic
    // ...
    
    return ResponseEntity.status(HttpStatus.CREATED).body("Resource created successfully");
}
