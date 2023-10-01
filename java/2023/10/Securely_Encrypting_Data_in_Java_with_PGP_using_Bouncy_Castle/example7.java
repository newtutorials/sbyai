public static void main(String[] args) throws Exception {
    String inputFile = "plaintext.txt";
    String outputFile = "encrypted.asc";
    String publicKeyFile = "public.asc";

    PgpEncryptor.encryptFile(inputFile, outputFile, publicKeyFile);
}
