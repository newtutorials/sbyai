public static void main(String[] args) throws Exception {
    String publicKeyFile = "public.asc";
    String privateKeyFile = "private.asc";
    String userId = "John Doe <john.doe@example.com>";
    char[] passphrase = "mySecretPassphrase".toCharArray();

    KeyPairGenerator.generateKeyPair(publicKeyFile, privateKeyFile, userId, passphrase);
}
