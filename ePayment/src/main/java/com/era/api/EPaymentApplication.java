package com.era.api;

import com.era.api.util.EncryptDecrypt;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.security.MessageDigest;


import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class EPaymentApplication {



	public static void main(String[] args) {
		SpringApplication.run(EPaymentApplication.class, args);
//		String epayId = "aElYaeYHyWhxvsMmvqfeOJsCjochQtn4Pk1/8rlmni4CEGoha7Vo+MAlCqDnKzyFYDvySGgA1W/NGJl0r8zrsWo4kpBSAKzYnm4SkDcXf6YwUlCwiHa4Dpi4rV2wTx/iCBmz6VG8sEjUjdwmN4eLkQ==";
//		String secretKey = "";
//		String decryptedValue = EncryptDecrypt.decryptWithIV(epayId, secretKey);
//		System.out.println("decrypted data =====" + decryptedValue);




	}

}
