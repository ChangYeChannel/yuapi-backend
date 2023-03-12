package com.yupi.yuapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * 签名工具
 */
public class SignUtils {
    /**
     * 生成签名
     * @param body
     * @param secretKey
     * @return
     */
    public static String genSign(String body, String secretKey) {
        Digester SHA = new Digester(DigestAlgorithm.SHA256);
        String content = body + "." + secretKey;
        return SHA.digestHex(content);
    }
}
