import org.bouncycastle.bcpg.ArmoredInputStream;
import org.bouncycastle.bcpg.ArmoredOutputStream;
import org.bouncycastle.openpgp.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.SecureRandom;

public class PgpEncryptor {

    public static void encryptFile(String inputFile, String outputFile, String publicKeyFile) throws Exception {
        // Load Public Key
        try (ArmoredInputStream publicKeyStream = new ArmoredInputStream(new FileInputStream(publicKeyFile))) {
            PGPPublicKeyRing publicKeyRing = new PGPPublicKeyRing(publicKeyStream);
            PGPPublicKey publicKey = publicKeyRing.getPublicKey();

            // Encrypt Input File
            try (ArmoredOutputStream encryptedStream = new ArmoredOutputStream(new FileOutputStream(outputFile))) {
                encryptData(inputFile, encryptedStream, publicKey);
            }
        }
    }

    private static void encryptData(String inputFile, ArmoredOutputStream outputStream, PGPPublicKey publicKey) throws Exception {
        byte[] buffer = new byte[4096];
        int bytesRead;

        // Initialize PGP Encrypted Data Generator
        PGPEncryptedDataGenerator encryptedDataGenerator = new PGPEncryptedDataGenerator(
                new JcePGPDataEncryptorBuilder(PGPEncryptedData.CAST5)
                        .setSecureRandom(new SecureRandom())
                        .setProvider("BC"));

        encryptedDataGenerator.addMethod(new JcePublicKeyKeyEncryptionMethodGenerator(publicKey));

        // Open the Input File
        try (FileInputStream inputStream = new FileInputStream(inputFile)) {
            // Open the Output Stream
            try (OutputStream encryptedOutputStream = encryptedDataGenerator.open(outputStream, buffer)) {
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    encryptedOutputStream.write(buffer, 0, bytesRead);
                }
            }
        }

        encryptedOutputStream.close();
    }
}
