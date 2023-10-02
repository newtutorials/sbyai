User user = userRepository.findById(1L).orElse(null);
if (user != null) {
    if (user.getRole() == Role.ADMIN) {
        // Perform admin-specific logic
    } else if (user.getRole() == Role.USER) {
        // Perform user-specific logic
    } else {
        // Perform guest-specific logic
    }
}
