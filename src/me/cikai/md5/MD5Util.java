package me.cikai.md5;

import java.security.MessageDigest;

public class MD5Util {
  /**
   * 把字节数组转成16进位制数
   *
   * @param bytes
   * @return
   */
  public static String bytesToHex(byte[] bytes) {
    StringBuffer md5str = new StringBuffer();
    // 把数组每一字节换成16进制连成md5字符串
    int digital;
    for (int i = 0; i < bytes.length; i++) {
      digital = bytes[i];
      if (digital < 0) {
        digital += 256;
      }
      if (digital < 16) {
        md5str.append("0");
      }
      md5str.append(Integer.toHexString(digital));
    }
    return md5str.toString();
  }

  /**
   * 把字节数组转换成md5
   *
   * @param input
   * @return
   */
  public static String bytesToMD5(byte[] input) {
    String md5str = null;
    try {
      // 创建一个提供信息摘要算法的对象，初始化为md5算法对象
      MessageDigest md = MessageDigest.getInstance("MD5");
      // 计算后获得字节数组
      byte[] buff = md.digest(input);
      // 把数组每一字节换成16进制连成md5字符串
      md5str = bytesToHex(buff);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return md5str;
  }

  /**
   * 将字符串进行md5加密
   *
   * @param str
   *          需要进行加密的字符串
   * @return 加密后的字符串
   */
  public static String strToMD5(String str) {
    byte[] input = str.getBytes();
    return bytesToMD5(input);
  }

  public static void main(String[] args) {
    System.out.println(strToMD5("cikai"));
  }
}