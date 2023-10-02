User user = new User();
user.setName("John Doe");
user.setRole(Role.ADMIN);
userRepository.save(user);
