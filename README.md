# pdf

### pdf 加水印

+ 实现类：WaterMarker

### pdf 加盖印章

   1. 生成密钥:<br>
    `keytool -genkeypair -alias jyx -keypass jyx123456 -storepass jyx123456 -dname "C=CN,ST=SD,L=QD,O=haier,OU=dev,CN=runoob.com" -keyalg RSA -keysize 2048 -validity 3650 -keystore E:\pdf\server.keystore`
   2. 转换密钥为p12格式:<br>
    `keytool -importkeystore -srckeystore E:\pdf\server.keystore -destkeystore E:\pdf\jyx.p12 -srcalias jyx -destalias serverkey -srcstoretype pkcs12 -srcstorepass jyx123456 -deststorepass jyx123456 -noprompt`
   
