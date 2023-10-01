import org.bouncycastle.bcpg.ArmoredOutputStream;
import org.bouncycastle.openpgp.*;

import java.io.FileOutputStream;
import java.security.SecureRandom;

public class KeyPairGenerator {

    public static void generateKeyPair(String publicKeyFile, String privateKeyFile, String userId, char[] passphrase) throws Exception {
        // Generate Key Pair
        KeyPairGenerator keyPairGenerator = new KeyPairGenerator();
        PGPKeyPair keyPair = keyPairGenerator.generateKeyPair(userId, passphrase);

        // Export Public Key
        try (ArmoredOutputStream publicKeyStream = new ArmoredOutputStream(new FileOutputStream(publicKeyFile))) {
            keyPair.getPublicKey().encode(publicKeyStream);
        }

        // Export Private Key
        try (ArmoredOutputStream privateKeyStream = new ArmoredOutputStream(new FileOutputStream(privateKeyFile))) {
            keyPair.getPrivateKey().encode(privateKeyStream);
        }
    }

    private PGPKeyPair generateKeyPair(String userId, char[] passphrase) throws Exception {
        // Generate Key Pair
        RSAKeyPairGenerator keyPairGenerator = new RSAKeyPairGenerator();
        keyPairGenerator.init(new RSAKeyGenerationParameters(
                new BigInteger("10001", 16), SecureRandom.getInstanceStrong()));
        PGPKeyPair keyPair = new PGPKeyPair(
                PGPPublicKey.RSA_GENERAL,
                keyPairGenerator.generateKeyPair(),
                new Date()
        );

        // Add User ID and Passphrase
        keyPair.getPublicKey().getUserIDs().add(userId);
        keyPair.getPublicKey().sign();
        keyPair.getPrivateKey().sign();

        // Protect Private Key with Passphrase
        return keyPair.encrypt(passphrase, "BC");
    }
}
