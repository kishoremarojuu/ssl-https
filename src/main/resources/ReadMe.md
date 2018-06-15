https://www.drissamri.be/blog/java/enable-https-in-spring-boot/

follow this link for setting up secure conection over https in local tomcat 


command to generate keytool:

you could either go with JKS type or PKCS12 

keytool -genkey -alias tomcat -storetype JKS -keyalg RSA -keysize 2048 -keystore keystore.jks -validity 3650