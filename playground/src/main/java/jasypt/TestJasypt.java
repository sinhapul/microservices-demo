package jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

public class TestJasypt {

    public static void main(String[] args) {

        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        standardPBEStringEncryptor.setPassword("Demo_Pwd!2020");
        standardPBEStringEncryptor.setAlgorithm("PBEWithHMACSHA512AndAES_256");
        standardPBEStringEncryptor.setIvGenerator(new RandomIvGenerator());
       String result = standardPBEStringEncryptor.encrypt("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");
        //String result = standardPBEStringEncryptor.encrypt("580d7381-128e-4c52-9540-1eb0d32ffdbc");
        System.out.println(result);
        System.out.println(standardPBEStringEncryptor.decrypt(result));

    }
}
